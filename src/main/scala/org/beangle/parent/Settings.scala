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
import xerial.sbt.Sonatype.autoImport.*
import xerial.sbt.Sonatype.sonatypeCentralHost

object Settings extends sbt.AutoPlugin {

  override def trigger = allRequirements

  val common = Seq(
    organizationName := "The Beangle Software",
    licenses += ("GNU Lesser General Public License version 3", url("http://www.gnu.org/licenses/lgpl-3.0.txt")),
    startYear := Some(2005),
    scalaVersion := "3.3.4",
    scalacOptions := Seq("-Xtarget:21", "-deprecation", "-feature"),
    javacOptions := Seq("--release", "21", "-encoding", "utf-8"),
    crossPaths := false,

    publishMavenStyle := true,
    publishConfiguration := publishConfiguration.value.withOverwrite(true),
    publishM2Configuration := publishM2Configuration.value.withOverwrite(true),
    publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true),

    versionScheme := Some("early-semver"),
    pomIncludeRepository := { _ => false }, // Remove all additional repository other than Maven Central from POM
    sonatypeProfileName    := "org.beangle",
    publishTo := sonatypePublishToBundle.value,
    sonatypeCredentialHost := sonatypeCentralHost,
    resolvers += Resolver.mavenLocal,
    addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.12.2")
  )
}
