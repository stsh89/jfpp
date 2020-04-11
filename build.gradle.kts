/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds
 */

plugins {
  java
  application
}

repositories {
  mavenCentral()
    maven {
        setUrl("https://repo1.maven.org/maven2")
        metadataSources {
            mavenPom()
            artifact()
        }
    }
}

dependencies {
  implementation("org.ini4j:ini4j:0.5.4")
  implementation("javax.xml.bind:jaxb-api:2.3.1")
  implementation("org.jdatepicker:jdatepicker:1.3.4")
}

application {
  mainClassName = "personalfinance.PersonalFinance"
}
