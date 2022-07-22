package Pop_up;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_pop_up 
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
				
    	       driver.get("http://www.flipkart.com/");
    	       
    	//wait
    	       Thread.sleep(2000);
    	       
    	//enter mobile no/email
    	       driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc");
    	       
    	//enter password
    	       driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("abc123");
    	       
    	//click on login button
    	       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
    }

}
