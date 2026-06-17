/*
 * Copyright © 2005, The Beangle Software.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.beangle.parent

import sbt.*
import sbt.Keys.*
import sbtversionpolicy.SbtVersionPolicyPlugin.autoImport.{Compatibility, versionPolicyIntention}

object Settings extends sbt.AutoPlugin {

  override def trigger = allRequirements

  /** 仅打包 README 占位文件，满足 Maven Central 对 -javadoc.jar 的要求，避免生成完整 Scaladoc。 */
  val stubJavadoc: Seq[Def.Setting[_]] = Seq(
    Compile / doc / sources := Nil,
    Compile / packageDoc := {
      val out = (Compile / packageDoc / artifactPath).value
      val dir = (Compile / target).value / "stub-javadoc"
      IO.createDirectory(dir)
      val docUrl = homepage.value.map(_.toString).getOrElse("https://beangle.github.io/")
      IO.write(
        dir / "README.md",
        s"""# No bundled API documentation
           |
           |Documentation: $docUrl
           |Source code: `-sources.jar`
           |""".stripMargin
      )
      val manifest = new java.util.jar.Manifest()
      manifest.getMainAttributes.put(java.util.jar.Attributes.Name.MANIFEST_VERSION, "1.0")
      val mappings = (dir ** "*").get pair Path.rebase(dir, "")
      IO.jar(mappings, out, manifest, Some(0L))
      out
    }
  )

  val common = stubJavadoc ++ Seq(
    organizationName := "The Beangle Software",
    licenses += ("GNU Lesser General Public License version 3", url("http://www.gnu.org/licenses/lgpl-3.0.txt")),
    startYear := Some(2005),
    scalaVersion := "3.3.7",
    scalacOptions := Seq("-Xtarget:21", "-deprecation", "-feature"),
    javacOptions := Seq("--release", "21", "-encoding", "utf-8"),
    crossPaths := false,

    publishMavenStyle := true,
    publishConfiguration := publishConfiguration.value.withOverwrite(true),
    publishM2Configuration := publishM2Configuration.value.withOverwrite(true),
    publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true),

    versionScheme := Some("early-semver"),
    pomIncludeRepository := { _ => false }, // Remove all additional repository other than Maven Central from POM
    credentials += Credentials(Path.userHome / ".sbt" / "sonatype_central_credentials"),
    publishTo := localStaging.value,
    resolvers += Resolver.mavenLocal,
    versionPolicyIntention := Compatibility.BinaryAndSourceCompatible,
    //只发布强依赖的库
    pomPostProcess := { (rootNode: xml.Node) =>
      def processNode(node: xml.Node): xml.Node = node match {
        case e: xml.Elem if e.label == "dependencies" =>
          val filted = e.child.filter {
            case dep: xml.Elem if dep.label == "dependency" =>
              val scope = (dep \ "scope").text
              val optional = (dep \ "optional").text
              !scope.equals("test") && !optional.equals("true")
            case _ => true
          }
          e.copy(child = filted.map(processNode))

        case e: xml.Elem => e.copy(child = e.child.map(processNode))
        case other => other
      }

      processNode(rootNode)
    }
  )
}
