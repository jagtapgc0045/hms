package PathAndQueryParam;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class queryParam {
	RequestSpecification requ;
	ResponseSpecification resp;
	
	@BeforeTest
	public void resSpecBuilder()
	{
		RequestSpecBuilder req=new RequestSpecBuilder();
		req.setBaseUri("https://reqres.in");
		req.log(LogDetail.ALL);
		requ=req.build();
		
		ResponseSpecBuilder res=new ResponseSpecBuilder();
		//res.expectContentType(ContentType.JSON);
		res.expectStatusCode(200);
		res.log(LogDetail.ALL);
		resp=res.build();
	}
	
	@Test
	public void getAllUsers()
	{
		
		given()
		.spec(requ)
		.queryParam("page", "2")
		.when()
		.get()
		.then()
		.spec(resp)
		.extract()
		.response();
		
		
	}
	@Test
	public void getAUser()
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("page", "2");
		given()
		.spec(requ)
		.queryParams(hm)
		.when()
		.get()
		.then()
		.spec(resp)
		.extract()
		.response();
	}

}
