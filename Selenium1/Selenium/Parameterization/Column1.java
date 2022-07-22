package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Column1 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach excel sheet
		
		FileInputStream file=new FileInputStream("C:\\Users\\computer1\\Desktop\\Selenium\\12_feb_morning.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet4");
		
		//To get last row index
		int lastrowindex =sh.getLastRowNum();
		
		//Take for loop for row
		for(int i=0; i<=lastrowindex; i++)
		{
			String value=sh.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(value);
			
		}
	}
}
