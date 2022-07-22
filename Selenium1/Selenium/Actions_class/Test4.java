package Actions_class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4
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
				
    	       driver.get("https://demo.guru99.com/test/simple_context_menu.html");
    	       
    	       driver.manage().window().maximize();
    	       
    	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	       
    	       
    	       //step-1-Identify cart and store into an object
    	       WebElement button=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
    	       
    	       //step-2-Create object of Actions class
    	       
    	       Actions act=new Actions(driver);
    	       
    	       //To perform Right click opertion
    	       
    	       act.doubleClick(button).perform();

    }
    	       
}
