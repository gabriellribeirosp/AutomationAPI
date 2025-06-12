package Tests;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;

public class PutTest {

    @Test
    public void atualizarPost() {
        String body = """
            {
              "id": 1,
              "title": "out atualizado",
              "body": "seara atualizado",
              "userId": 1
            }
            """;

        given()
            .contentType("application/json")
            .body(body)
            .when()
            .put("https://jsonplaceholder.typicode.com/posts/1")
            .then()
            .statusCode(200);
    }

    @Test
    public void atualizarPostComIdInvalido() {
        String body = "{\n" +
                      "  \"id\": \"abc\",\n" +
                      "  \"title\": \"falha\",\n" +
                      "  \"body\": \"dados inválidos\",\n" +
                      "  \"userId\": 1\n" +
                      "}";

        given()
            .contentType("application/json")
            .body(body)
            .when()
            .put("https://jsonplaceholder.typicode.com/posts/abc")
            .then()
            .statusCode(500); // ajustado para comportamento da API falsa
    }
}
