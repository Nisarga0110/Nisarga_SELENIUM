package SelMAV_TNG_PACKAGE;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PUT_API {
	@Test
	public void update() {
			 String requestBody = "{\n" +
		                "  \"title\": \"Updated iPhone 15\",\n" +
		                "  \"price\": 1400\n" +
		                "}";
			 given()
			   .header("Content-Type", "application/json")
	            .body(requestBody)
	        .when()
	            .put("https://dummyjson.com/products/1")
	        .then()
	            .log().all()
	            .statusCode(200)
	            .body("title", equalTo("Updated iPhone 15"))
	            .body("price", equalTo(1400));
		}

	}


