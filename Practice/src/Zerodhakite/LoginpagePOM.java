package Zerodhakite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpagePOM 
{
	@FindBy(xpath="//input[@id='userid']")private WebElement userid;
	@FindBy(xpath="//input[@id='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginbtn;
	
	//constructor initialization
	public LoginpagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//perform actions on webelement
	public void enterUN(String UN)
	{
		userid.sendKeys(UN);
		
	}
	public void enterPSW(String PSW)
	{
		password.sendKeys(PSW);
	}
	public void clicklogin()
	{
		loginbtn.click();
	}
	

	
	

}
