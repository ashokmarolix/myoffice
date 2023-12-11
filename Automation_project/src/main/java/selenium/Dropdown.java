package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	List<WebElement> country = driver.findElements(By.xpath("//select[@name='Country']//option"));
//		for (WebElement option : country) {
//			if (option.getText().equals("Mali")) {
//				option.click();
//			}

		for (int k = 0; k < country.size(); k++) {
		System.out.println(country.get(k).getText());
		if(country.get(k).getText().equals("Mali")) {
			country.get(k).click();

		}
		}

		// Select sel = new Select(country);
		// sel.selectByVisibleText("Mali");
		// sel.deselectByValue("Afghanistan");
		// sel.deselectByIndex(3);

	}

}
	
