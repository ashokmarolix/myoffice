package com.empirem.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.empirem.qa.base.BaseTest;

public class LocationPage extends BaseTest{
	@FindBy(xpath="//a[@href='/Master/LocationTypeData']")
	WebElement AddNew;
	@FindBy(name="LocationName")
	WebElement LocationName;
	@FindBy(xpath="//button[@class='btn btn-success serchgaptop']")
	WebElement savabtn;

	public LocationPage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);
	}
	public String verifyLocationPageTitle() {
		return driver.getTitle();
	}
	public void VerifyLocationPage() throws Throwable {
		AddNew.click();
		Thread.sleep(1000);
		LocationName.sendKeys("alg");
		savabtn.click();
		Thread.sleep(1000);
	}

}
