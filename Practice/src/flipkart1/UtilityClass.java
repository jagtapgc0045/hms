package flipkart1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
	public String getTD(int row,int col) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\ashis\\Documents\\BookNames.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		String EXPbookname=sh.getRow(row).getCell(col).getStringCellValue();
		return EXPbookname;
		
	}

}
