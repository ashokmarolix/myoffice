package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Following {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']/following::input[@id='pass']")).sendKeys("ashok@123");
        driver.findElement(By.xpath("//input[@id='pass']/preceding::input[@name='email']")).sendKeys("ashok@143");
        WebElement lonin =driver.findElement(By.xpath("//input[@name='email']/ancestor::div[@class='_6luv _52jv']/descendant::button[text()='Log in']"));
        lonin.click();
	}

}
