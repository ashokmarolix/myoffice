package com.empirem.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empirem.qa.base.BaseTest;
import com.empirem.qa.pages.CategoriesPage;
import com.empirem.qa.pages.HomePage;
import com.empirem.qa.pages.LoginPage;

public class CategoriesPageTest extends BaseTest {

	LoginPage loginPage;
	HomePage homePage;
	CategoriesPage categoriesPage;

	public CategoriesPageTest() throws Throwable {
		super();

	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		categoriesPage = new CategoriesPage();
		homePage = loginPage.verifyLoginpage();
		homePage.verifycategoriespage();
		Thread.sleep(1000);

	}

	@Test
	public void verifyCategoriesPageTitleTest() {
		String title = categoriesPage.verifyCategoriesPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");

	}

	@Test
	public void VerifyCategoriesPageTest() throws Throwable {
		categoriesPage.VerifyCategoriesPage();

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
