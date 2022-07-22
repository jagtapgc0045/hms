package open_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser2 
{
	public static void main(String[]args)
	{
		//provide the path of driver
		//parameter1:Name of the driver
		//parameter2:path of the driver
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		//Create the object of chromedriver and provide the reference of webdriver interface 
		//for performing webdriver actions on it
		WebDriver driver=new ChromeDriver();
		
		
	}

}
