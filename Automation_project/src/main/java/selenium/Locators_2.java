package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.findElement(By.id("")).sendKeys("sureshbabuemp@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("ZPMHQHIA");
		driver.findElement(By.xpath(null))
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.id("email")).sendKeys("ashok");
//		driver.findElement(By.id("pass")).sendKeys("ashok@132");
//		driver.findElement(By.name("login")).click();
		// driver.findElement(By.linkText("Forgotten password?")).click();
		// driver.findElement(By.partialLinkText("Forgotten pa")).click();
		// driver.findElement(By.cssSelector("#email")).sendKeys("ak");
		// driver.findElement(By.cssSelector("[class=\"inputtext _55r1
		// _6luy\"]")).sendKeys("kowsi");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashok");
//		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("ashok@123");
//		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

}
