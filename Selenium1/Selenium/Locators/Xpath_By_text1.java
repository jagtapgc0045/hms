package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_text1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// step1
	    // set path of chromedriver exe file
				
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\\\Users\\\\computer1\\\\Desktop\\\\Selenium\\\\Browser\\\\chromedriver_win32\\\\chromedriver.exe");	
				
			   // cerate object of chromedriver and provide referance of webdriver
			
				WebDriver driver=new ChromeDriver();
				
		    //Enter URL
		    driver.get("https://www.facebook.com/");
		
		    // Enter username
		    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("MAHESH");
				
			//wait
			Thread.sleep(1500);
				
			//Enter password using------attributes
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mahesh@123");
				
			//wait
			Thread.sleep(1500);
				
		   //Click on login button using -------text
			driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		
	}
	
	
}
