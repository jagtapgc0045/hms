package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_login_page1 
{
   //POM class1
	
	//data member/variables should be declared globally with across level private by using @findby annoation
	
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;  //Webelement UN=driver.findElement(By.xpath("//input[@id='userid']"))
	
	@FindBy(xpath="//input[@id='password']") private WebElement Password; //Webelement UN=driver.findElement(By.xpath("//input[@id='password']"))
	
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement loginbtn;
	
	
	//Initialize within a constuctor with across level public using pagefactory class
	
	public kite_login_page1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilize within a method with access level public
	
	public void enterUserID(String userid)
	{
		UN.sendKeys(userid);
	}
	
	public void enterPassword(String passwrd)
	{
		Password.sendKeys(passwrd);
	}
	
	public void clickonloginbtn()
	{
		loginbtn.click();
	}
	
	
}
