package FetchReadyMadeJson;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import junit.framework.Assert;

public class fetchreadymadeJson1 {
	 static int total;
	 static int total1;
	@Test
	public int getData()
	{
		JsonPath jp=new JsonPath(bodyDefinition.getBody());
		
//		1. Print No of courses returned by API
		int size=jp.getInt("courses.size()");
		total=jp.getInt("dashboard.purchaseAmount");
		total1=0;
		for(int i=0;i<size;i++)
		{
		String coursetitle=jp.getString("courses["+i+"].title");
		int price=jp.getInt("courses["+i+"].price");
		System.out.println("course "+i+" title :"+coursetitle+"\ncourse "+i+" price "+price);
		total1+=price;
		
		
		}
		return total1;
		
	}
		
		@Test
		public void priceAssert()
		{
			int a=getData();
			Assert.assertEquals(total, a);
		}
		 
//		2. Print Purchase Amount
		//jp.get
	

}
