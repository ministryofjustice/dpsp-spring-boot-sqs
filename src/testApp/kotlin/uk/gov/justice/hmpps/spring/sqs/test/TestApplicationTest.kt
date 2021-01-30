package uk.gov.justice.hmpps.spring.sqs.test

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.reactive.server.WebTestClient
import uk.gov.justice.hmpps.spring.sqs.webapp.TestApplication

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = [TestApplication::class])
class TestApplicationTest {

  @Autowired
  private lateinit var webTestClient: WebTestClient

  @Test
  fun `test endpoint`() {
    webTestClient.get()
      .uri("/queues/test")
      .accept(MediaType.APPLICATION_JSON)
      .exchange()
      .expectStatus().isOk
  }
}
