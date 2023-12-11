package com.empirem.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empirem.qa.base.BaseTest;
import com.empirem.qa.pages.HomePage;
import com.empirem.qa.pages.LoginPage;
import com.empirem.qa.pages.UserTypesPage;

public class HomePageTest extends BaseTest {
	
	LoginPage loninpage;
	HomePage homepage;
	UserTypesPage usertypespage;

	public HomePageTest() throws Throwable {
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loninpage = new LoginPage();
		homepage = new HomePage();
		usertypespage = new UserTypesPage();
		homepage =	loninpage.verifyLoginpage();
		
		
		
	}
		@Test
	public void VerifyEphomepageTitleTest() {
	String title =	homepage.VerifyEphomepageTitle();
	Assert.assertEquals(title, "Empire Home Admin Panel");
	}
	
	@Test
	public void verifyhomepageTest() throws Throwable {
		usertypespage =	homepage.verifyhomepage();
		
		
		
	}
	
	@AfterMethod
	public void teardowm() {
//	driver.quit();
	}

}
