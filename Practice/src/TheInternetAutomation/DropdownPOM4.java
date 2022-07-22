package TheInternetAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropdownPOM4 
{
	@FindBy(xpath="//a[text()='Dropdown']")private WebElement clickondropdown;
	@FindBy(xpath="//select[@id='dropdown']")private WebElement dropdown;
	
	//constructor initialization
	public DropdownPOM4(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void pom4actions(WebDriver driver) throws InterruptedException
	{
		clickondropdown.click();
		Select s1=new Select(dropdown);
		
		s1.selectByIndex(0);
		Thread.sleep(1000);
		s1.selectByIndex(1);
		Thread.sleep(1000);
		s1.selectByIndex(2);
		driver.navigate().back();

	}



}
