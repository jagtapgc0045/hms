package TheInternetAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass 
{
	WebDriver driver;
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.setBinary("C:\\\\Program Files\\\\BraveSoftware\\\\Brave-Browser\\\\Application\\\\brave.exe");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/");
		
	}
	
	public void closebrowser()
	{
		driver.close();
	}
}
