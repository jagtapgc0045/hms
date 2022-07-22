package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Optionname1 
{
  
	public static void main(String[] args) throws InterruptedException 
    {
    	// step1
	    // set path of chromedriver exe file
				
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\\\Users\\\\computer1\\\\Desktop\\\\Selenium\\\\Browser\\\\chromedriver_win32\\\\chromedriver.exe");	
				
		// cerate object of chromedriver and provide referance of webdriver
			
				WebDriver driver=new ChromeDriver();
				
    	   driver.get("http://www.facebook.com/");
    	   
    	//click on create new account button
    	   driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
    	   
    	//Wait
    	   Thread.sleep(2000);
    	   
    	//Step-1-identify listbox and store into an object
    	   
    	 WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
    	 
    	 //step-2-create object of select class
    	 
    	 Select S=new Select(month);
    	 
    	 //to get name of selected option
    	 
    	 WebElement selectedoption=S.getFirstSelectedOption();
    	 
    	String text =selectedoption.getText();
    	System.out.println(text);
    }
}
