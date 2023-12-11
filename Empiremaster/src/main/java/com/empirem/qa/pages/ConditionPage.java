package com.empirem.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.empirem.qa.base.BaseTest;

public class ConditionPage extends BaseTest {
	@FindBy(xpath="//a[@href='/Master/ConditionTypeData']")
	WebElement AddNew;
	@FindBy(name="ConditionName")
	WebElement ConditionName;
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement savabtn;


	public ConditionPage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);
		
	}
	public String VerifyConditionPageTitle() {
		return driver.getTitle();
	}
	public void VerifyConditionPage() throws Throwable {
		AddNew.click();
		Thread.sleep(1000);
		ConditionName.sendKeys("Better");
		Thread.sleep(1000);
		savabtn.click();
		
		
		
	}

}
