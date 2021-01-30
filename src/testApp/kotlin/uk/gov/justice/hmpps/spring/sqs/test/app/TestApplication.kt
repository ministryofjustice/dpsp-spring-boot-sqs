package uk.gov.justice.hmpps.spring.sqs.test.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["uk.gov.justice.hmpps.spring.sqs", "uk.gov.justice.hmpps.spring.sqs.test.app"])
class TestApplication

fun main(args: Array<String>) {
  runApplication<TestApplication>(*args)
}
