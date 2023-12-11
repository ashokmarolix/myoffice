package com.empire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empire.qa.base.Base_test;
import com.empire.qa.pages.Addinventorypage;
import com.empire.qa.pages.Homepage;
import com.empire.qa.pages.Loginpage;

public class HomePageTest extends Base_test {

	Loginpage loginpage;
	Homepage homepage;
	Addinventorypage addinventorypage;

	public HomePageTest() throws Throwable {
		super();

	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new Loginpage();
		homepage = new Homepage();
		addinventorypage = new Addinventorypage();
		homepage = loginpage.verifyLoginpage();

	}

	@Test(priority = 1)
	public void VerifyEhomepageTitleTest() {
		String title = homepage.VerifyEhomepageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");

	}

	@Test(priority = 2)
	public void VerifyhomepageTest() throws Throwable {
		addinventorypage = homepage.Verifyhomepage();

	}

	@AfterMethod
	public void teardown() {
		 driver.quit();
	}

}
