package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_methods_practice 
{

	public static void main(String[] args) 
	{
		 
		// step1
	    // set path of chromedriver exe file
				
		System.setProperty("webdriver.chrome.driver",
		"C:\\\\Users\\\\computer1\\\\Desktop\\\\Selenium\\\\Browser\\\\chromedriver_win32\\\\chromedriver.exe");
		
		// create an object of chromedriver and provide reference to web driver
		
	      WebDriver	driver=new ChromeDriver();
	      
	      driver.navigate().to("https://kite.zerodha.com/");
		
	}
	
	
	
	
	
	
	
	
}
