import BuildSettings._
import sbt._

ThisBuild / version := "0.8.6"
ThisBuild / description := "Beangle Parent."
ThisBuild / organization := "org.beangle.parent"
ThisBuild / homepage := Some(url("https://github.com/beangle/parent"))
ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/beangle/bom"),
    "scm:git@github.com:beangle/parent.git"
  )
)

ThisBuild / developers := List(
  Developer(
    id = "duantihua",
    name = "Duan Tihua",
    email = "duantihua@163.com",
    url = url("https://github.com/duantihua")
  )
)

lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "sbt-beangle-parent",
    commonSettings
  )
