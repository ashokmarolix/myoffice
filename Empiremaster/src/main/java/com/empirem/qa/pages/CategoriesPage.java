package com.empirem.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.empirem.qa.base.BaseTest;

public class CategoriesPage extends BaseTest {
	@FindBy(xpath = "//a[@href='/Master/CategoryType']")
	WebElement AddNew;
	@FindBy(name = "CategoryName")
	WebElement CategoryName;
	@FindBy(xpath = "//button[@class='btn btn-success serchgaptop']")
	WebElement savebutton;

	public CategoriesPage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);

	}

	public String verifyCategoriesPageTitle() {
		return driver.getTitle();

	}

	public void VerifyCategoriesPage() throws Throwable {
		AddNew.click();
		Thread.sleep(1000);
		CategoryName.sendKeys("Hall");
		savebutton.click();
		Thread.sleep(1000);

	}

}
