package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Disadvt_of_Assert 
{

	@Test
	public void TC1()
	{
		String ActualResult="Hi";
		String ExpectedResult="Hi";
		
		Assert.assertNotEquals(ActualResult, ExpectedResult,"Failed: Actual and Expected Result are Same");
		
		Assert.assertEquals(ActualResult, ExpectedResult,"Failed: Actual and Expected Result are different");
	}
}
