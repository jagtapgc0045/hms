package Actions_class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 
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
				
    	       driver.get("https://demo.guru99.com/test/drag_drop.html");
    	       
    	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	       
    	       //Step1-Identify source element and store into an object
    	       
    	      WebElement source= driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
    	       
    	       //Step1-identify destination element and store into an object
    	       
    	      WebElement destination= driver.findElement(By.xpath("//ol[@id='amt8']"));
    	       
    	       //step2-Create object of actions class
    	       
    	       Actions act=new Actions(driver);
    	       
    	       //to perform drag and drop action
    	       
    	       act.dragAndDrop(source,destination ).perform();
    }
    	       
}
