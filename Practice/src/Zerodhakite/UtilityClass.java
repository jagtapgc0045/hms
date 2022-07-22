package Zerodhakite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass
{
	public static String getcredentials(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\ashis\\eclipse-workspace\\Practice\\src\\Zerodhakite\\zerodhacredential.properties");
		Properties prop=new Properties();
		prop.load(file);
		String cred=prop.getProperty(key);
		return cred;	
	}
	
	public String expectedTD(int row,int col) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\ashis\\Documents\\EclipseTestData.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
		String Exp=sh.getRow(row).getCell(col).getStringCellValue();
		return Exp;
	}

}
