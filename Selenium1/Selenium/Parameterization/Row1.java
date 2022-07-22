package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Row1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach excel sheet
		
		FileInputStream file=new FileInputStream("C:\\Users\\computer1\\Desktop\\Selenium\\12_feb_morning.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet4");
		
		//find index of cell
		
		int lastcellindex=sh.getRow(0).getLastCellNum()-1;
		
		//Take a for loop for cell
		
		for(int i=0; i<=lastcellindex; i++)
		{
			String value=sh.getRow(0).getCell(i).getStringCellValue();
			
			System.out.println(value);
		}
		
	}
		

}
