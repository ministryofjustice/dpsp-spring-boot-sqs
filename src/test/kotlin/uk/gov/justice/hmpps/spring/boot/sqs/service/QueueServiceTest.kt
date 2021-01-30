package uk.gov.justice.hmpps.spring.boot.sqs.service

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.assertj.core.api.Assertions.assertThat
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootTest(properties = ["dps.sqs.testProperty=test-property-value"])
internal class QueueServiceTest {

  @Autowired
  private lateinit var queueService: QueueService

  @Test
  fun `context loads`() {
    assertThat(queueService.testProperty).isEqualTo("test-property-value")
  }

  @SpringBootApplication
  class TestConfiguration
}