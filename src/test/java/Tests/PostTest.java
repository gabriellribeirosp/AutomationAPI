import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;

public class PostTest {
    @Test
    public void criarPost() {
        String body = """
            {
              "title": "out",
              "body": "seara",
              "userId": 1
            }
            """;

        given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("https://jsonplaceholder.typicode.com/posts")
                .then()
                .statusCode(201);
    }
}
@Test
    public void criarPostComDadosInvalidos() {
        String body = "{}"; // Corpo vazio

        given()
            .contentType(ContentType.JSON)
            .body(body)
            .when()
            .post("https://jsonplaceholder.typicode.com/posts")
            .then()
            .statusCode(400); // Esperado: requisição inválida (depende da API)
    }