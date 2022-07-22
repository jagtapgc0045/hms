package Page_Object_module;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_Test_class 
{
	public static void main(String[] args) throws InterruptedException, IOException 
    {
    	// step1
	    // set path of chromedriver exe file
		
		//parameter1-Name of the browser
		//parameter2-Path of the chromedriver.exe file
				
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\\\Users\\\\computer1\\\\Desktop\\\\Selenium\\\\Browser\\\\chromedriver_win32\\\\chromedriver.exe");	
				
		// cerate object of chromedriver and provide referance of webdriver
			
				WebDriver driver=new ChromeDriver();
				
		//to enter url on the browser		
				
    	       driver.get("https://kite.zerodha.com/");
    	       
    	       driver.manage().window().maximize();
    	       
    	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	       
    	       //create object of POM class1
    	       kite_login_page1 login1=new kite_login_page1(driver);
    	       login1.enterUserID();
    	       login1.enterPassword();
    	       login1.clickonloginbtn();
    	       
    	       //create object of POM class2
    	       kite_login_page2 login2=new kite_login_page2(driver);
    	       login2.enterpin();
    	       login2.clickoncntbtn();
    	       
    	       //create object of POM class3
    	       kite_home_page homepg=new kite_home_page(driver);
    	       homepg.verifyUserID();
    	       
    }

}
