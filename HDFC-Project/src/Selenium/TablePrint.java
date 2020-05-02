package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TablePrint {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		String path = ".//data/Book1.xlsx";
		FileInputStream fis = new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=3;j++)
			{
				String v = wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
			     System.out.print(v+" ");
			}
			System.out.println();
		}
	}
}
