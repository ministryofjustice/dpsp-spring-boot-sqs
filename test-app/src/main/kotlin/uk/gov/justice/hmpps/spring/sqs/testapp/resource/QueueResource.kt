package uk.gov.justice.hmpps.spring.sqs.testapp.resource

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import uk.gov.justice.hmpps.spring.sqs.testapp.service.QueueService

@RestController
@RequestMapping("/queues", produces = [MediaType.APPLICATION_JSON_VALUE])
class QueueResource(private val queueService: QueueService) {

  @GetMapping("/test")
  fun test(): TestResult {
    return TestResult(queueService.test())
  }

  data class TestResult(val value: String)
}
