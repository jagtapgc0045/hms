package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Contains_by_using_text1 
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
		    
		    //click on forgot password link
		    driver.findElement(By.xpath("//a[contains(text(),' password?')]")).click();
		    
	
	}	
}
