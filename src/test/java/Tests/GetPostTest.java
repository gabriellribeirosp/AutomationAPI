package Tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetPostTest {

    @Test
    public void validarGetDePost() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        given()
            .when()
            .get("/posts/1")
            .then()
            .statusCode(200)
            .contentType(ContentType.JSON)
            .body("id", equalTo(1))
            .body("userId", notNullValue())
            .body("title", not(isEmptyString()));
    }

    @Test
    public void validarGetDePostInexistente() {
        given()
            .when()
            .get("https://jsonplaceholder.typicode.com/posts/9999")
            .then()
            .statusCode(404);
    }
}
