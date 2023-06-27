package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetsKodeIt {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		//radio button
		driver.findElement(By.xpath("//input[@id='bmwradio']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='benzradio']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='hondaradio']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='bmwcheck']")).click();
		Thread.sleep(1000);
		//driver.findElement(null)

		
	}
	
}
