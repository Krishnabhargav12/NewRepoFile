package Besant.seleniumTutorials;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowFunc {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
//		driver.findElement(By.xpath("//a[.='SwitchTo']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[.='Windows']")).click();
//		System.out.println(driver.getWindowHandle());
////		
		driver.findElement(By.xpath("//a[@href='#Seperate']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		System.out.println(driver.getTitle());
		
//		System.out.println(driver.getWindowHandles());

		
	}
}
