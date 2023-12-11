package com.empire.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.empire.qa.base.Base_test;

public class Homepage extends Base_test {

	@FindBy(xpath = "//i[@class='fa fa-houzz']")
	WebElement inventory;

	@FindBy(xpath = "//a[@href='/Inventory/InventoryData']")
	WebElement addinventory;

	public Homepage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);

	}

	public String VerifyEhomepageTitle() {
		return driver.getTitle();

	}

	public Addinventorypage Verifyhomepage() throws Throwable {
		Thread.sleep(3000);
		inventory.click();
		Thread.sleep(3000);
		addinventory.click();
		return new Addinventorypage();

	}

}
