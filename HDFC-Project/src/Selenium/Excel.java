package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		String path = "E:/Automation Testing/Automation/Banking-Domain/HDFC-Project/data/Book1.xlsx";
		
		FileInputStream fis = new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		//Get Sheet
		Sheet sheet = wb.getSheet("Sheet1");
		
		//Get row
		Row row = sheet.getRow(4);
		
		//Get cell
		Cell cell = row.getCell(2);
		
		//Print
		String v = cell.toString();
		System.out.println(v);
	}

}
