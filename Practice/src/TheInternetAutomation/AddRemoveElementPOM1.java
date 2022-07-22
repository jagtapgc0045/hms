package TheInternetAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementPOM1 {
	@FindBy(xpath = "//a[text()='Add/Remove Elements']")
	private WebElement clickonaddremove;
	@FindBy(xpath = "//button[text()='Add Element']")
	private WebElement clickonadd;
	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement clickonremove;

	// initialize constructor
	public AddRemoveElementPOM1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// perform actions on webelement
	public void pom1actions(WebDriver driver) throws InterruptedException {
		clickonaddremove.click();
		for (int i = 0; i <= 10; i++) {
			clickonadd.click();
			Thread.sleep(100);

		}
		for (int i = 10; i >= 0; i--) {
			clickonremove.click();
			Thread.sleep(100);
		}
		driver.navigate().back();
	}

}
