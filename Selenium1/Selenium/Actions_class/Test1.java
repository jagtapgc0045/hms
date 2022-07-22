package Actions_class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 
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
				
    	       driver.get("http://demo.automationtesting.in/Frames.html");
    	       
    	 //Wait      
    	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	       
    	//Step-1-Identify dropdown and store into an object
    	       WebElement dropdown=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
    	       
    	//create object of actions class
    	       Actions act=new Actions(driver);
    	       
    	//To move curseer
    	       act.moveToElement(dropdown).perform();
    	       
    	  //wait
    	       Thread.sleep(1000);
    	       
    	  //To click window option
    	       driver.findElement(By.xpath("//a[text()='Windows']")).click();
    	       
    	       
    	       
    }
}
