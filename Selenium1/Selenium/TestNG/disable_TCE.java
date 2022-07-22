package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class disable_TCE 
{
	@Test
	public void TC1()              //Test method/Test case
	{
		Reporter.log("Running TC1", true);
	}
	
	@Test
	public void TC2() 
	{
		Reporter.log("Running TC2 ", true);
	}
	
	@Test
	public void TC3() 
	{
		Reporter.log("Running TC3", true);
	}



}
