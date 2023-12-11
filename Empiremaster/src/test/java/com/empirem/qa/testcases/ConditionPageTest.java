package com.empirem.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.empirem.qa.base.BaseTest;
import com.empirem.qa.pages.ConditionPage;
import com.empirem.qa.pages.HomePage;
import com.empirem.qa.pages.LoginPage;

public class ConditionPageTest extends BaseTest{
	LoginPage loginpage;
	HomePage homepage;
	ConditionPage conditionpage;
	

	public ConditionPageTest() throws Throwable {
		super();
	
		
		
		
	}
	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new LoginPage();
		homepage  =new HomePage();
		conditionpage = new ConditionPage();
		homepage =	loginpage.verifyLoginpage();
		homepage.VerifyConditionPage();
		Thread.sleep(1000);
	}
	@Test
	public void VerifyConditionPageTitleTest() {
		String title = conditionpage.VerifyConditionPageTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");
		
	}
	@Test
	public void VerifyConditionPageTest() throws Throwable {
		conditionpage.VerifyConditionPage();
		
	}

}
