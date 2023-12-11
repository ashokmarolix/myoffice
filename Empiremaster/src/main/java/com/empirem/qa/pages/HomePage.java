package com.empirem.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.empirem.qa.base.BaseTest;

public class HomePage  extends BaseTest{
	
	@FindBy(xpath = "//i[@class='fa fa-database']")
	WebElement Masters;

	@FindBy(xpath = "//a[@href='/Master/Usertypes']")
	WebElement Usertypes;
	
	@FindBy(xpath = "//a[@href='/Master/Categories']")
	WebElement categories;
	@FindBy(xpath ="//a[@href='/Master/Loctation']")
	WebElement loctation;
	@FindBy(xpath ="//a[@href='/Master/Condition']")
	WebElement Condition;
	

	public HomePage() throws Throwable {
		super();
		
		PageFactory.initElements(driver, this);
		
	}
	public String VerifyEphomepageTitle() {
		return driver.getTitle();

	}
	
	public UserTypesPage verifyhomepage() throws Throwable {
		Thread.sleep(3000);
		Masters.click();
		Thread.sleep(3000);
		Usertypes.click();
		return new UserTypesPage();
		
		
	
	
	}
	public CategoriesPage verifycategoriespage() throws Throwable {
		Thread.sleep(3000);
		Masters.click();
		Thread.sleep(3000);
		categories.click();
		return new CategoriesPage();
		
	}
	public LocationPage verifylocationpage() throws Throwable {
		Thread.sleep(3000);
		Masters.click();
		Thread.sleep(3000);
		loctation.click();
		return new LocationPage();
	}
	public ConditionPage VerifyConditionPage() throws Throwable {
		Thread.sleep(3000);
		Masters.click();
		Thread.sleep(3000);
		Condition.click();
		return new ConditionPage();
		
	}

}
