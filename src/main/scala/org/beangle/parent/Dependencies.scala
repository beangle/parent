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

  val scalaxml = "org.scala-lang.modules" %% "scala-xml" % "2.1.0"

  val slf4j = "org.slf4j" % "slf4j-api" % "2.0.3"
  val jcl_over_slf4j =  "org.slf4j" % "jcl-over-slf4j" % "2.0.3"
  val apache_commons_compress = "org.apache.commons" % "commons-compress" % "1.21"

  //web
  val servletapi = "jakarta.servlet" % "jakarta.servlet-api" % "5.0.0"
  var freemarker = "org.freemarker" % "freemarker" % "2.3.31"

  val gson = "com.google.code.gson" % "gson" % "2.9.1"
  //some old library need jaxb for xml parsing(ehcache3)
  val jaxb = "javax.xml.bind" % "jaxb-api" % "2.3.1" exclude("xml-apis", "xml-apis")
  val jaxb_impl = "com.sun.xml.bind" % "jaxb-impl" % "2.3.6"
  //cdi
  val spring_beans = "org.springframework" % "spring-beans" % "5.3.23"
  val spring_context = "org.springframework" % "spring-context" % "5.3.23"
  val spring_tx = "org.springframework" % "spring-tx" % "5.3.23"
  val spring_aop = "org.springframework" % "spring-aop" % "5.3.23"
  val spring_jdbc = "org.springframework" % "spring-jdbc" % "5.3.23"
  val protobuf = "com.google.protobuf" % "protobuf-java" % "3.21.5"

  val hibernate_core = "org.beangle.hibernate" % "beangle-hibernate-core" % "5.6.8.Final"
  val hibernate_jcache = "org.hibernate" % "hibernate-jcache" % "5.6.8.Final" exclude("org.hibernate", "hibernate-core")
  val javassist = "org.javassist" % "javassist" % "3.29.0-GA"
  val jpa = "jakarta.persistence" % "jakarta.persistence-api" % "3.0.0"

  val jna = "net.java.dev.jna" % "jna" % "5.12.1"

  //doc
  val poi = "org.apache.poi" % "poi" % "4.1.2"
  val poi_ooxml = "org.apache.poi" % "poi-ooxml" % "4.1.2"
  val itextpdf = "com.itextpdf" % "itextpdf" % "5.5.13.3"
  val itext_asian = "com.itextpdf" % "itext-asian" % "5.2.0"
  val itext_xmlworker = "com.itextpdf.tool" % "xmlworker" % "5.5.13.3"
  val bcprov_jdk15to18 = "org.bouncycastle" % "bcprov-jdk15to18" % "1.71"
  val bcpkix_jdk15to18 = "org.bouncycastle" % "bcpkix-jdk15to18" % "1.71"

  //cache
  val ehcache = "org.ehcache" % "ehcache" % "3.10.1"
  val caffeine = "com.github.ben-manes.caffeine" % "caffeine" % "3.1.1"
  val jgroups = "org.jgroups" % "jgroups" % "5.2.4.Final"
  val jedis = "redis.clients" % "jedis" % "4.2.3"

  //mail
  val jakarta_mail_api = "jakarta.mail" % "jakarta.mail-api" % "2.0.1"
  val jakarta_mail = "com.sun.mail" % "jakarta.mail" % "2.0.1"

  val plantuml = "net.sourceforge.plantuml" % "plantuml" % "1.2022.7"
  //test
  val scalatest = "org.scalatest" %% "scalatest" % "3.2.13" % "test"
  val mockito = "org.mockito" % "mockito-core" % "4.7.0" % "test"
  val greenmail = "com.icegreen" % "greenmail" % "2.0.0-alpha-2" % "test"

  //runtime
  val logback_classic = "ch.qos.logback" % "logback-classic" % "1.4.3"
  val logback_core = "ch.qos.logback" % "logback-core" % "1.4.3"
  val postgresql = "org.postgresql" % "postgresql" % "42.5.0"
  val h2 = "com.h2database" % "h2" % "2.1.214"
  val HikariCP = "com.zaxxer" % "HikariCP" % "5.0.1"
  val jtds = "net.sourceforge.jtds" % "jtds" % "1.3.1"
  val ojdbc11 = "com.oracle.database.jdbc" % "ojdbc11" % "21.7.0.0"
  val orai18n = "com.oracle.database.nls" % "orai18n" % "21.7.0.0"
  val mysql_connector_java = "mysql" % "mysql-connector-java" % "8.0.30"
  val mssql_jdbc = "com.microsoft.sqlserver" % "mssql-jdbc" % "10.2.1.jre11"

  val tomcat_embed_core = "org.apache.tomcat.embed" % "tomcat-embed-core" % "10.0.23"
  val io_undertow_core = "io.undertow" % "undertow-core" % "2.2.18.Final"
  val io_undertow_servlet = "io.undertow" % "undertow-servlet-jakarta" % "2.2.18.Final"

  override def trigger = allRequirements

}
