package SendingBodyAsObject;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class complexJsonPOST_Mock {

	@Test
	public void compleJson()
	{
		//List for ID containing multiple values
		List<Integer>IDarrayElements=new ArrayList<Integer>();
		IDarrayElements.add(5);
		IDarrayElements.add(9);
		
		//Hashmap for batter[0] containing (Key,Value)
		HashMap<String,Object> batter2=new HashMap<String,Object>();
		batter2.put("id", IDarrayElements);
		batter2.put("type", "Chocolate");
		
		//Hashmap for batter[1] containing (Key,Value)
		HashMap<String,String> batter1=new HashMap<String,String>();
		batter1.put("id", "1001");
		batter1.put("type", "regular");
		
		//List for Batter array
		List<Object>batter=new ArrayList<Object>();
		batter.add(batter1);
		batter.add(batter2);
		
		//for topping1 create a HashMap (Key,Value)
		HashMap<String,String>topping1=new HashMap<String,String>();
		topping1.put("id", "5001");
		topping1.put("type", "none");
		
		//for topping2 create a HashMap (Key,Value)
		HashMap<String,String>topping2=new HashMap<String,String>();
		topping2.put("id", "5002");
		topping2.put("type", "glazed");
		
		//for topping3 create a HashMap (Key,Value)
		HashMap<String,String>topping3=new HashMap<String,String>();
		topping3.put("id", "5003");
		topping3.put("type", "sugar");
		
		//for topping array
		List<HashMap<String,String>>topping=new ArrayList<HashMap<String,String>>();
		topping.add(topping1);
		topping.add(topping2);
		topping.add(topping3);
		
		//Hashmap for initial information 
		HashMap<Object,Object> preval=new HashMap<Object,Object>();
		preval.put("id", "0001");
		preval.put("type", "donut");
		preval.put("name", "cake");
		preval.put("ppu", 0.55);
		
		//Array for All info
		List<Object>allData=new ArrayList<Object>();
		allData.add(preval);
		allData.add(batter);
		allData.add(topping);
		
		RestAssured.baseURI="https://6339fe92-b6e7-48dc-8c5f-ac0974e53f44.mock.pstmn.io";
		given()
		.header("Content-Type","application/json")
		.body(allData)
		.log().all()
		.when()
		.post("/post")
		.then()
		.log().all()
		.extract()
		.response();
		

		

		

	}
}
