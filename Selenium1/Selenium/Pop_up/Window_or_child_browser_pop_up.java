package Pop_up;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_or_child_browser_pop_up 
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
				
    	       driver.get("https://skpatro.github.io/demo/links/");
    	       
    	//click on new tab button
    	       
    	       driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
    	       
    	//wait
    	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	       
    	       Set<String> ID=driver.getWindowHandles();
    	       
    	       ArrayList<String> al=new ArrayList<String>(ID);
    	       
    	//to get main pg id
    	       
    	       String mainpgid=al.get(0);
    	       System.out.println(mainpgid);
    	       
    	//to get window pop id
    	       
    	       String windowpopupid=al.get(1);
    	       System.out.println(windowpopupid);
    	       
    	     
    	       
    	//shift focus of selenium on window pop-up
    	       
    	       driver.switchTo().window(windowpopupid);
    	       
    	//click on training link
    	       
    	       driver.findElement(By.xpath("(//span[@class='menu-text'])[22]")).click();
    	       
    	//shift focus of selenium from window pop-up to main page
    	       
    	       driver.switchTo().window(mainpgid);
    	       
    }
    	       
}
