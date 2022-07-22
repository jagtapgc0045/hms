package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Result;

public class Kite_login_Test_Class extends Base_class
{
	kite_login_page1 Login1;
	kite_login_page2 Login2;
	kite_home_page Home;
	
	@BeforeClass
	public void OpenBrowser()
	{
		//Open Browser
		initilizeBrowser();
		
		//Create object of POM class1
		
		Login1=new kite_login_page1(driver);
		
		//Create object of POM class2
		
		Login2=new kite_login_page2(driver);
		
		//Create object of POM class2
		
		Home=new kite_home_page(driver);
	}
	 
	@BeforeMethod
	
	public void LoginToApp() throws IOException
	{
		//Enter UN
		Login1.enterUserID(Utility_class.getDataFromPF("UN1"));
		
		//Enter Password
		Login1.enterPassword(Utility_class.getDataFromPF("PSW1"));
		
		//click on login button
		Login1.clickonloginbtn();
		
		//Enter PIN
		Login2.enterpin(Utility_class.getDataFromPF("PIN1"));
		
		//click on continue button
		Login2.clickoncntbtn();
		
	}
	@Test
	public void VerifyUserID() throws EncryptedDocumentException, IOException 
	{
		String ActualUserID=Home.getkitehomepageUserID();
		
		String ExpectedUserId=Utility_class.getTD(0, 0);
		
		Assert.assertEquals(ActualUserID, ExpectedUserId,"Failed: Both are Different");
	}
	@AfterMethod
	
	public void logoutfromApp(ITestResult Result) throws IOException
	{
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			Utility_class.Screenshot(driver);
		}
		Home.clikUserId();
		Home.clicklogoutbtn();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}

}
