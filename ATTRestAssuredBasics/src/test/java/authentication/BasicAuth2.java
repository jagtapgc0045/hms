package authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class BasicAuth2 {
	
	@Test
	public void alternateMethod()
	{
		RestAssured.baseURI="https://postman-echo.com";
		given()
		.log().all() 
//		Passing the user name and password from header using Authorization as key and 
//		key will a Base64 key in which user name and password is converted 
		.header("Authorization","Basic cG9zdG1hbjpwYXNzd29yZA==")
		.when()
		.get("/basic-auth")
		.then()
		.log().all();
	}

}
