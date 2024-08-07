package Besant.seleniumTutorials;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicite {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofNanos(1));
	   driver.get("https://demoqa.com/alerts");
	   driver.manage().window().maximize();
	}
}
