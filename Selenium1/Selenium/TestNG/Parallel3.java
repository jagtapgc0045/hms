package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel3 
{

	@Test
	public void openKiteZerodhaApp() throws InterruptedException
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
    	   
    	       Thread.sleep(2000);
    	       
    	       driver.close();
	}

}
