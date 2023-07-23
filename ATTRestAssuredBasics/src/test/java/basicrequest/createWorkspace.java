package basicrequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class createWorkspace {
	
	@Test
	public void createNewWorkspace()
	{
		RestAssured.baseURI="https://api.getpostman.com";
		Response response=given()
		.header("x-api-key","PMAK-649d4a57267c0c003848603c-cec87e6c41b46f8e85500ca6dde186e6ef")
		.body("{\r\n"
				+ "    \"workspace\":{\r\n"
				+ "        \"name\":\"ATTSample1\",\r\n"
				+ "        \"description\":\"this is to test workspace creation\",\r\n"
				+ "        \"type\":\"personel\"\r\n"
				+ "    }\r\n"
				+ "}")
		.when()
		.post("/workspaces")
		.then().extract().response();
		String resp=response.asPrettyString();
		System.out.println(resp);
	}

}
