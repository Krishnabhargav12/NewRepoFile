package Besant.seleniumTutorials;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordFrames {
	static WebDriver driver;
	public static void ReadData() throws IOException {
		
		 FileInputStream file = new FileInputStream("C:/Users/91970/Desktop/New folder (2)/KeywordDrivenTest.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		 XSSFSheet sheet = workbook.getSheetAt(0);
		 
		 for (int i = 1; i <sheet.getPhysicalNumberOfRows() ; i++) {
			 XSSFRow row = sheet.getRow(i);
			  String keyword = row.getCell(0).getStringCellValue();
			   String para1 = row.getCell(1).getStringCellValue();
			   String para2 = row.getCell(2).getStringCellValue();
			   KeywordFrames.Perform(keyword,para1,para2);
		}
		 
		 workbook.close();		
	}
	
	public static void Perform(String keyword, String para1, String para2) {
		
		switch (keyword) {
		case "OpenBrowser":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
			
		case "NavigateToUrl":
			driver.get(para1);
			break;
			
		case "EnterUName":
			driver.findElement(By.xpath(para1)).sendKeys(para2);
			break;
			
		case "EnterPassword":
			driver.findElement(By.xpath(para1)).sendKeys(para2);
//			driver.findElement(By.xpath("//input[@id='login-button']")).click();
			break;
			
		case "ClickLogin":
			driver.findElement(By.xpath(para1)).click();
			break;
		
		}
	}
	
	public static void main(String[] args) throws IOException {
		KeywordFrames.ReadData();
	}
		
}
