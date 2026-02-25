package SelMAV_TNG_PACKAGE;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class DEL_API {
	@Test
	public void delete() {
		 given()
	        .when()
	            .delete("https://dummyjson.com/products/1")
	        .then()
	            	.statusCode(200)
	            .body("isDeleted", equalTo(true))
	            .body("id", equalTo(1));
	}

}
