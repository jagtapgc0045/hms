package TheInternetAutomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class UtilityClass 
{
	WebDriver driver;
	public static String getTD(int row,int col) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\ashis\\Documents\\EclipseTestData.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("TheInternet");
		String data=sh.getRow(row).getCell(col).getStringCellValue();
		return data;
	}

}
