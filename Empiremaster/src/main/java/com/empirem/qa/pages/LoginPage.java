package com.empirem.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.empirem.qa.base.BaseTest;

public class LoginPage extends BaseTest {
	

	@FindBy(name = "emailid")
	WebElement uname;

	@FindBy(id = "pword")
	WebElement pwd;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginbtn;

	@FindBy(xpath = "//img[@src='/WebApp/assets/dist/img/logo.png']")
	WebElement Ehimg;

	public LoginPage() throws Throwable {
		super();
		
		PageFactory.initElements(driver, this);

		}

		public String verifyEphomeTitle() {

			return driver.getTitle();
		}

		public boolean verifyEphomeimage() {
			return Ehimg.isDisplayed();

		}

		public HomePage verifyLoginpage() throws Throwable {
			uname.sendKeys(prop.getProperty("username"));
			pwd.sendKeys(prop.getProperty("password"));
			loginbtn.click();
			return new HomePage();
		
	}

}
