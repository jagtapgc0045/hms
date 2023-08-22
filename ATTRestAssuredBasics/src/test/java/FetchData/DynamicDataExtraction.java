package FetchData;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class DynamicDataExtraction {

	@Test
	public void getResReqUser()
	{
		RestAssured.baseURI="https://reqres.in/";
		Response resp=given()
		.when()
		.get("api/users?page=2")
		.then()
		.extract()
		.response();
//		String response=resp.asPrettyString();
//		System.out.println(response);
		
		
		JsonPath jp=resp.jsonPath();
		int size=jp.getInt("data.size()");
		System.out.println(size);
		
		for(int i=0; i<size;i++)
		{
		String lastname=jp.getString("data["+i+"].last_name");
		if(lastname.equals("Ferguson"))
		{
		System.out.println(lastname);
		String email=jp.getString("data["+i+"].email");
		System.out.println(email);
		}
		}
	}

}
