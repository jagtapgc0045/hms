package authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static  io.restassured.RestAssured.*;


public class BasicAuth1 {
	
	@Test
	public void postmanEchoAuth()
	{
		RestAssured.baseURI="https://postman-echo.com";
		given()
		.log().all()
		.auth()
		.basic("postman", "password")
		.when()
		.get("/basic-auth")
		.then()
		.log().all();
//		This is not the appropriate way
//		Because credentials are passed openly and hence it is less secure
	}

}
