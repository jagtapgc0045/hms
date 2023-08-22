package SendingBodyAsObject;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;


public class GET_MockRequest {
	
	@Test
	public void getRequest()
	{
		RestAssured.baseURI="https://6339fe92-b6e7-48dc-8c5f-ac0974e53f44.mock.pstmn.io";
		given()
		.when()
		.get("/get")
		.then()
		.extract()
		.response();
	}

}
