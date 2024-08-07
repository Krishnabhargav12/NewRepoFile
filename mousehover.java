package Besant.seleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		WebElement tar = driver.findElement(By.xpath("//span[.='Fashion']"));
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.moveToElement(tar).perform();
	}
}
