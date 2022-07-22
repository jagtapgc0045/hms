package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_login_page2 
{
	//POM Class2
	
	//data member/variables should be declared globally with across level private by using @findby annoation
	
     @FindBy(xpath="//input[@id='pin']") private WebElement PIN;
     
     @FindBy(xpath="//button[@class='button-orange wide']") private WebElement ctnbtn;
     
   //Initialize within a constuctor with across level public using pagefactory class
     
     public kite_login_page2(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
   //Utilize within a method with access level public
     
     public void enterpin(String pin)
     {
    	 PIN.sendKeys(pin);
     }
     
     public void clickoncntbtn()
     {
    	 ctnbtn.click();
     }

}
