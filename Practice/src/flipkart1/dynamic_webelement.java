package flipkart1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dynamic_webelement 
{
	
	@FindBy(xpath="//button[text()='✕']")private WebElement clickoncross;
	@FindBy(xpath="//input[@type='text']")private WebElement search;
	@FindBy(xpath="//button[@class='L0Z3Pu']")private WebElement searchbtn;
	@FindBy(xpath="((//div[@class='_4ddWXP'])[7]//span)[2]")private WebElement book1;
	@FindBy(xpath="((//div[@class='_4ddWXP'])[7]//a)[2]")private WebElement nameofbook;

	
	

	
	public  dynamic_webelement(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}
	
	//perform actions on webelement 
	public void getratings()
	{
		clickoncross.click();
		search.sendKeys("books");
		searchbtn.click();
		String bookrating=book1.getText();
		System.out.println("current rating of book="+bookrating);
		String ratingbookname=nameofbook.getText();
		System.out.println(ratingbookname);
		

		//rating.getText();
		
	}

}
