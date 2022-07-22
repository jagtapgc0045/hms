package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethod1 
{
	@Test
	public void login()     //Test method /Test case
	{
		Assert.fail();
		Reporter.log("Running Login TC", true);
	}
	
	@Test(dependsOnMethods= {"login"})
	public void logOut()     //Test method  /Test case
	{
		Reporter.log("Running logout TC", true);
	}

}
