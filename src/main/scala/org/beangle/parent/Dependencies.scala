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

object Dependencies extends sbt.AutoPlugin {

  val scalaxml = "org.scala-lang.modules" %% "scala-xml" % "2.3.0"

  val slf4j = "org.slf4j" % "slf4j-api" % "2.0.15"
  val jcl_over_slf4j = "org.slf4j" % "jcl-over-slf4j" % "2.0.15"
  val apache_commons_compress = "org.apache.commons" % "commons-compress" % "1.27.1"

  //web
  val servletapi = "jakarta.servlet" % "jakarta.servlet-api" % "6.0.0"
  var freemarker = "org.freemarker" % "freemarker" % "2.3.33"

  val gson = "com.google.code.gson" % "gson" % "2.11.0"
  //cdi
  val spring_beans = "org.springframework" % "spring-beans" % "6.1.12"
  val spring_context = "org.springframework" % "spring-context" % "6.1.12"
  val spring_tx = "org.springframework" % "spring-tx" % "6.1.12"
  val spring_aop = "org.springframework" % "spring-aop" % "6.1.12"
  val spring_jdbc = "org.springframework" % "spring-jdbc" % "6.1.12"
  val protobuf = "com.google.protobuf" % "protobuf-java" % "3.25.4"

  val hibernate_core = "org.beangle.hibernate" % "beangle-hibernate-core" % "6.4.9.Final"
  val hibernate_jcache = "org.hibernate.orm" % "hibernate-jcache" % "6.4.9.Final" exclude("org.hibernate.orm", "hibernate-core")
  val byte_buddy = "net.bytebuddy" % "byte-buddy" % "1.14.13"
  val javassist = "org.javassist" % "javassist" % "3.30.2-GA"
  val jpa = "jakarta.persistence" % "jakarta.persistence-api" % "3.1.0"

  val jna = "net.java.dev.jna" % "jna" % "5.14.0"

  //doc
  val poi = "org.apache.poi" % "poi" % "5.3.0"
  val poi_ooxml = "org.apache.poi" % "poi-ooxml" % "5.3.0"
  val itext_kernel = "com.itextpdf" % "kernel" % "8.0.4"
  val pdfbox = "org.apache.pdfbox" % "pdfbox" % "3.0.3"

  //cache
  val ehcache = "org.ehcache" % "ehcache" % "3.10.8"
  val caffeine = "com.github.ben-manes.caffeine" % "caffeine" % "3.1.8"
  val caffeine_jcache = "com.github.ben-manes.caffeine" % "jcache" % "3.1.8" exclude("org.osgi", "org.osgi.service.component.annotations") exclude("javax.inject", "javax.inject")

  val jgroups = "org.jgroups" % "jgroups" % "5.3.11.Final"
  val jedis = "redis.clients" % "jedis" % "5.1.5"
  val lettuce = "io.lettuce" % "lettuce-core" % "6.4.0.RELEASE"

  // network
  val netty_common = "io.netty" % "netty-common" % "4.1.113.Final"
  val netty_handler = "io.netty" % "netty-handler" % "4.1.113.Final"
  val netty_transport = "io.netty" % "netty-transport" % "4.1.113.Final"

  //mail
  val jakarta_mail_api = "jakarta.mail" % "jakarta.mail-api" % "2.1.3"
  val jakarta_mail_angus = "org.eclipse.angus" % "angus-mail" % "2.0.3"

  val plantuml = "net.sourceforge.plantuml" % "plantuml" % "1.2024.6"
  //test
  val scalatest = "org.scalatest" %% "scalatest" % "3.2.19" % "test"
  val mockito = "org.mockito" % "mockito-core" % "5.11.0" % "test"
  val greenmail = "com.icegreen" % "greenmail" % "2.1.0-rc-1" % "test"

  //script
  val aviator = "com.googlecode.aviator" % "aviator" % "5.4.3"
  val jexl3 = "org.apache.commons" % "commons-jexl3" % "3.4.0" exclude("commons-logging", "commons-logging")

  //runtime
  val logback_classic = "ch.qos.logback" % "logback-classic" % "1.5.7"
  val logback_core = "ch.qos.logback" % "logback-core" % "1.5.7"
  val postgresql = "org.postgresql" % "postgresql" % "42.7.4"
  val h2 = "com.h2database" % "h2" % "2.3.232"
  val HikariCP = "com.zaxxer" % "HikariCP" % "5.1.0"
  val jtds = "net.sourceforge.jtds" % "jtds" % "1.3.1"
  val ojdbc11 = "com.oracle.database.jdbc" % "ojdbc11" % "23.5.0.24.07"
  val orai18n = "com.oracle.database.nls" % "orai18n" % "23.5.0.24.07"
  val mysql_connector_java = "com.mysql" % "mysql-connector-j" % "9.0.0"
  val mssql_jdbc = "com.microsoft.sqlserver" % "mssql-jdbc" % "12.8.1.jre11"

  val tomcat_embed_core = "org.apache.tomcat.embed" % "tomcat-embed-core" % "10.1.28"
  val io_undertow_core = "io.undertow" % "undertow-core" % "2.3.17.Final"
  val io_undertow_servlet = "io.undertow" % "undertow-servlet" % "2.3.17.Final"

  override def trigger = allRequirements

}
