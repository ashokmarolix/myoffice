package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popups {

	public static void main(String[] args) throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		Thread.sleep(5000);
//		WebElement promt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
//		promt.click();
//		Alert a = driver.switchTo().alert();
//		System.out.println(a.getText());
//		a.sendKeys("ashok");
//		a.accept();
		
		

//		WebElement alert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
//		alert.click();
//		Alert a = driver.switchTo().alert();
//		a.accept();

	}

}
