package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite_home_page 
{
	//POM Class3
	
	//data member/variables should be declared globally with across level private by using @findby annoation
	
       @FindBy(xpath="//span[text()='FQD650']") private	WebElement USsrId;  //
       
       @FindBy(xpath="//a[@target='_self']")private WebElement logoutbtn;     //
       
     //Initialize within a constuctor with across level public using pagefactory class
       
       public kite_home_page(WebDriver driver)
       {
    	   PageFactory.initElements(driver, this);
       }
       
     //Utilize within a method with access level public
       
       public String getkitehomepageUserID()
       {
    	   String UserIDvalue=USsrId.getText();
    	   return UserIDvalue;
       }
       
       
       public void clikUserId()
       {
    	   USsrId.click();
       }
       
       public void clicklogoutbtn()
       {
    	   logoutbtn.click();
       }

}
