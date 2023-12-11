package com.empirem.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public static Properties prop;
	public static WebDriver driver;

	public BaseTest() throws Throwable {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream(
					"C:\\Users\\sk\\ashok eclipse\\Empiremaster\\src\\main\\java\\com\\empirem\\qa\\comfig\\comfig.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public static void initialization() throws Throwable {
		String BrowserName = prop.getProperty("browser");
		if (BrowserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BrowserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BrowserName.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Enter proper broswer name");
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.get(prop.getProperty("url"));

	}

}
