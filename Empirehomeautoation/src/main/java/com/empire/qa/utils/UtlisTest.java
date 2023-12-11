package com.empire.qa.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.empire.qa.base.Base_test;

public class UtlisTest extends Base_test {

	public UtlisTest() throws Throwable {
		super();

	}

	public static String Exceldata = "C:\\Users\\lenovo\\eclipse-workspace\\Empirehomeautoation\\src\\main\\java\\com\\empire\\qa\\testdata\\EHT.xlsx";
	static Workbook book;
	static Sheet sheet;
public static    String primaryimg ="C:\\Users\\lenovo\\OneDrive\\Pictures\\Screenshots\\redbusindia";
	public static void dropdownmethod(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByVisibleText(value);

	}

	public static Object[][] GetExcelData(String sheetname) throws EncryptedDocumentException {
		FileInputStream file = null;
		try {
			file = new FileInputStream(Exceldata);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();

		}
		sheet = book.getSheet(sheetname);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int r = 0; r < sheet.getLastRowNum(); r++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				DataFormatter df = new DataFormatter();
				data[r][k] = df.formatCellValue(sheet.getRow(r + 1).getCell(r));
			}

		}
		return data;

	}
	public static void UploadingFile() throws AWTException {
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("primaryimg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void ScreenshotMethod() throws Throwable {
	File src =	((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String dest = System.getProperty("user.dir");
	FileUtils.copyFile(src, new File(dest + "/EmpireScreenshots/" + System.currentTimeMillis() + ".png"));
		
		
		
		
		
		
		
		
		
	}
}
