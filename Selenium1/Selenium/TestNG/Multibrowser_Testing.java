package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Multibrowser_Testing 
{
	@Parameters("browserName") //firefox
	@Test
	public void TC1(String browserName) throws InterruptedException
	{
		WebDriver driver=null;
		
		if(browserName.equals("Chrome"))
		{
			 System.setProperty("webdriver.chrome.driver",
					  "C:\\\\Users\\\\computer1\\\\Desktop\\\\Selenium\\\\Browser\\\\chromedriver_win32\\\\chromedriver.exe");	
								
			 //create object of chromedriver class and provide reference of webdriver interfce
			 driver=new ChromeDriver();
		}
		else if(browserName.equals("Firefox"))
	    {
	    	 System.setProperty("webdriver.gecko.driver",
	    			 "C:\\Users\\computer1\\Desktop\\Firefox\\geckodriver.exe");	
	    	 
	    	 driver=new FirefoxDriver();
	    }
		
		   driver.get("https://kite.zerodha.com/");
	       
	       driver.manage().window().maximize();
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	      //Enter User Id
	       
	       driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("FQD650");
	       
	       Thread.sleep(1000);
	       
	       //Enter Password
	       
	       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mahesh@1118");
	       
	       Thread.sleep(1000);
	       
	       //click on log in button
	       
	       driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	       
	       Thread.sleep(1000);
	       
	       //Enter pin
	       
	       driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("181118");
	       
	       Thread.sleep(1000);
	       
           //click on continue button
	       
	       driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	       
            String ExpectedUserID="FQD650";
            
            String ActualUserId=driver.findElement(By.xpath("//span[text()='FQD650']")).getText();
 	       
 	       if(ExpectedUserID.equals(ActualUserId)) 
 	       {
 	    	   System.out.println("Pass");
 	       }
 	       else
 	       {
 	    	   System.out.println("Fail");
 	       }
 	       
 	       Thread.sleep(3000);
 	       
 	       driver.close();
	       
	}

}
