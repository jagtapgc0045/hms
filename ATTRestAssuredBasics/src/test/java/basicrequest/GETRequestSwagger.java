package basicrequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GETRequestSwagger {
	@Test
	public void getAUser() {
		RestAssured.baseURI = "https://petstore.swagger.io/v2";

		Response resp = given().header("content-type","application/json").when().get("/indian").then().extract().response();

		String response=resp.asPrettyString();
		System.out.println(response);
		System.out.println(resp.getStatusCode());
	}

}
