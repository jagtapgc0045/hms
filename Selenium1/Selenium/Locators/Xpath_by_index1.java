package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_index1 
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
		    
		    //wait
		    Thread.sleep(2000);
		    
		    //click on create new account
		    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		    
		    //Enter surnmname
		    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("sarak");
		    
		    //enter firstname
		    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Mahesh");
		   
	}
}
