package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility_class 
{
	//PIN
	
	public static String getDataFromPF(String key) throws IOException
	{
		//create object of fileinoutstream class and path of the property file
		
		FileInputStream file=new FileInputStream("C:\\Users\\computer1\\eclipse-workspace\\12_feb_c_selenium\\Property_file.properties");
		
		//Create object of properties class
		
		Properties prop=new Properties();
		
		//To open property file
		
		prop.load(file);
		
		//To fetch data from property file
		
		String value1=prop.getProperty(key);
		
		return value1;
	}
	//To fetch data from excel sheet
	
	public static String getTD(int RowIndex,int CellIndex) throws EncryptedDocumentException, IOException
	{
		//To reach upto excel sheet
		FileInputStream file=new FileInputStream("C:\\Users\\computer1\\Desktop\\Selenium\\12_feb_morning.xlsx");
		
		//To open excel sheet
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet7");
		
		String value2=sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		
		return value2;
	}
	//To capture screenshot
	public static void Screenshot(WebDriver driver) throws IOException
	{
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("C:\\Users\\computer1\\Desktop\\Selenium\\screenshot\\sample3.jpg");
		
		FileHandler.copy(Source, Destination);
	}
	

}
