package basicrequest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class swaggerPostReq {
	
	@Test
	public void createUser()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		Response resp=given()
		.body("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"userfour\",\r\n"
				+ "  \"firstName\": \"sushant\",\r\n"
				+ "  \"lastName\": \"porey\",\r\n"
				+ "  \"email\": \"sp@gmail.com\",\r\n"
				+ "  \"password\": \"Test@123\",\r\n"
				+ "  \"phone\": \"1234567890\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}")
		.header("Content-Type","application/json")
		.when()
		.post("/user")
		.then()
		.extract()
		.response();
		String response=resp.asPrettyString();
		System.out.println(response);
		
		JsonPath jp=resp.jsonPath();
		int codevalue=jp.getInt("code");
		System.out.println(codevalue);
		
	}

}
