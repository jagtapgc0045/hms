package POJOSerializationDeserialization;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;


public class createSwaggerUser {
	
	@Test
	public void createUser()
	{
		createUserRequestBody req=new createUserRequestBody();
		createUserResponseBody res=new createUserResponseBody();
		req.setId(0);
		req.setFirstName("TryingPOJO");
		req.setLastName("newUser");
		req.setPassword("Test123");
		req.setPhone("1234");
		req.setUsername("pojo");
		req.setUserStatus(0);
		
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		createUserResponseBody response=given()
				.log().all()
		.body(req)
		.header("Content-Type","application/json")
		.when()
		.post("/user")
		.then()
		.log().all()
		.extract()
		.response().as(createUserResponseBody.class);
		String message=response.getMessage();
		String type=response.getType();
		int code=response.getCode();
		System.out.println(message);
		System.out.println(type);
		System.out.println(code);
	}

}
