package Actions_class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 
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
				
    	       driver.get("https://www.flipkart.com/");
    	       
    	       driver.manage().window().maximize();
    	       
    	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	       
    	       //close pop-up
    	       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    	       
    	       //step-1-Identify cart and store into an object
    	       WebElement cart=driver.findElement(By.xpath("//span[text()='Cart']"));
    	       
    	       //step-2-Create object of Actions class
    	       
    	       Actions act=new Actions(driver);
    	       
    	       //To perform Right click opertion
    	       
    	       act.contextClick(cart).perform();

    }
    	       

}
