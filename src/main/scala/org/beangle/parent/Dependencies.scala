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

import sbt._

object Dependencies extends sbt.AutoPlugin {

  val scalaxml = "org.scala-lang.modules" %% "scala-xml" % "2.1.0"

  val slf4j = "org.slf4j" % "slf4j-api" % "2.0.7"
  val jcl_over_slf4j =  "org.slf4j" % "jcl-over-slf4j" % "2.0.7"
  val apache_commons_compress = "org.apache.commons" % "commons-compress" % "1.23.0"

  //web
  val servletapi = "jakarta.servlet" % "jakarta.servlet-api" % "6.0.0"
  var freemarker = "org.freemarker" % "freemarker" % "2.3.32"

  val gson = "com.google.code.gson" % "gson" % "2.10.1"
  //cdi
  val spring_beans = "org.springframework" % "spring-beans" % "6.0.9"
  val spring_context = "org.springframework" % "spring-context" % "6.0.9"
  val spring_tx = "org.springframework" % "spring-tx" % "6.0.9"
  val spring_aop = "org.springframework" % "spring-aop" % "6.0.9"
  val spring_jdbc = "org.springframework" % "spring-jdbc" % "6.0.9"
  val protobuf = "com.google.protobuf" % "protobuf-java" % "3.23.2"

  val hibernate_core = "org.beangle.hibernate" % "beangle-hibernate-core" % "6.2.5.Final"
  val hibernate_jcache = "org.hibernate.orm" % "hibernate-jcache" % "6.2.5.Final" exclude("org.hibernate.orm", "hibernate-core")
  val byte_buddy = "net.bytebuddy" % "byte-buddy" % "1.12.23"
  val javassist = "org.javassist" % "javassist" % "3.29.2-GA"
  val jpa = "jakarta.persistence" % "jakarta.persistence-api" % "3.1.0"

  val jna = "net.java.dev.jna" % "jna" % "5.13.0"

  //doc
  val poi = "org.apache.poi" % "poi" % "5.2.3"
  val poi_ooxml = "org.apache.poi" % "poi-ooxml" % "5.2.3"
  val itextpdf = "com.itextpdf" % "itextpdf" % "5.5.13.3"
  val itext_asian = "com.itextpdf" % "itext-asian" % "5.2.0"
  val itext_xmlworker = "com.itextpdf.tool" % "xmlworker" % "5.5.13.3"
  val bcprov_jdk15to18 = "org.bouncycastle" % "bcprov-jdk15to18" % "1.73"
  val bcpkix_jdk15to18 = "org.bouncycastle" % "bcpkix-jdk15to18" % "1.73"

  //cache
  val ehcache = "org.ehcache" % "ehcache" % "3.10.8"
  val caffeine = "com.github.ben-manes.caffeine" % "caffeine" % "3.1.6"
  val caffeine_jcache = "com.github.ben-manes.caffeine" % "jcache" % "3.1.6" exclude("org.osgi", "org.osgi.service.component.annotations") exclude("javax.inject", "javax.inject")

  val jgroups = "org.jgroups" % "jgroups" % "5.2.14.Final"
  val jedis = "redis.clients" % "jedis" % "4.4.1"
  val lettuce = "io.lettuce" % "lettuce-core" % "6.2.4.RELEASE"

  // network
  val netty_common = "io.netty" % "netty-common" % "4.1.94.Final"
  val netty_handler = "io.netty" % "netty-handler" % "4.1.94.Final"
  val netty_transport = "io.netty" % "netty-transport" % "4.1.94.Final"

  //mail
  val jakarta_mail_api = "jakarta.mail" % "jakarta.mail-api" % "2.0.1"
  val jakarta_mail = "com.sun.mail" % "jakarta.mail" % "2.0.1"

  val plantuml = "net.sourceforge.plantuml" % "plantuml" % "1.2022.14"
  //test
  val scalatest = "org.scalatest" %% "scalatest" % "3.2.16" % "test"
  val mockito = "org.mockito" % "mockito-core" % "5.3.1" % "test"
  val greenmail = "com.icegreen" % "greenmail" % "2.0.0" % "test"

  //runtime
  val logback_classic = "ch.qos.logback" % "logback-classic" % "1.4.7"
  val logback_core = "ch.qos.logback" % "logback-core" % "1.4.7"
  val postgresql = "org.postgresql" % "postgresql" % "42.6.0"
  val h2 = "com.h2database" % "h2" % "2.1.214"
  val HikariCP = "com.zaxxer" % "HikariCP" % "5.0.1"
  val jtds = "net.sourceforge.jtds" % "jtds" % "1.3.1"
  val ojdbc11 = "com.oracle.database.jdbc" % "ojdbc11" % "23.2.0.0"
  val orai18n = "com.oracle.database.nls" % "orai18n" % "23.2.0.0"
  val mysql_connector_java = "com.mysql" % "mysql-connector-j" % "8.0.33"
  val mssql_jdbc = "com.microsoft.sqlserver" % "mssql-jdbc" % "12.2.0.jre11"

  val tomcat_embed_core = "org.apache.tomcat.embed" % "tomcat-embed-core" % "10.1.10"
  val io_undertow_core = "io.undertow" % "undertow-core" % "2.3.7.Final"
  val io_undertow_servlet = "io.undertow" % "undertow-servlet" % "2.3.7.Final"

  override def trigger = allRequirements

}
