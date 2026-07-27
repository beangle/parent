import BuildSettings.*
import sbt.*

version := "0.16.0-SNAPSHOT"
description := "Beangle Parent."
organization := "org.beangle.parent"
homepage := Some(uri("https://github.com/beangle/parent"))
scmInfo := Some(
  ScmInfo(
    uri("https://github.com/beangle/bom"),
    "scm:git@github.com:beangle/parent.git"
  )
)

developers := List(
  Developer(
    id = "duantihua",
    name = "Duan Tihua",
    email = "duantihua@163.com",
    url = uri("https://github.com/duantihua")
  )
)

lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "sbt-beangle-parent",
    commonSettings
  )
