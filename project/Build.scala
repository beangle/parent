import sbt.*
import sbt.Keys.*

object BuildSettings {

  val commonSettings = Seq(
    organizationName := "The Beangle Software",
    startYear := Some(2005),
    licenses += ("GNU General Public License version 3", url("http://www.gnu.org/licenses/lgpl-3.0.txt")),
    crossPaths := false,

    publishMavenStyle := true,
    publishConfiguration := publishConfiguration.value.withOverwrite(true),
    publishM2Configuration := publishM2Configuration.value.withOverwrite(true),
    publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true),

    versionScheme := Some("early-semver"),
    pomIncludeRepository := { _ => false }, // Remove all additional repository other than Maven Central from POM
    sbtPluginPublishLegacyMavenStyle := false,
    publishTo := localStaging.value,
    credentials += Credentials(Path.userHome / ".sbt" / "sonatype_central_credentials"),
    addSbtPlugin("ch.epfl.scala" % "sbt-version-policy" % "3.2.1"),
    addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.1"),
    addDependencyTreePlugin
  )
}
