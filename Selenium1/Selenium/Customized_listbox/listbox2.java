package Customized_listbox;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class listbox2 
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
				
    	       driver.get("https://www.facebook.com/");
    	       
    	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	       
    	       //identify create new account
    	       
    	       driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
    	       
    	       Thread.sleep(1000);
    	       
    	       //Step-1-Identify listbox and store it into an object
    	       
    	       WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
    	       
    	       //step-2-Create object of actions class
    	       
    	       Actions act=new Actions(driver);
    	       
    	       //To perform left click operation
    	       
    	       act.click(Month).perform();
    	       
    	       Thread.sleep(1000);
    	       
    	       //To move one step forward
    	       
    	       act.sendKeys(Keys.ARROW_DOWN).perform();
    	       
    	       Thread.sleep(1000);
    	       
    	       //To move one step downward 
    	       
    	       act.sendKeys(Keys.ARROW_DOWN).perform();
    	       
    	       //To select month option
    	       act.sendKeys(Keys.ENTER).perform();
    	       
    	       
    	       
    	       
    }
	
}
