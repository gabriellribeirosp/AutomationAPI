package Tests;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;

public class DeleteTest {

    @Test
    public void deletarPost() {
        when()
            .delete("https://jsonplaceholder.typicode.com/posts/1")
            .then()
            .statusCode(200);
    }

    @Test
    public void deletarPostInexistente() {
        when()
            .delete("https://jsonplaceholder.typicode.com/posts/9999")
            .then()
            .statusCode(200); // ajustado para comportamento da API falsa
    }
}
