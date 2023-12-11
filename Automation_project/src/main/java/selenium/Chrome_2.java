package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		// String s = driver.getCurrentUrl();
		// System.out.println(s);
		// String a = driver.getPageSource();
		// System.out.println(a);
		// String b = driver.getTitle();
		// System.out.println(b);
//		Dimension d = new Dimension(300, 300);
//		driver.manage().window().setSize(d);
//		Point p = new Point(300, 400);
//		driver.manage().window().setPosition(p);

	}

}
