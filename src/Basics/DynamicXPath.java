package Basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicXPath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class='a4bIc']")).sendKeys("Hond");
		//driver.findElement(By.xpath("//*[@name='q']")).sendKeys("honda");
//		List<WebElement> searchop= driver.findElements(By.xpath("//li[@class='sbct']"));
//		for(WebElement options:searchop)
//		{
//			String output=options.getText();
//		
//			System.out.println(output);
//			Thread.sleep(1000);
//			//if(output.equals(""))
//		}
	}

}
