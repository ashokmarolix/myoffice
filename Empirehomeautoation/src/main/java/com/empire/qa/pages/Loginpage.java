package com.empire.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.empire.qa.base.Base_test;

public class Loginpage extends Base_test {

	@FindBy(name = "emailid")
	WebElement uname;

	@FindBy(id = "pword")
	WebElement pwd;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginbtn;

	@FindBy(xpath = "//img[@src='/WebApp/assets/dist/img/logo.png']")
	WebElement Ehimg;

	public Loginpage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);

	}

	public String verifyEhomeTitle() {

		return driver.getTitle();
	}

	public boolean verifyEhomeimage() {
		return Ehimg.isDisplayed();

	}

	public Homepage verifyLoginpage() throws Throwable {
		uname.sendKeys(prop.getProperty("username"));
		pwd.sendKeys(prop.getProperty("password"));
		loginbtn.click();
		return new Homepage();

	}

}
