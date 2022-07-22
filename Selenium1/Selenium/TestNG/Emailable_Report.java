package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_Report 
{
	
	@Test
	public void m1()              //Test method/Test case
	{
		Reporter.log("Running method m1", true);
	}
	
	@Test
	public void m2() 
	{
		Reporter.log("Running method m2", true);
	}
	
	@Test
	public void m3() 
	{
		Reporter.log("Running method m3", true);
	}

}
