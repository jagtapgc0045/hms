package TheInternetAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragDropPOM3 
{
	@FindBy(xpath="//a[text()='Drag and Drop']")private WebElement clickondragdrop;
	@FindBy(xpath="//div[@id='column-a']")private WebElement a;
	@FindBy(xpath="//div[@id='column-b']")private WebElement b;
	
	//initialize constructor
		public DragDropPOM3(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void pom3actions(WebDriver driver) throws InterruptedException
		{
			clickondragdrop.click();
			Thread.sleep(500);
			Actions act=new Actions(driver);
			act.dragAndDrop(a, b).perform();
			Thread.sleep(2500);
			driver.navigate().back();
		}
	
}
