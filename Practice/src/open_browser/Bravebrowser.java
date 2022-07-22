package open_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bravebrowser 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");;
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/frames");
		WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		WebElement frame2=driver.findElement(By.xpath("//iframe[@id='frame2']"));

		driver.switchTo().frame(frame1);
		String framename=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(framename);
		driver.switchTo().frame(frame2);

		
		
		
	}

}
