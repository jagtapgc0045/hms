package FetchReadyMadeJson;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.*;

public class ReqAndResSpecBuilder {
	RequestSpecification reqspecs;
	ResponseSpecification respspecs;
	
	@BeforeTest
	public void initReqAndResSpec()
	{
		RequestSpecBuilder reqspecbuilder=new RequestSpecBuilder();
		reqspecbuilder.setBaseUri("https://api.getpostman.com");
		reqspecbuilder.addHeader("x-api-key", "PMAK-649d4a57267c0c003848603c-cec87e6c41b46f8e85500ca6dde186e6ef");
		reqspecbuilder.log(LogDetail.ALL);
		reqspecs=reqspecbuilder.build();
		
		ResponseSpecBuilder respbuilder=new ResponseSpecBuilder();
		respbuilder.expectStatusCode(200);
		respbuilder.expectContentType(ContentType.JSON);
		respbuilder.log(LogDetail.ALL);
		respspecs=respbuilder.build();
	}
	
	@Test(priority=1)
	public void getAllPostmanWorkspace()
	{
		given(reqspecs)
		.when()
		.get("/workspaces")
		.then()
		.spec(respspecs)
		.extract()
		.response();
		
	}
	
	@Test(priority=2)
	public void getAPostmanWorkspace()
	{
		given()
		.spec(reqspecs)
		.when()
		.get("/workspaces/b380ca60-2502-4757-bed9-f99825c4a92e")
		.then()
		.spec(respspecs)
		.extract()
		.response();
	}
	
	

}
