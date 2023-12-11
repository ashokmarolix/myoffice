package com.empirem.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.empirem.qa.base.BaseTest;

public class UserTypesPage extends BaseTest {

	@FindBy(xpath = "//a[@href='/Master/UserTypeData']")
	WebElement AddNew;

	@FindBy(name = "TypeName")
	WebElement TypeName;

	@FindBy(name = "TypeCode")
	WebElement TypeCode;

	@FindBy(xpath = "//button[@class='btn btn-success serchgaptop']")
	WebElement savebutton;

	public UserTypesPage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);

	}

	public String verifyusertypespagetitle() {

		return driver.getTitle();
	}

	public void verifyUserTypespage() throws Throwable {
		AddNew.click();
		TypeName.sendKeys("ashok");
		TypeCode.sendKeys("12443");
		Thread.sleep(1000);

		savebutton.click();
		Thread.sleep(3000);

	}

}
