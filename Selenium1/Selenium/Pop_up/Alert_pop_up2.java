package Pop_up;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pop_up2 
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
				
    	       driver.get("https://demo.guru99.com/test/delete_customer.php");
    	       
    	//wait
    	       Thread.sleep(2000);
    	       
    	//enter customer id
    	       driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc");
    	       
    	//click on submit button
    	       driver.findElement(By.xpath("//input[@name='submit']")).click();
    	       
    	//shift to alert pop-up
    	       Alert alt=driver.switchTo().alert();
    	       
    	//wait  
    	       Thread.sleep(2000);
    	       
    	//click on ok button
    	       alt.dismiss();
    	       
    	       
    	       
    	       
    }


}
