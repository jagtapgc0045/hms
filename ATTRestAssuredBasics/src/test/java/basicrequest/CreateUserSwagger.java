package basicrequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class CreateUserSwagger {
	@Test
	public void createAUser()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		Response resp=given()
		.body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"indian\",\r\n"
				+ "  \"firstName\": \"narendra\",\r\n"
				+ "  \"lastName\": \"modi\",\r\n"
				+ "  \"email\": \"narendra.modi@gmail.com\",\r\n"
				+ "  \"password\": \"Test@123\",\r\n"
				+ "  \"phone\": \"9876543210\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}")
		.header("content-type","application/json")
		.when()
		.post("/user")
		.then()
		.extract()
		.response();
		
		String response=resp.asPrettyString();
		System.out.println(response);
	}

}
