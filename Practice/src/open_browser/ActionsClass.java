package open_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	// WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		;
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.youtube.com/");
		// driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Apache
		// maven");
		// driver.findElement(By.xpath("(//yt-icon[@class='style-scope
		// ytd-searchbox'])[3]")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		// act.scrollByAmount(0, -700).perform();
		/*
		 * for(int i=0;i<=25;i++) { act.keyDown(Keys.ARROW_DOWN).perform();
		 * Thread.sleep(500); }
		 */
		// WebElement
		// down=driver.findElement(By.xpath("(//yt-formatted-string[@id='video-title'])[10]"));
		// act.scrollToElement(down).perform();
		((JavascriptExecutor) driver).executeScript("window.scrollby(0,-200)");
	}

}
