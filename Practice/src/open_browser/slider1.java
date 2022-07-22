package open_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class slider1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");;
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demo.automationtesting.in/Slider.html");
		Actions act=new Actions(driver);
		//a[@class='ui-slider-handle ui-state-default ui-corner-all']
		WebElement source=driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
		//WebElement start=driver.findElement(By.xpath("//a[@style='left: 0%;']"));
		//WebElement end=driver.findElement(By.xpath("//a[@style='left: 90%;']"));
		act.dragAndDropBy(source, 500, 0).perform();
		//act.clickAndHold(source).perform();
		//act.moveByOffset(50, 0).perform();
		
		
	}

}
