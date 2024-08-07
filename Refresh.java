package Besant.seleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Refresh {
		public static void main(String[] args) {
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.saucedemo.com");
			driver.manage().window().maximize();
//			driver.findElement(By.id("user-name")).sendKeys("standard_user");
//			driver.findElement(By.id("password")).sendKeys("secret_sauce");
		     WebElement var = driver.findElement(By.id("login-button"));
		     var.click();
			driver.navigate().refresh();
			var.click();
			
			
		}
}
