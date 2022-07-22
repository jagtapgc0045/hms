package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed1 
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
		
		//verify facebook logo displayed or not
		boolean result =driver.findElement(By.xpath("")).isDisplayed();
		
		System.out.println(result);
		
	}
}
