package Webtable;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 
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
				
    	       driver.get("file:///C:/Users/computer1/Desktop/Automation/Webtable.html");
    	       
    	       //identify table and enter 3rd row fetch 300
    	       
    	    WebElement s1=driver.findElement(By.xpath("//table[@border='1']//tr[4]/td[3]"));
    	    
    	       //to get text of 300
    	    
    	    String text=s1.getText();
    	    System.out.println(text);
    }
    	       
}
