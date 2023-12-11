package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Disableelements {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("sureshbabuemp@gmail.com");
		driver.findElement(By.xpath("//input[@id='pword']")).sendKeys("ZPMHQHIA");
		driver.findElement(By.xpath("//button[@class='btn green_btn']")).click();
		Thread.sleep(5000);
		WebElement inv = driver.findElement(By.xpath("//i[@class='fa fa-houzz']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(inv).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/Inventory/InventoryData']")).click();
		Thread.sleep(5000);
		
		// driver.findElement(By.id("//span[@title='Good']")).click();
		// List<WebElement> ex =
		// driver.findElements(By.xpath("//span[@title='Good']//span"));
//		for (WebElement option : ex) {
//			System.out.println(option.getText());
//			if (option.getText().equals("Good")) {
//				option.click();

//	}
//
//}
	}
}
