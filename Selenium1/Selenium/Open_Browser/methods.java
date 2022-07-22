package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// step1
		// set path of chromedriver exe file
		
	System.setProperty("webdriver.chrome.driver",
	"C:\\\\Users\\\\computer1\\\\Desktop\\\\Selenium\\\\Browser\\\\chromedriver_win32\\\\chromedriver.exe");	
		
	   // cerate object of chromedriver and provide referance of webdriver
	
		WebDriver driver=new ChromeDriver();
		
		//to enter URL on browser
	
		driver.navigate().to("https://kite.zerodha.com/");
		
		//wait
		Thread.sleep(2000);
		
		//to enter URL on browser
		
			driver.navigate().to("https://www.flipkart.com/");
			
			
		//wait
			Thread.sleep(2000);
			
	    //To move back
			
			driver.navigate().back();
			
		//wait
			Thread.sleep(2000);
			
		//To move forward
			
			driver.navigate().forward();
			
		//wait
			Thread.sleep(2000);
			
		//To refresh webpage
			
			driver.navigate().refresh();
			
        //close browser
			
			driver.close();
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
