package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority1 
{
	@Test
	public void m1()              //Test method/Test case
	{
		Reporter.log("Running method m1", true);
	}
	
	@Test(priority=1)
	public void m2() 
	{
		Reporter.log("Running method m2", true);
	}
	
	@Test(priority=-1)
	public void m3() 
	{
		Reporter.log("Running method m3", true);
	}



}
