package com.empirem.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empirem.qa.base.BaseTest;
import com.empirem.qa.pages.HomePage;
import com.empirem.qa.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	LoginPage loninpage;
	HomePage homepage;

	public LoginPageTest() throws Throwable {
		super();
		
	}
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loninpage = new LoginPage();
		homepage = new HomePage();
		
	}
	@Test()
	public void verifyEphomeTitletest() {
		String title =loninpage.verifyEphomeTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");

	}

	@Test()
	public void verifyEphomeimageTest() {
		boolean img =loninpage.verifyEphomeimage();
		Assert.assertTrue(img);
	}
	@Test()
	public void verifyLoginPageTest() throws Throwable {
		homepage = loninpage.verifyLoginpage();
	}
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
	

			
}
