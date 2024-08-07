package Besant.seleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowser {
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:/Users/91970/Desktop/Drivers/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:/Users/91970/Desktop/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com");
//		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[starts-with(@ id,'u')]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@ id,'pass')]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit' or @id='login-button']")).click();
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		driver.findElement(By.xpath("//button[.='Add to cart']")).click();  
//		driver.findElement(By.xpath("//a[.='Dynamic Controls']")).click();

	}

}
