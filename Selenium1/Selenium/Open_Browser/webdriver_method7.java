package Open_Browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method7 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// step1
		// set path of chromedriver exe file
		//parameter 1- name of the browser
		//parameter 2- path of the chrome browser
		
	System.setProperty("webdriver.chrome.driver",
	"C:\\\\Users\\\\computer1\\\\Desktop\\\\Selenium\\\\Browser\\\\chromedriver_win32\\\\chromedriver.exe");	
		
	   // cerate object of chromedriver and provide referance of webdriver
	
		WebDriver driver=new ChromeDriver();
		
	   //to enter URL on browser
	
	   driver.get("https://kite.zerodha.com/");
	   
	   //To get position of web browser
	   
	    Point P2 =driver.manage().window().getPosition();
	    System.out.println(P2);
	   
	
	}
	
}
