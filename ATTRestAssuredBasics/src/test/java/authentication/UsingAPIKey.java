package authentication;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UsingAPIKey {
	
	@Test
	public void createWorkSpace()
	{
		RestAssured.baseURI="https://api.getpostman.com";
		
		Response resp=given()
		.log().all()
		.header("x-api-key","PMAK-649d4a57267c0c003848603c-cec87e6c41b46f8e85500ca6dde186e6ef")
		.body("{\r\n"
				+ "    \"workspace\": {\r\n"
				+ "        \"name\": \"TestingWorkspace\",\r\n"
				+ "        \"description\": \"Test workspace by code\",\r\n"
				+ "        \"type\": \"personal\"\r\n"
				+ "    }\r\n"
				+ "}")
		.when()
		.post("/workspaces")
		.then()
		.log().all()
		.extract().response();
		String response=resp.asPrettyString();
		System.out.println(response);
		
	}
//		API Key: It was generated after we do login / signup on the application using 
//		a separate procedure. It was created as a replacement for username and password 
//		It can be fetch from the account settings and we have to pass it inside the header 
//		with key and value.

}
