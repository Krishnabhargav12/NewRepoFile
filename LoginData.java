package Besant.seleniumTutorials;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginData {
	
	 WebDriver driver;
	@DataProvider(name="loginData")
	public Object[][] loginData() throws IOException {
		
	  FileInputStream file = new FileInputStream("C:/Users/91970/Desktop/New folder/XlData.xlsx");
	  XSSFWorkbook workbook = new XSSFWorkbook(file);
      XSSFSheet sheet = workbook.getSheet("Data1");
      int rowCount=sheet.getPhysicalNumberOfRows();
      int colCount=sheet.getRow(0).getPhysicalNumberOfCells();
      Object[][] data = new Object[rowCount-1][colCount];
      for(int i=1;i<rowCount;i++) {
    	  XSSFRow row = sheet.getRow(i);
    	  for(int j=0;j<colCount;j++) {
    		  XSSFCell cell = row.getCell(j);
    		  data[i-1][j]=cell.toString();
    	  }
      }
      workbook.close();
      file.close();
      return data;
      
	}
	
	@Test(dataProvider="loginData")
	public void testLogin(String username,String password,String ExpectedResult) throws InterruptedException {
	    driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		String result;
		try {
			driver.findElement(By.id("inventory_container"));
			result="Success";
		}catch(Exception e) {
			result="Failure";
		}
		Assert.assertEquals(result, ExpectedResult);
//		driver.quit();
	}
	
	@AfterMethod
	public void tearDown() {
		if(driver != null)
		{
			driver.quit();
		}
	}
}