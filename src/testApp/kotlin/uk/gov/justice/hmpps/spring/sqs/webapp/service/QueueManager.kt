package uk.gov.justice.hmpps.spring.sqs.webapp.service

import org.springframework.stereotype.Service
import uk.gov.justice.hmpps.spring.sqs.service.QueueService

@Service
class QueueManager(val queueService: QueueService) {

  fun test() {
    queueService.test()
  }
}
