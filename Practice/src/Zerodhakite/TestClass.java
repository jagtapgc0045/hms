package Zerodhakite;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass
{
	LoginpagePOM pom1;
	UtilityClass UC;
	Loginpage2POM2 pom2;
	@BeforeClass
	public void Toopenbrowser()
	{
		openbrowser();
		pom1=new LoginpagePOM(driver);
		UC=new UtilityClass();
		pom2=new Loginpage2POM2(driver);

	}
	
	@BeforeMethod
	public void ToperformActions() throws IOException
	{
		
		pom1.enterUN(UtilityClass.getcredentials("UN"));
		pom1.enterPSW(UtilityClass.getcredentials("PSW"));
		pom1.clicklogin();
		pom2.enterpin(UtilityClass.getcredentials("PIN"));
		pom2.continuebtn();
		
		
	}
	
	@Test
	public void Totest()
	{
		
	}
	

}
