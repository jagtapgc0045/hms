package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute1 
{

	public static void main(String[] args) 
	{
		// step1
	    // set path of chromedriver exe file
				
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\\\Users\\\\computer1\\\\Desktop\\\\Selenium\\\\Browser\\\\chromedriver_win32\\\\chromedriver.exe");	
				
			   // cerate object of chromedriver and provide referance of webdriver
			
				WebDriver driver=new ChromeDriver();
				
		//Enter URL
		driver.get("https://www.facebook.com/");
		
		//Enter username
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("MAHESH");
		
		//Enter password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mahesh@123");
		
	}
	
	
	
	
}
