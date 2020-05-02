package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Modified {

	public static void main (String[] args) throws EncryptedDocumentException, IOException
	{
		String path = ".//data/Book1.xlsx";
		
		FileInputStream fis = new FileInputStream(path);
		
		Cell v = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(5).getCell(1);
		
		System.out.println(v);
				
	}
}