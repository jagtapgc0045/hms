package basicrequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class GETWorkspaceDetails {
	
	@Test
	public void getWorkspaceDetails()
	{
		RestAssured.baseURI="https://api.getpostman.com";
		Response response=given()
		.header("x-api-key","PMAK-649d4a57267c0c003848603c-cec87e6c41b46f8e85500ca6dde186e6ef")
		.when()
		
		.get("/workspaces/b380ca60-2502-4757-bed9-f99825c4a92e")
		
		.then()
		
		.extract()
		
		.response();
		String resp=response.asPrettyString();
		System.out.println(resp);
		
		int code=response.getStatusCode();
		System.out.println(code);
		
		long time=response.getTime();
		System.out.println(time);
		
	}

}
