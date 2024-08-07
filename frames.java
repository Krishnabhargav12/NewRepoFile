package Besant.seleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		driver.switchTo().frame("frame1");
		String find = driver.findElement(By.xpath("//body[.='Parent frame']")).getText();
		System.out.println(find);
		
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.xpath("//h1[.='Nested Frames']")).getText());
		
		
	}
}
