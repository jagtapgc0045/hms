package TheInternetAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contextmenuPOM2 
{
	@FindBy(xpath="//a[text()='Context Menu']")private WebElement clickoncontextmenu;
	@FindBy(xpath="//div[@id='hot-spot']")private WebElement clickonbox;

	//initialize constructor
	public contextmenuPOM2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void pom2actions(WebDriver driver)
	{
		clickoncontextmenu.click();
		Actions act=new Actions(driver);
		act.contextClick(clickonbox).perform();
		driver.switchTo().alert().accept();
		driver.navigate().back();
	}
}
