package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("ashok@123");
		
		
		
		
		

//		driver.findElement(By.id("email")).sendKeys("ashokboya93@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("Ashok@143");
//		driver.findElement(By.name("login")).click();
		// driver.findElement(By.linkText("Forgotten password?")).click();
		// driver.findElement(By.partialLinkText("Forgotten pa")).click();

	}

}
