package Besant.seleniumTutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextFun {
	public static void main(String args[]) {
   
	WebDriver driver = new FirefoxDriver();
	driver.get("C:\\Users\\91970\\Desktop\\sibling.html");
	driver.manage().window().maximize();
	WebElement text = driver.findElement(By.xpath("//p[.='First paragraph in subsection 1']"));
	System.out.println("Current element is:"+ text.getText());
	
//											String followText = driver.findElement(By.xpath("//p[.='First paragraph in subsection 1']/following-sibling::p")).getText();
//	System.out.println("Following element is:" + followText);
	
//	 									 WebElement followText = driver.findElement(By.xpath("((//p[.='First paragraph in subsection 1'/following::p]) [1])"));
//	System.out.println("Following element is:" + followText.getText());
	
	
	System.out.println("The 1st element of current element is: "+driver.findElement(By.xpath("(//p[.='First paragraph in subsection 1']/following::p)[1]")).getText());
	 
	

	}
}
