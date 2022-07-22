package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name1 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		// step1
	    // set path of chromedriver exe file
				
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\\\Users\\\\computer1\\\\Desktop\\\\Selenium\\\\Browser\\\\chromedriver_win32\\\\chromedriver.exe");	
				
			   // cerate object of chromedriver and provide referance of webdriver
			
				WebDriver driver=new ChromeDriver();
				
				//Enter url
				driver.get("file:///C:/Users/computer1/Desktop/Automation/name.html");
				
				//Enter un
				driver.findElement(By.name("1234")).sendKeys("ABC");
				
				//Ener password
				driver.findElement(By.name("5678")).sendKeys("XYZ");
				
	
	
	}
	
	

}
