package RestAssuredAssertions;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;

import java.util.List;


public class restAssuredAssertions {
	
	@Test
	public void getUserDetails()
	{
		RestAssured.baseURI="https://api.getpostman.com";
		 given()
		.header("x-api-key","PMAK-649d4a57267c0c003848603c-cec87e6c41b46f8e85500ca6dde186e6ef")
		.when()
		.get("/workspaces")
		.then()
		.assertThat()
		.header("Content-Encoding", "gzip")
		.contentType(ContentType.JSON)
		.statusCode(200)
//		"contains" is the rest assured assertion used to validate for all items in given order
		.body("workspaces.name", contains("Team Workspace","Personal Workspace","My Api testing"))
//		"hasItem" is the rest Assured assertion used to validate for having the item 
		.body("workspaces.name", hasItem("Personal Workspace"))
//		"containInAnyOrder" is Rest Assured validation used to validate the content in any order
		.body("workspaces.name", containsInAnyOrder("My Api testing","Personal Workspace","Team Workspace"))
		.body("workspaces[1]", hasKey("id"))
		.body("workspaces[1]",hasEntry("id","4f3da798-a29e-4c1b-a763-9abf88446ec0"));
	}

}
