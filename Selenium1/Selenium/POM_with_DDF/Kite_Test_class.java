package POM_with_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_Test_class 
{
	public static void main(String[] args) throws InterruptedException, IOException 
    {
		//To reach upto the excelsheet
		
		FileInputStream file=new FileInputStream("C:\\Users\\computer1\\Desktop\\Selenium\\12_feb_morning.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet6");
		
		
    	// step1
	    // set path of chromedriver exe file
		
		//parameter1-Name of the browser
		//parameter2-Path of the chromedriver.exe file
				
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\\\Users\\\\computer1\\\\Desktop\\\\Selenium\\\\Browser\\\\chromedriver_win32\\\\chromedriver.exe");	
				
		// cerate object of chromedriver and provide referance of webdriver
			
				WebDriver driver=new ChromeDriver();
				
		//to enter url on the browser		
				
    	       driver.get("https://kite.zerodha.com/");
    	       
    	       driver.manage().window().maximize();
    	       
    	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	       
    	       //create object of POM class1
    	       kite_login_page1 login1=new kite_login_page1(driver);
    	       
    	       //Fetch user ID from excelsheet
    	       
    	       String UIDinfo=sh.getRow(0).getCell(0).getStringCellValue();
    	       login1.enterUserID(UIDinfo);
    	       
    	       //Fetch password from excelsheet
    	       
    	       String psw=sh.getRow(0).getCell(1).getStringCellValue();
    	       login1.enterPassword(psw);
    	       
    	       login1.clickonloginbtn();
    	       
    	       //create object of POM class2
    	       kite_login_page2 login2=new kite_login_page2(driver);
    	       
    	       //Fetch Pin from excelsheet
    	       String pininfo=sh.getRow(0).getCell(2).getStringCellValue();
    	       login2.enterpin(pininfo);
    	       
    	       login2.clickoncntbtn();
    	       
    	       //create object of POM class3
    	       kite_home_page homepg=new kite_home_page(driver);
    	       
    	       //fetch expected userID
    	       String expectedUserIDinfo=sh.getRow(0).getCell(3).getStringCellValue();
    	       
    	       homepg.verifyUserID(expectedUserIDinfo);
    	       
    	       driver.close();
    	       
    }

}
