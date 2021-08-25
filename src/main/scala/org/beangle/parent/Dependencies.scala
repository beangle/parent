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
  val apache_commons_compress = "org.apache.commons" % "commons-compress" % "1.21"


  //web
  val servletapi = "jakarta.servlet" % "jakarta.servlet-api" % "5.0.0"
  var freemarker = "org.freemarker" % "freemarker" % "2.3.31"

  //cdi
  val spring_beans ="org.springframework" % "spring-beans" % "5.3.6"
  val spring_context ="org.springframework" % "spring-context" % "5.3.6"
  val spring_tx = "org.springframework" % "spring-tx" % "5.3.6"
  val spring_aop = "org.springframework" % "spring-aop" % "5.3.6"
  val spring_jdbc = "org.springframework" % "spring-jdbc" % "5.3.6"
  val protobuf = "com.google.protobuf" % "protobuf-java" % "3.15.8"

  val hibernate_core = "org.beangle.hibernate" % "beangle-hibernate-core" % "5.5.6.Final"
  val hibernate_jcache = "org.hibernate" % "hibernate-jcache" % "5.5.6.Final"  % "test" exclude("org.hibernate","hibernate-core")
  val javassist = "org.javassist" % "javassist" % "3.27.0-GA"
  val jpa = "jakarta.persistence" % "jakarta.persistence-api" % "3.0.0"

  val poi = "org.apache.poi" % "poi" % "4.1.2"
  val jxls = "org.jxls" % "jxls" % "2.10.0"
  val jxls_poi = "org.jxls" % "jxls-poi" % "2.10.0"

  //cache
  val ehcache = "org.ehcache" % "ehcache" % "3.9.5"
  val caffeine = "com.github.ben-manes.caffeine" % "caffeine" % "3.0.3"
  val jgroups = "org.jgroups" % "jgroups" % "5.1.8.Final"
  val jedis = "redis.clients" % "jedis" % "3.6.3"

  //runtime
  val logback_classic = "ch.qos.logback" % "logback-classic" % "1.3.0-alpha9"  % "provided"
  val logback_core = "ch.qos.logback" % "logback-core" % "1.3.0-alpha9"  % "provided"

  //test
  val scalatest = "org.scalatest" %% "scalatest" % "3.2.9" % "test"
  val mockito = "org.mockito" % "mockito-core" % "3.11.1" % "test"
  val h2 ="com.h2database" %"h2"% "1.4.200" % "test"

  //provided
  val postgresql = "org.postgresql" % "postgresql" % "42.2.20" % "provided"
  val HikariCP = "com.zaxxer" % "HikariCP" % "4.0.3" % "provided"

  override def trigger = allRequirements

}
