package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_all_data 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach excel sheet
		
		FileInputStream file=new FileInputStream("C:\\Users\\computer1\\Desktop\\Selenium\\12_feb_morning.xlsx");
		
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet5");
		
		//To get last row index
		int lastrowindex =sh.getLastRowNum();
		
		//outer for loop for rows
		
		for(int i=0; i<=lastrowindex; i++) 
		{
			int lastcellindex=sh.getRow(i).getLastCellNum()-1;
			
			//inner for loop for cell
			
			for(int a=0; i<=lastcellindex; a++)
			{
				//fetch all the data
				
				String value=sh.getRow(i).getCell(a).getStringCellValue();
				
				System.out.println(value+"");
			}
			System.out.println();
		}
	}

}
