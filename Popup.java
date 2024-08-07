package Besant.seleniumTutorials;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		List<WebElement> tabs = driver.findElements(By.xpath("//a[@class='analystic']"));
		
		for(WebElement a : tabs) {
			System.out.println(a);
			tabs.get(2).click();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("krishna");
		Thread.sleep(2000);
//		System.out.println(gettext);
		driver.switchTo().alert().accept();
		
//		driver.quit();
		
	}
}
