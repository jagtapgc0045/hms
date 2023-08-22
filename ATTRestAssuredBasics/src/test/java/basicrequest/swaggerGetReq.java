package basicrequest;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import junit.framework.Assert;


public class swaggerGetReq {
	swaggerPostReq s1;
	@BeforeTest
	public void presteps()
	{
		s1=new swaggerPostReq();

	}
	
	@Test(dependsOnMethods= {"s1.createUser()"})
	public void getUser()
	{
		String postmsg=s1.createUser();
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		Response response=given()
		.when()
		.get("/user/userfive")
		.then()
		.extract()
		.response();
		String resp=response.asPrettyString();
		System.out.println(resp);
		JsonPath jp=response.jsonPath();
		String getmsg=jp.getString("id value from POST request is: "+postmsg);
		System.out.println("id value from GET request is: "+getmsg);
		Assert.assertEquals(postmsg, getmsg);
	}

}
