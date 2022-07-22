package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class 
{
	WebDriver driver;
	
	public void initilizeBrowser()
	{
		// step1
	    // set path of chromedriver exe file
		
		//parameter1-Name of the browser
		//parameter2-Path of the chromedriver.exe file
				
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\\\Users\\\\computer1\\\\Desktop\\\\Selenium\\\\Browser\\\\chromedriver_win32\\\\chromedriver.exe");	
				
		// cerate object of chromedriver and provide referance of webdriver
			
				 driver=new ChromeDriver();
				
		//to enter url on the browser		
				
    	       driver.get("https://kite.zerodha.com/");
    	       
    	       driver.manage().window().maximize();
    	       
    	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	       
		
		
	}
	
	
	
	

}
