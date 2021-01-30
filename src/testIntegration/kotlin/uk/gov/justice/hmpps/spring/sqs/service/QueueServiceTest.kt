package uk.gov.justice.hmpps.spring.sqs.service

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(properties = ["dps.sqs.testProperty=test-property-value"])
internal class QueueServiceTest {

  @Autowired
  private lateinit var queueService: QueueService

  @Test
  fun `context loads`() {
    Assertions.assertThat(queueService.testProperty).isEqualTo("test-property-value")
  }

  @SpringBootApplication
  class TestConfiguration
}
