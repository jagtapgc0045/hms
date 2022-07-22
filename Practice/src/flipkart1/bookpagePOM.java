package flipkart1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookpagePOM 
{
	
	@FindBy(xpath="//a[@class='s1Q9rs']") private List<WebElement> booknames;
	
	//initialize constructor
	public bookpagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void getbooknames()
	{
		//List<WebElement>b=booknames;
		for(WebElement a:booknames)
		{
			String  bnames=a.getText();
			System.out.println(bnames);
			ArrayList<String>booklist=new ArrayList<String>();
			booklist.add(bnames);
			
			
		}
		
	}
	

}
