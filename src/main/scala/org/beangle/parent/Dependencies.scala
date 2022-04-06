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

  val slf4j = "org.slf4j" % "slf4j-api" % "2.0.0-alpha7"
  val jcl_over_slf4j =  "org.slf4j" % "jcl-over-slf4j" % "2.0.0-alpha7"
  val apache_commons_compress = "org.apache.commons" % "commons-compress" % "1.21"

  //web
  val servletapi = "jakarta.servlet" % "jakarta.servlet-api" % "5.0.0"
  var freemarker = "org.freemarker" % "freemarker" % "2.3.31"

  val gson = "com.google.code.gson" % "gson" % "2.9.0"
  //some old library need jaxb for xml parsing(ehcache3)
  val jaxb = "javax.xml.bind" % "jaxb-api" % "2.3.1" exclude("xml-apis", "xml-apis")
  val jaxb_impl = "com.sun.xml.bind" % "jaxb-impl" % "2.3.5"
  //cdi
  val spring_beans = "org.springframework" % "spring-beans" % "5.3.18"
  val spring_context = "org.springframework" % "spring-context" % "5.3.18"
  val spring_tx = "org.springframework" % "spring-tx" % "5.3.18"
  val spring_aop = "org.springframework" % "spring-aop" % "5.3.18"
  val spring_jdbc = "org.springframework" % "spring-jdbc" % "5.3.18"
  val protobuf = "com.google.protobuf" % "protobuf-java" % "3.20.0"

  val hibernate_core = "org.beangle.hibernate" % "beangle-hibernate-core" % "5.6.7.Final"
  val hibernate_jcache = "org.hibernate" % "hibernate-jcache" % "5.6.7.Final" exclude("org.hibernate", "hibernate-core")
  val javassist = "org.javassist" % "javassist" % "3.28.0-GA"
  val jpa = "jakarta.persistence" % "jakarta.persistence-api" % "3.0.0"

  val jna = "net.java.dev.jna" % "jna" % "5.9.0"

  //doc
  val poi = "org.apache.poi" % "poi" % "4.1.2"
  val poi_ooxml = "org.apache.poi" % "poi-ooxml" % "4.1.2"
  val itextpdf = "com.itextpdf" % "itextpdf" % "5.5.13.2"
  val itext_asian = "com.itextpdf" % "itext-asian" % "5.2.0"
  val itext_xmlworker = "com.itextpdf.tool" % "xmlworker" % "5.5.13.2"
  val bcprov_jdk15to18 = "org.bouncycastle" % "bcprov-jdk15to18" % "1.69"
  val bcpkix_jdk15to18 = "org.bouncycastle" % "bcpkix-jdk15to18" % "1.69"

  //cache
  val ehcache = "org.ehcache" % "ehcache" % "3.10.0"
  val caffeine = "com.github.ben-manes.caffeine" % "caffeine" % "3.0.6"
  val jgroups = "org.jgroups" % "jgroups" % "5.2.2.Final"
  val jedis = "redis.clients" % "jedis" % "4.2.0"

  //mail
  val jakarta_mail_api = "jakarta.mail" % "jakarta.mail-api" % "2.0.1"
  val jakarta_mail = "com.sun.mail" % "jakarta.mail" % "2.0.1"

  val plantuml = "net.sourceforge.plantuml" % "plantuml" % "1.2022.2"
  //test
  val scalatest = "org.scalatest" %% "scalatest" % "3.2.11" % "test"
  val mockito = "org.mockito" % "mockito-core" % "3.12.4" % "test"
  val greenmail = "com.icegreen" % "greenmail" % "2.0.0-alpha-2" % "test"

  //runtime
  val logback_classic = "ch.qos.logback" % "logback-classic" % "1.3.0-alpha14"
  val logback_core = "ch.qos.logback" % "logback-core" % "1.3.0-alpha14"
  val postgresql = "org.postgresql" % "postgresql" % "42.3.3"
  val h2 = "com.h2database" % "h2" % "2.1.210"
  val HikariCP = "com.zaxxer" % "HikariCP" % "5.0.1"
  val jtds = "net.sourceforge.jtds" % "jtds" % "1.3.1"
  val ojdbc11 = "com.oracle.database.jdbc" % "ojdbc11" % "21.5.0.0"
  val orai18n = "com.oracle.database.nls" % "orai18n" % "21.5.0.0"
  val mysql_connector_java = "mysql" % "mysql-connector-java" % "8.0.28"
  val mssql_jdbc = "com.microsoft.sqlserver" % "mssql-jdbc" % "10.2.0.jre11"

  val tomcat_embed_core = "org.apache.tomcat.embed" % "tomcat-embed-core" % "10.0.20"
  val io_undertow = "io.undertow" % "undertow-core" % "2.2.17.Final"

  override def trigger = allRequirements

}
