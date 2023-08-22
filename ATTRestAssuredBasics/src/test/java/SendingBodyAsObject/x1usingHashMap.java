package SendingBodyAsObject;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class x1usingHashMap {
	String random;
	RequestSpecification request;
	ResponseSpecification response;
	@BeforeTest
	public void initReqAndResSpec()
	{
		RequestSpecBuilder req=new RequestSpecBuilder();
		req.setBaseUri("https://petstore.swagger.io/v2");
		req.addHeader("Content-Type", "application/json");
		req.log(LogDetail.ALL);
		request=req.build();
		
		ResponseSpecBuilder res=new ResponseSpecBuilder();
		res.expectContentType(ContentType.JSON);
		res.log(LogDetail.ALL);
		response=res.build();
		}
	
	@Test
	public void createUser()
	{
//Creating a random user by sending the body by using hashmap 	
		HashMap<String, String> values=new HashMap<String,String>();
		 random=RandomStringUtils.randomAlphabetic(2);
		
		values.put("username", "Tester"+random);
		values.put("firstName", "Elon"+random);
		values.put("lastName", "Musk");
		values.put("email", "elonmusk"+random+"@gmail.com");
		values.put("password", "Test@123");
		values.put("phone", "987654210");
		
		
		given()
		.spec(request)
		.log().all()
		.body(values)
		.when()
		.post("/user")
		.then()
		.spec(response)
		.log().all()
		.extract()
		.response();
	}

	
//	fetch the user created above and validate the information	
	@Test
	public void fetchCreatedUser()
	{
		given()
		.spec(request)
		.log().all()
		.when()
		.get("/user/Tester"+random)
		.then()
		.spec(response)
		.log().all()
		.extract()
		.response();
	}

}
