package Besant.seleniumTutorials;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiWind {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//a[@href='#Seperate']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		Iterator<String> iter = handles.iterator();
	
		String parentTab = iter.next();
	    System.out.println(driver.getTitle());
	    
	    String childTab = iter.next();
	    
	    Thread.sleep(1000);
	    
	    driver.switchTo().window(childTab);
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("//a[@href='/downloads']")).click();
	    System.out.println(driver.getTitle());

	    
	  
	}

}
