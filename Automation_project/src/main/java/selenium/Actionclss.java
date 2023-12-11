package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclss {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		WebElement elct = driver.findElement(By.xpath("//div[@aria-label='Electronics']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(elct).perform();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("ashok");
		ac.doubleClick(search).perform();

	}

}
