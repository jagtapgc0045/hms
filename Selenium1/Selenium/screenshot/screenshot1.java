package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class screenshot1 
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
				
    	       driver.get("http://www.facebook.com/");
    	   
    	//Take screenshot   
    	   File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    
    	   System.out.println(src);
    	   
    	 //create object of file
    	   
    	   File dest=new File("C:\\Users\\computer1\\Desktop\\Selenium\\screenshot\\sample.jgp");
    	   
    	 //copy screenshot to destination folder
    	   
    	   FileHandler.copy(src, dest);
    }
}
