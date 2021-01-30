package uk.gov.justice.hmpps.spring.boot.sqs.dpsspringbootsqs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DpsSpringBootSqsApplication

fun main(args: Array<String>) {
  runApplication<DpsSpringBootSqsApplication>(*args)
}
