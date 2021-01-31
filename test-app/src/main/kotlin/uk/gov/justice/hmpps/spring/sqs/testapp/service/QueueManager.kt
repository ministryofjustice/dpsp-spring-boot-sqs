package uk.gov.justice.hmpps.spring.sqs.testapp.service

import org.springframework.stereotype.Service

@Service
class QueueManager(val queueService: QueueService) {

  fun test() {
    queueService.test()
  }
}
