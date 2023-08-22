package seleniumQue;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int rescode = 200;
		int brknlinkcount = 0;
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			try {
				URL urllink = new URL(url);
				HttpsURLConnection uc = (HttpsURLConnection) urllink.openConnection();
				uc.setRequestMethod("HEAD");
				uc.connect();
				rescode = uc.getResponseCode();

				if (rescode >= 400) {
					System.out.println("Broken Link-->" + url);
					brknlinkcount++;
				}

			} catch (MalformedURLException e) {

			} catch (Exception e) {

			}
		}
		System.out.println("Total link on page: " + links.size());
		System.out.println("Total Broken Links: " + brknlinkcount);

	}

}
