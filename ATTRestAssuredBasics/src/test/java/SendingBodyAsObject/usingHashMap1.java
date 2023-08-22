package SendingBodyAsObject;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class usingHashMap1 {
	
	@Test
	public void createWorkpace() {

		HashMap<String, String> value = new HashMap<String, String>();

		value.put("name", "ATTObjectWorkspace");
		value.put("description", "Creation of workspace using java object as body");
		value.put("type", "personal");

		HashMap<String, Object> jsonObject = new HashMap<String, Object>();

		jsonObject.put("workspace", value);

		RestAssured.baseURI = "https://api.getpostman.com";

		Response resp = given()

				.header("x-api-key", "apk key")

				.body(jsonObject)
				
				.log().all()

				.when()

				.post("/workspaces")

				.then()

				.extract()

				.response();

		String response = resp.asPrettyString();

		System.out.println(response);

	}


}
