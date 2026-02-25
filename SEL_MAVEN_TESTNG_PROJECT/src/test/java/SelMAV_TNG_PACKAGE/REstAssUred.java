package SelMAV_TNG_PACKAGE;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class REstAssUred {

    @Test
    public void getSingleUserTest() {


        given()
        .when()
            .get("https://dummyjson.com/products/1")
        .then()  
        .log().all() 
            .statusCode(200)              
            .body("id", equalTo(1));
            //.body("title", equalTo("Apple AirPods Max Silver"));       
            
    }
}