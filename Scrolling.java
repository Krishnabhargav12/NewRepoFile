package Besant.seleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolling {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/alerts");
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("scrollBy(0,200)");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
	}
}
