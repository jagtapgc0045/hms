package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert2 
{
	@Test
	public void assertnotequal()
	{
		String ActualResult="Hi";
		String ExpectedResult="Hi";
		
		Assert.assertNotEquals(ActualResult, ExpectedResult,"Failed: Actual and Expected Result are Same");
	}
	@Test
	public void assertnotequal1()
	{
		String ActualResult="Hello";
		String ExpectedResult="Hi";
		
		Assert.assertNotEquals(ActualResult, ExpectedResult,"Failed: Actual and Expected Result are Same");
	}
		
	}


