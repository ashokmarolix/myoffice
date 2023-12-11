package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Window_Handles {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//span[text()='Help']")).click();
		Set<String> id = driver.getWindowHandles();
		Iterator<String> ids = id.iterator();
		String parent = ids.next();
		System.out.println(parent);
		System.out.println(driver.getTitle());
		String child = ids.next();
		System.out.println(child);
		System.out.println(driver.getTitle());

	}

}
