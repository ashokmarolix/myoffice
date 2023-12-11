package selenium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.Strings;

public class Keyboradactions {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("sureshbabuemp@gmail.com");
		driver.findElement(By.xpath("//input[@id='pword']")).sendKeys("ZPMHQHIA");
		driver.findElement(By.xpath("//button[@class='btn green_btn']")).click();
		Thread.sleep(5000);
		WebElement inv = driver.findElement(By.xpath("//i[@class='fa fa-houzz']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(inv).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='/Inventory/InventoryData']")).click();
		Thread.sleep(5000);
		WebElement date = driver.findElement(By.xpath("//div[@class='form-group']//input[@id='RecievedDate']"));
		date.sendKeys("25-09-2023");
		Thread.sleep(4000);
		driver.findElement(By.name("ModelNumber")).sendKeys("9160483498");

		driver.findElement(By.xpath("//textarea[@name='Title']")).sendKeys("ashok");
		driver.findElement(By.name("ItemDescription")).sendKeys("good");
		driver.findElement(By.name("Brand")).sendKeys("Redmi");
		driver.findElement(By.name("Height")).sendKeys("5.5");
		driver.findElement(By.name("Width")).sendKeys("3.5");
		driver.findElement(By.name("Breadth")).sendKeys("2.5");
		driver.findElement(By.name("ColorName")).sendKeys("pink");
		driver.findElement(By.name("ActualPrice")).sendKeys("2500");
		driver.findElement(By.name("HSNCode")).sendKeys("ak123");
		driver.findElement(By.name("RackName")).sendKeys("ak");
		driver.findElement(By.name("PODetails")).sendKeys("asd1234");
		driver.findElement(By.name("InvoiceNumber")).sendKeys("ak1243fd5");
		driver.findElement(By.name("Qty")).sendKeys("5");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();

		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.queryselector(\"//input[@name='MRPPrice']\").disabled=false");
		driver.findElement(By.xpath("//input[@name='MRPPrice']")).sendKeys("1230");
		WebElement colorimage = driver.findElement(By.xpath("ColorImageUploaded"));
		JavascriptExecutor ls = (JavascriptExecutor) driver;
		ls.executeScript("arguments[0].click();", colorimage);
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("C:\\Users\\lenovo\\ns");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.id("select2-InventoryConditonId-container")).click();
		List<WebElement> ex = driver.findElements(By.xpath("//span[@title='Good']//span"));
		for (WebElement option : ex) {
			System.out.println(option.getText());
			if (option.getText().equals("Good")) {
				option.click();

			}
		}

		Thread.sleep(5000);
		WebElement image = driver.findElement(By.xpath("//input[@name='DocumentsUploaded']"));
		Thread.sleep(3000);
		JavascriptExecutor ak = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		ak.executeScript("arguments[0].click();", image);
		Thread.sleep(3000);
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
