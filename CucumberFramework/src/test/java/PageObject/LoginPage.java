package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath="//input[@id='Email']") WebElement email;
	//input[@id='Password']
	@FindBy(xpath="//input[@id='Password']") WebElement password;
	//button[text()='Log in']
	@FindBy(xpath="//button[text()='Log in']") WebElement loginbutton;
	@FindBy(xpath="//a[text()='Logout']") WebElement logoutbutton;

	public void enterEmail(String a) throws InterruptedException
	{
		email.clear();
		Thread.sleep(2000);
		email.sendKeys(a);
	}
	public void enterPassword(String b)
	{
		password.clear();
		password.sendKeys(b);
	}
	public void clicklogin()
	{
		loginbutton.click();
	}
	public void logout()
	{
		logoutbutton.click();
	}
	

}
