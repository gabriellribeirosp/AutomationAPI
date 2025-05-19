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
}
