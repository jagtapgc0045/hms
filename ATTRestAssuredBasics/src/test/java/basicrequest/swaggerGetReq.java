package basicrequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class swaggerGetReq {
	
	@Test
	public void getUserfour()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2/username";
		Response response=given()
		.when()
		.get("/userfour")
		.then()
		.extract()
		.response();
		String resp=response.asPrettyString();
		System.out.println(resp);
		
	}

}
