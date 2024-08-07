

package Besant.seleniumTutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frndProg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		
		WebElement target1 = driver.findElement(By.className("TSD49J")); //finding and hovering Electronics tab
		WebElement target2 = driver.findElement(By.xpath("//a[@class='TSD49J'][2]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(target1).perform();
		
//		act.click(target1);
		
		act.release(target1);
		Thread.sleep(6000);
		
		act.moveToElement(target2).perform();
		Thread.sleep(4000);
		
		act.release(target2);
		Thread.sleep(6000);
		
//		driver.close();
		

	}

}
