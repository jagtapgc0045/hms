package SendingBodyAsObject;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class x2ComplexJson {
		
	@Test
	public void sendComplexJson()
	{
		RestAssured.baseURI="https://6339fe92-b6e7-48dc-8c5f-ac0974e53f44.mock.pstmn.io";

		List<Integer> id=new ArrayList<Integer>();
		id.add(0);
		id.add(9);
		id.add(22);
		HashMap<String, Object> batter1=new HashMap<String,Object>();
		batter1.put("id", id);
		batter1.put("type", "regular");
		
		HashMap<String,String> batter2=new HashMap<String,String>();
		batter2.put("id", "1002");
		batter2.put("type", "chocolate");
		
		List<Object> batterArray=new ArrayList<Object>();
		batterArray.add(batter1);
		batterArray.add(batter2);
		
		HashMap<Object,Object> batters=new HashMap<Object,Object>();
		batters.put("batter", batterArray);
		
		HashMap<String,String > innerID=new HashMap<String,String>();
		innerID.put("name", "Ashish");
		
		List<Object> tID=new ArrayList<Object>();
		tID.add("info");
		tID.add(innerID);
		tID.add(0);
		tID.add(9);
		tID.add(22);
		
		HashMap<Object,Object> topping0=new HashMap<Object,Object>();
		topping0.put("id", tID);
		topping0.put("type","choco");
		HashMap<String,String> topping1=new HashMap<String,String>();
		topping1.put("id","5001");
		topping1.put("type","Mapple");
		
		List<Object> topping=new ArrayList<Object>();
		topping.add(topping0);
		topping.add(topping1);
		
		Map<Object,Object>item=new HashMap<Object,Object>();
		item.put("id", "001");
		item.put("type", "donut");
		item.put("name", "cake");
		item.put("ppu", 0.55);
		item.put("batters", batters);
		item.put("topping", topping);
		
		List<Object> itemArray=new ArrayList<Object>();
		itemArray.add(item);
		
		HashMap<Object,Object>Items=new HashMap<Object,Object>();
		Items.put("Item", itemArray);
		
		given()
		.log().all()
		.body(Items)
		.when()
		.post("/post")
		.then()
		.log().all()
		.extract()
		.response();
		
		

		
		
	}

}
