package flipkart1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass  extends BaseClass
{
	dynamic_webelement dynamic;
	bookpagePOM bookname;
	UtilityClass UClass;
	@BeforeClass
	public void ToopenBrowser()
	{
		openbrowser();
	}
	@BeforeMethod
	public void Tolauchflipkaart()
	{
		dynamic=new dynamic_webelement(driver);
		dynamic.getratings();
		bookname=new bookpagePOM(driver);
		bookname.getbooknames();
		
	}
	@Test(priority=0)
	public void Totest() throws EncryptedDocumentException, IOException
	{
		UClass=new UtilityClass();
		String book1=UClass.getTD(0, 1);
		String book2=UClass.getTD(1, 1);
		bookname.getbooknames();
	
	}
	
	@AfterMethod
	public void Toclosebrowser() throws InterruptedException
	{
		//closebrowser();
	}
	
	

}
