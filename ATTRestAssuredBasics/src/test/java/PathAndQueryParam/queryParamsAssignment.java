package PathAndQueryParam;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class queryParamsAssignment {
	
	
	@Test
	public void multiparams()
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("foo1", "bar1");
		hm.put("foo2", "bar2");
		hm.put("foo3", "bar3");
		RestAssured.baseURI="https://postman-echo.com";
		given()
		.queryParams(hm)
		.log().all()
		.when()
		.get("/get")
		.then()
		.log().all()
		.extract()
		.response();
	}
	
	

}
