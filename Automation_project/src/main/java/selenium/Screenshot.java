package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(5000);
		WebElement india = driver.findElement(By.xpath("//img[@alt='India']"));
	File from =	india.getScreenshotAs(OutputType.FILE);
	File to = new File("C:\\\\Users\\\\lenovo\\\\OneDrive\\\\Pictures\\\\Screenshots\\\\redbusindia.png");
	Files.copy(from, to);
		
		
		
		
		

//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File sre = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\lenovo\\OneDrive\\Pictures\\Screenshots\\redbus.png");
//		Files.copy(sre, dest);

	}

}
