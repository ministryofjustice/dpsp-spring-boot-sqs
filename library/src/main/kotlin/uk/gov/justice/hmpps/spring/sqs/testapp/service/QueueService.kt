package uk.gov.justice.hmpps.spring.sqs.testapp.service

import org.slf4j.LoggerFactory
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
class QueueService(private val configurationProperties: QueueServiceProperties) {
  val testProperty
    get() = configurationProperties.testProperty

  fun test(): String {
    log.info(">>>> TEST with property=$testProperty >>>>")
    return testProperty
  }

  companion object {
    val log = LoggerFactory.getLogger(this::class.java)
  }
}

@Component
@ConfigurationProperties("dps.sqs")
data class QueueServiceProperties(var testProperty: String = "")
