package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_of_TC
{
	@Test(groups="Login")
	public void TC1()
	{
		Reporter.log("Running Tc1", true);
	}
	@Test(groups="Login")
	public void TC2()
	{
		Reporter.log("Running Tc2", true);
	}
	@Test(groups="profile")
	public void TC3()
	{
		Reporter.log("Running Tc3", true);
	}
	@Test(groups="profile")
	public void TC4()
	{
		Reporter.log("Running Tc4", true);
	}
	@Test(groups="order")
	public void TC5()
	{
		Reporter.log("Running Tc5", true);
	}
	@Test(groups="fund")
	public void TC6()
	{
		Reporter.log("Running Tc6", true);
	}
	

}
