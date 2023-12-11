package com.empire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empire.qa.base.Base_test;
import com.empire.qa.pages.Homepage;
import com.empire.qa.pages.Loginpage;

public class LoginpageTest extends Base_test {

	Loginpage loginpage;
	Homepage homepage;

	public LoginpageTest() throws Throwable {
		super();

	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new Loginpage();
		homepage = new Homepage();
	}

	@Test()
	public void verifyEhomeTitletest() {
		String title = loginpage.verifyEhomeTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");

	}

	@Test()
	public void verifyEhomeimageTest() {
		boolean img = loginpage.verifyEhomeimage();
		Assert.assertTrue(img);

	}

	@Test()
	public void verifyLoginpageTest() throws Throwable {
		homepage = loginpage.verifyLoginpage();
	}

	@AfterMethod
	public void teardown() {
		//driver.quit();
	}

}
