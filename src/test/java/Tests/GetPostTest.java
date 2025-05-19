package Tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetPostTest {

    @Test
    public void validarGetDePost() {
        // Define a URL base da API
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Início da construção da requisição
        given()
                // (Não há parâmetros, headers ou corpo a serem passados aqui)

                // Executa a requisição GET para o recurso /posts/1
                .when()
                .get("/posts/1")

                // Início das validações da resposta
                .then()
                // Valida se o status code é 200 (OK)
                .statusCode(200)

                // Valida se o tipo de conteúdo retornado é JSON
                .contentType(ContentType.JSON)

                // Valida se o campo "id" no corpo da resposta é igual a 1
                .body("id", equalTo(1))

                // Valida se o campo "userId" existe e não é nulo
                .body("userId", notNullValue())

                // Valida se o campo "title" não está vazio
                .body("title", not(isEmptyString()));
    }
}
