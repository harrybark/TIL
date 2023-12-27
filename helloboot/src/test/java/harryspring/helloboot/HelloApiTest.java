package harryspring.helloboot;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

public class HelloApiTest {

    @Test
    void helloApi() {
        // http localhost:8080/hello-servlet?name=Spring
        // HTTPie
        TestRestTemplate rest = new TestRestTemplate();

        ResponseEntity<String> res =
                rest.getForEntity("http://localhost:8080/hello-servlet?name={name}", String.class, "Spring");

        assertThat(res.getStatusCode()).isEqualTo(OK);
        //assertThat(res.getHeaders().getFirst(HttpHeaders.CONTENT_TYPE)).startsWith(TEXT_PLAIN_VALUE);
        assertThat(res.getBody()).isEqualTo("* Hello Spring *");
    }

    @Test
    void failHelloApi() {
        // http localhost:8080/hello-servlet?name=Spring
        // HTTPie
        TestRestTemplate rest = new TestRestTemplate();

        ResponseEntity<String> res =
                rest.getForEntity("http://localhost:8080/hello-servlet?name=", String.class);

        assertThat(res.getStatusCode()).isEqualTo(INTERNAL_SERVER_ERROR);
//        assertThat(res.getHeaders().getFirst(HttpHeaders.CONTENT_TYPE)).startsWith(TEXT_PLAIN_VALUE);
//        assertThat(res.getBody()).isEqualTo("Hello Spring");
    }
}
