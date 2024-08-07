package Besant.seleniumTutorials;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData_DataDriven {
	public static void main(String[] args) throws IOException {
		  FileOutputStream file = new FileOutputStream("C:/Users/91970/Desktop/New folder/XlData.xlsx");
		   XSSFWorkbook workbook = new XSSFWorkbook();
		    XSSFSheet sheet = workbook.createSheet("Data1");
		     XSSFRow Row0 = sheet.createRow(0);
		     Row0.createCell(0).setCellValue("username");
		     Row0.createCell(1).setCellValue("password");
		     
		     XSSFRow Row1 = sheet.createRow(1);
		     Row1.createCell(0).setCellValue("standard_user");
		     Row1.createCell(1).setCellValue("standard_pass");
		     
		     workbook.write(file);
		     workbook.close();
		     file.close();
		     
		     

	}
}
