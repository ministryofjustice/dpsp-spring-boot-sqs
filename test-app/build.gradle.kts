plugins {
  id("uk.gov.justice.hmpps.gradle-spring-boot") version "3.0.1-mh"
  kotlin("plugin.spring") version "1.4.21"
  id("org.unbroken-dome.test-sets") version "3.0.1"
  idea
}

testSets {
  "testIntegration"()
}

dependencies {
  annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

  implementation(project(":library"))

  implementation("org.springframework.boot:spring-boot-starter-webflux")

  implementation("org.springframework:spring-jms")
  implementation(platform("com.amazonaws:aws-java-sdk-bom:1.11.942"))
  implementation("com.amazonaws:amazon-sqs-java-messaging-lib:1.0.8")

  testImplementation("org.springframework.security:spring-security-test")
  testImplementation("com.github.tomakehurst:wiremock-standalone:2.27.2")
  testImplementation("net.javacrumbs.json-unit:json-unit-assertj:2.22.1")
  testImplementation("org.testcontainers:localstack:1.15.1")
  testImplementation("org.awaitility:awaitility-kotlin:4.0.3")
  testImplementation("io.jsonwebtoken:jjwt:0.9.1")
}
