package basicrequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GETWorkspace {
	@Test
	public void getPostmanWorkspace() {
		RestAssured.baseURI = "https://api.getpostman.com";
		Response response = given()
				.header("x-api-key", "PMAK-649d4a57267c0c003848603c-cec87e6c41b46f8e85500ca6dde186e6ef").when()
				.get("/workspaces").then().extract().response();
		
		String resp=response.asPrettyString();
		System.out.println(resp);
	}

}
