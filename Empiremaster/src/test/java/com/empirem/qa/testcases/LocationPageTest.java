package com.empirem.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empirem.qa.base.BaseTest;
import com.empirem.qa.pages.HomePage;
import com.empirem.qa.pages.LocationPage;
import com.empirem.qa.pages.LoginPage;

public class LocationPageTest extends BaseTest {
	LoginPage loginPage;
	HomePage homePage;
	LocationPage locationpage;

	public LocationPageTest() throws Throwable {
		super();
	
	}
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginPage = new LoginPage();
		homePage  =new HomePage();
		locationpage = new LocationPage();
		homePage = loginPage.verifyLoginpage();
		homePage.verifylocationpage();
		Thread.sleep(1000);
		}
	@Test
	public void verifyLocationPageTitleTest() {
		String title = locationpage.verifyLocationPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	@Test
	public void VerifyLocationPageTest() throws Throwable {
		locationpage.VerifyLocationPage();
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
		
		
		

}
