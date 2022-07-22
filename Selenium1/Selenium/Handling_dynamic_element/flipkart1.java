package Handling_dynamic_element;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart1 
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
    	       
    	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	       
    	       //close pop-up
    	       
    	       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    	       
    	       Thread.sleep(1000);
    	       
    	       //Enter data
    	       
    	       driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Redmi note 10s");
    	       
    	       //click on search button
    	       
    	       driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
    	       
    	       //Identify rating element
    	       
    	       String Rating=driver.findElement(By.xpath("((//div[@class='_1AtVbE col-12-12'])[3]//span)[6]")).getText();
    	       
    	       System.out.println(Rating);
    	       
    	       
    }
    	       

}
