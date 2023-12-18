package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownpage {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		WebElement aprtc = driver.findElement(By.xpath("//img[@src='https://st.redbus.in/Images/carousel/TSRTC.png']"));
		Thread.sleep(2000);
		Point loc = aprtc.getLocation();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("window.scrollby" + loc);
//
//		js.executeScript("window.scrollby(450,2000)");
//
//		js.executeScript("window.scrollto(0, document.body.scrollHeight)");

	}

}
