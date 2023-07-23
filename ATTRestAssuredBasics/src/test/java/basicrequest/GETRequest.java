package basicrequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GETRequest {
	@Test
	public void getAllUser() {
		RestAssured.baseURI = "https://reqres.in/";

		Response response = given()

				.when()

				.get("api/users?page=2")

				.then()

				.extract()

				.response();
		String resp=response.asPrettyString();
		System.out.println(resp);
		int scode=response.getStatusCode();
		System.out.println(scode);
		long time=response.getTime();
		System.out.println(time);
		
	}
}
