package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement jsprompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		jsprompt.click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("ashok");
		a.accept();

//		WebElement jsconfim = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
//		jsconfim.click();
//        Alert a  =	driver.switchTo().alert();
//        System.out.println(a.getText());
//        a.dismiss();

//		WebElement jsalert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
//		jsalert.click();
//        Alert a  =	driver.switchTo().alert();
//        a.accept();

	}

}
