package uk.gov.justice.hmpps.spring.sqs.testapp

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.reactive.server.WebTestClient

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
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
      .expectBody().jsonPath("$.value").isEqualTo("Test Property Value")
  }
}
