package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert1 
{

	@Test
	public void assertequals()
	{
		String ActualResult="Hi";
		String ExpectedResult="Hi";
		
		Assert.assertEquals(ActualResult, ExpectedResult,"Failed: Actual and Expected Result are different");
	}
	
	@Test
	public void assertequals1()
	{
		String ActualResult="Hello";
		String ExpectedResult="Hi";
		
		Assert.assertEquals(ActualResult, ExpectedResult,"Failed: Actual and Expected Result are differen");
	}
}
