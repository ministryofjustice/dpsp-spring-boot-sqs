package uk.gov.justice.hmpps.spring.sqs.testapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["uk.gov.justice.hmpps.spring.sqs", "uk.gov.justice.hmpps.spring.sqs.testapp"])
class TestApplication

fun main(args: Array<String>) {
  runApplication<TestApplication>(*args)
}
