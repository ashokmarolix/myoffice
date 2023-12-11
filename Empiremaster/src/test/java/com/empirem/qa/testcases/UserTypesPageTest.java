package com.empirem.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;


import com.empirem.qa.base.BaseTest;

import com.empirem.qa.pages.HomePage;
import com.empirem.qa.pages.LoginPage;
import com.empirem.qa.pages.UserTypesPage;

public class UserTypesPageTest extends BaseTest {

	LoginPage loninpage;
	HomePage homepage;
	UserTypesPage usertypespage;
	static String shname = "Sheet1";

	public UserTypesPageTest() throws Throwable {
		super();

	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loninpage = new LoginPage();
		homepage = new HomePage();
		usertypespage = new UserTypesPage();
		homepage = loninpage.verifyLoginpage();
		usertypespage = homepage.verifyhomepage();
		Thread.sleep(3000);

	}

	@Test
	public void verifyusertypespagetitleTest() {
		String title = usertypespage.verifyusertypespagetitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");

	}

	@Test
	public void verifyUserTypesTest() throws Throwable {
		 usertypespage.verifyUserTypespage();

	}

	@AfterMethod
	public void teardown() {
	//	driver.quit();
	}

}
