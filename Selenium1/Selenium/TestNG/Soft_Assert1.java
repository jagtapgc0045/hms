package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert1 
{
	@Test
	public void TC1()
	{
		String str1="Hi";
		String str2="Hello";
		String str3="Good Morning";
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(str1, str2,"Both Result are different");
		
		soft.assertEquals(str2, str3,"Both Result are different");
		
		soft.assertEquals(str1, str2,"Both Result are same");
		
		soft.assertAll();
	}

}
