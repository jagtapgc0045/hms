package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample1 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach excel sheet
		
		FileInputStream file=new FileInputStream("C:\\Users\\computer1\\Desktop\\Selenium\\12_feb_morning.xlsx");
		
		//To open excel sheet 
		
		Workbook book=WorkbookFactory.create(file);
		
		//To enter particular sheet
		
		Sheet sh=book.getSheet("Sheet1");
		
		//To highlight row of excel sheet
		
		Row S1=sh.getRow(0);
		
		//To highlight cell/column of excel sheet
		
		Cell S2=S1.getCell(0);
		
		//To fetch information 
		
		String value=S2.getStringCellValue();
		
		System.out.println(value);
		
		
		
	}
}
