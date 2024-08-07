package Besant.seleniumTutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementsFind {
	public static void main(String args[]) throws InterruptedException {
    	WebDriver driver = new FirefoxDriver();

		driver.get("https://www.bewakoof.com/");
		driver.manage().window().maximize();
	    List<WebElement> tabs = driver.findElements(By.xpath("//a[@class = 'menuSelectWrpr']"));
		
		// To print the values of each element we use for each loop.
		
		for(WebElement a : tabs) {
			System.out.println(a);
		}
		
		// Performing click action using get() in get method & indexing starts from 0

		tabs.get(0).click();
		Thread.sleep(5000); 
		


	}
}
