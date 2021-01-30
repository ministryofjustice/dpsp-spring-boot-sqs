package uk.gov.justice.hmpps.spring.boot.sqs.service

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
class QueueService(private val configurationProperties: QueueServiceProperties) {
  val testProperty
    get() = configurationProperties.testProperty
}

@Component
@ConfigurationProperties("dps.sqs")
data class QueueServiceProperties(var testProperty: String = "")
