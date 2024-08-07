package Besant.seleniumTutorials;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.model.WorkbookRecordList;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public static void main(String[] args) throws IOException {
		 FileInputStream file = new FileInputStream("C:/Users/91970/Documents/data_driven_testing.xlsx");
		  XSSFWorkbook workbook = new XSSFWorkbook(file);
		  XSSFSheet sheet = workbook.getSheet("Sheet1");
		  int totalrows = sheet.getLastRowNum();
		  short totalcells = sheet.getRow(totalrows).getLastCellNum();
		   
		   System.out.println("Total rows:"+ totalrows);
		   System.out.println("Total cells:"+ totalcells);
		   
		   for (int i = 0; i <=totalrows; i++) {
			   
			   for (int j = 0; j < totalcells; j++) {
				   
				  System.out.print(sheet.getRow(i).getCell(j).toString()+ "\t");				
			}			   
			   System.out.println();			
		}		   
		   file.close();
		   workbook.close();  
	}
		
}
