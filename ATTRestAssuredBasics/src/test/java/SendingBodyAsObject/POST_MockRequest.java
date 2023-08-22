package SendingBodyAsObject;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class POST_MockRequest {
	
	@Test
	public void createInfoOnMockServer()
	{
		HashMap<String,String>obj1=new HashMap<String,String>();
		obj1.put("id", "1001");
		obj1.put("type", "Regular");
		
		HashMap<String,String>obj2=new HashMap<String,String>();
		obj2.put("id", "2001");
		obj2.put("type", "Chocolate");
		
		List<HashMap> Bodydata=new ArrayList<HashMap>();
		Bodydata.add(obj1);
		Bodydata.add(obj2);
		
		RestAssured.baseURI="https://6339fe92-b6e7-48dc-8c5f-ac0974e53f44.mock.pstmn.io";
		given()
		.body(Bodydata)
		.log().all()
		.when()
		.post("/post")
		.then()
		.log().all()
		.extract()
		.response();
	}

}
