package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Get_row_size1
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//To reach excel sheet
		
		FileInputStream file=new FileInputStream("C:\\Users\\computer1\\Desktop\\Selenium\\12_feb_morning.xlsx");
		
	    int RowIndex=WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum();
	    
	    System.out.println(RowIndex);
	}
		
}
