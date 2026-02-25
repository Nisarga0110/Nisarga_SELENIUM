package SelMAV_TNG_PACKAGE;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class PostAPI {

    @Test
    public void createProductTest() {

        String requestBody = "{\n" +
                "  \"title\": \"iPhone 15\",\n" +
                "  \"price\": 1200\n" +
                "}";

        given()
            .header("Content-Type", "application/json")  
            .body(requestBody)                            
        .when()
            .post("https://dummyjson.com/products/add")  
        .then()
            .log().all()
            .statusCode(201)                              
            .body("title", equalTo("iPhone 15"));
    }
}