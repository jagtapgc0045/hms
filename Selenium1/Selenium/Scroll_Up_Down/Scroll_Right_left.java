package Scroll_Up_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Right_left 
{
 public static void main(String[] args) 
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
				
 	       driver.get("https://demo.guru99.com/test/guru99home/");
 	       
 	       driver.manage().window().maximize();
 	       
 	       //Identify element upto we have to sroll
 	       WebElement ele=driver.findElement(By.xpath("//div[@class='canvas-middle'][6]"));
 	       
 	       //To scroll Horizontally
 	       ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);
 }

}
