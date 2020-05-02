package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TotalRowCells {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		String path = ".//data/Book1.xlsx";
		FileInputStream fis = new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		int lastRowNum = wb.getSheet("Sheet1").getLastRowNum();
		System.out.println("Row ="+lastRowNum);
		System.out.println("...............");
		
		for(int i =0;i<=lastRowNum;i++)
		{
			try
			{
				short lastCellNum = wb.getSheet("Sheet1").getRow(i).getLastCellNum();
				System.out.println("cell ="+lastCellNum);
			}
			catch(Exception e)
			{
				System.out.println("Blank");
			}
		}
	}

}
