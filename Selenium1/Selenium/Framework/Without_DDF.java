package Framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF 
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
				
    	       driver.get("https://kite.zerodha.com/");
    	       
    	       driver.manage().window().maximize();
    	       
    	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	       
    	       //Enter user Id
    	       
    	       driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("FQD650");
    	       
    	       //Enter password
    	       
    	       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mahesh@1118");
    	       
    	       Thread.sleep(1000);
    	       
    	       //click on log in button
    	       
    	       driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
    	       
    	       //Enter pin
    	       
    	       driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("181118");
    	       
    	       Thread.sleep(1000);
    	       
    	       //click on continue button
    	       
    	       driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
    	       
    	       String ExpUserId="FQD650";
    	      
    	      //get the user id
    	       
    	       String ActUserID=driver.findElement(By.xpath("//span[text()='FQD650']")).getText();
    	       
    	       if(ExpUserId.equals(ActUserID))
    	       {
    	    	   System.out.println("Pass");
    	       }
    	       else
    	       {
    	    	   System.out.println("Fail");
    	       }
    	       
    	       Thread.sleep(5000);
    }
    	       
}
