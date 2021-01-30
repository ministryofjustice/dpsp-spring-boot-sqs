import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "1.4.21"
  kotlin("plugin.spring") version "1.4.21"
  id("org.springframework.boot") version "2.4.2"
  id("io.spring.dependency-management") version "1.0.11.RELEASE"
  id("com.github.ben-manes.versions") version "0.36.0"
  id("se.patrikerdes.use-latest-versions") version "0.2.15"
  id("org.owasp.dependencycheck") version "6.0.4"
  id("com.adarshr.test-logger") version "2.1.1"
  id("org.jlleitschuh.gradle.ktlint") version "9.4.1"
  id("org.unbroken-dome.test-sets") version "3.0.1"
}

group = "uk.gov.justice.hmpps.spring.boot.sqs"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

tasks.bootJar {
  enabled = false
}

tasks.jar {
  enabled = true
}

testSets {
  "testApp"()
  "testIntegration"()
}

repositories {
  mavenLocal()
  mavenCentral()
  jcenter()
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter")
  implementation("org.jetbrains.kotlin:kotlin-reflect")
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
  testImplementation("org.assertj:assertj-core:3.18.1")
  add("testAppImplementation", "org.springframework.boot:spring-boot-starter-web")
}

fun isNonStable(version: String): Boolean {
  val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.toUpperCase().contains(it) }
  val regex = "^[0-9,.v-]+(-r)?$".toRegex()
  val isStable = stableKeyword || regex.matches(version)
  return isStable.not()
}

tasks.withType<KotlinCompile> {
  kotlinOptions {
    freeCompilerArgs = listOf("-Xjsr305=strict")
    jvmTarget = "11"
  }
}

tasks.withType<Test> {
  useJUnitPlatform()
}

tasks.named("check") {
  dependsOn(":ktlintCheck")
}
