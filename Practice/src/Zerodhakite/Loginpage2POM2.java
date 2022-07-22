package Zerodhakite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2POM2
{
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement continuebtn;
	
	//constructor initialization
	public Loginpage2POM2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterpin(String PIN)
	{
		pin.sendKeys(PIN);
	}
	public void continuebtn()
	{
		continuebtn.click();
	}


}
