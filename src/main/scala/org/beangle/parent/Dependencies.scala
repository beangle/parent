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

import sbt.Keys._
import sbt._

object Dependencies extends sbt.AutoPlugin {

  val scalaxml = "org.scala-lang.modules" %% "scala-xml" % "2.0.1"

  val slf4j = "org.slf4j" % "slf4j-api" % "2.0.0-alpha4"
  val logback_classic = "ch.qos.logback" % "logback-classic" % "1.3.0-alpha9"
  val logback_core = "ch.qos.logback" % "logback-core" % "1.3.0-alpha9"
  val apache_commons_compress = "org.apache.commons" % "commons-compress" % "1.21"

  val servletapi = "jakarta.servlet" % "jakarta.servlet-api" % "5.0.0"

  val scalatest = "org.scalatest" %% "scalatest" % "3.2.9" % "test"
  val mockito = "org.mockito" % "mockito-core" % "3.11.1" % "test"

  override def trigger = allRequirements

}
