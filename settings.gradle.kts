rootProject.name = "dps-spring-boot-sqs"

include("library")
include("test-app")

pluginManagement {
  repositories {
    mavenLocal()
    gradlePluginPortal()
  }
}
