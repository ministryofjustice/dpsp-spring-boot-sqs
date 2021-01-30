package uk.gov.justice.hmpps.spring.sqs.webapp.resource

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import uk.gov.justice.hmpps.spring.sqs.webapp.service.QueueManager

@RestController
@RequestMapping("/queues", produces = [MediaType.APPLICATION_JSON_VALUE])
class QueueResource(private val queueManager: QueueManager) {

  @GetMapping("/test")
  fun test() {
    queueManager.test()
  }
}
