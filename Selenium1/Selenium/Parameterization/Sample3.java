package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample3 
{

	//To fetch numeric type data
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			//To reach excel sheet
			
			FileInputStream file=new FileInputStream("C:\\Users\\computer1\\Desktop\\Selenium\\12_feb_morning.xlsx");
			
			double value=WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();
			
			System.out.println(value);
			
			
			
			
		}

}
