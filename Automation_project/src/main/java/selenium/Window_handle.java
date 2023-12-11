package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Window_handle {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Help']")).click();
		String child = driver.getWindowHandle();
		System.out.println(child);
		System.out.println(driver.getTitle());

	}

}
