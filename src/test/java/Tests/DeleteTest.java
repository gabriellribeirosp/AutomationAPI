import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;

public class DeleteTest {
    @Test
    public void deletarPost() {
        when()
                .delete("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .statusCode(200); // ou 204 dependendo da API
    }
}

@Test
    public void deletarPostInexistente() {
        when()
                .delete("https://jsonplaceholder.typicode.com/posts/9999")
                .then()
                .statusCode(404); // Esperado: recurso não encontrado
    }