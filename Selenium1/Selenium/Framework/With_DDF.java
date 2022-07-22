package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_DDF 
{
	public static void main(String[] args) throws InterruptedException, IOException 
    {
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
    	       
    	       //To reach to excel sheet
    	       
    	       FileInputStream file=new FileInputStream("C:\\Users\\computer1\\Desktop\\Selenium\\12_feb_morning.xlsx");
    	       
    	       Sheet sh=WorkbookFactory.create(file).getSheet("Sheet6");
    	       
    	       //Enter User Id
    	       String UserID=sh.getRow(0).getCell(0).getStringCellValue();
    	       
    	       driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UserID);
    	       
    	       Thread.sleep(1000);
    	       
    	       //Enter Password
    	       String Password=sh.getRow(0).getCell(1).getStringCellValue();
    	       
    	       driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
    	       
    	       Thread.sleep(1000);
    	       
    	       //click on log in button
    	       
    	       driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
    	       
    	       Thread.sleep(1000);
    	       
               //Enter pin
    	       String PIN=sh.getRow(0).getCell(2).getStringCellValue();
    	       
    	       driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
    	       
    	       Thread.sleep(1000);
    	       
               //click on continue button
    	       
    	       driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
    	       
    	       //verify userID
    	       
    	       String ExpectedUserID=sh.getRow(0).getCell(3).getStringCellValue();
    	       
    	       //get User Id
    	       
    	       String ActualUserId=driver.findElement(By.xpath("//span[text()='FQD650']")).getText();
    	       
    	       if(ExpectedUserID.equals(ActualUserId)) 
    	       {
    	    	   System.out.println("Pass");
    	       }
    	       else
    	       {
    	    	   System.out.println("Fail");
    	       }
    	       
    	       
    	       
    	       
    	       
    }

}
