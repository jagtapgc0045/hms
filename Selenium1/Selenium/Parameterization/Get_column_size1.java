package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Get_column_size1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach excel sheet
		
		FileInputStream file=new FileInputStream("C:\\Users\\computer1\\Desktop\\Selenium\\12_feb_morning.xlsx");
		
	    int cellsize=WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getLastCellNum();
	    
	    System.out.println(cellsize);
	}
		
	
	
	
	
}
