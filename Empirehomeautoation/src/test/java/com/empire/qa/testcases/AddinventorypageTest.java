package com.empire.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.empire.qa.base.Base_test;
import com.empire.qa.pages.Addinventorypage;
import com.empire.qa.pages.AllInventoryPage;
import com.empire.qa.pages.Homepage;
import com.empire.qa.pages.Loginpage;
import com.empire.qa.utils.UtlisTest;

public class AddinventorypageTest extends Base_test {

	Loginpage loginpage;
	Homepage homepage;
	Addinventorypage addinventorypage;
	AllInventoryPage allinventorypage;
	static String shname = "Sheet1";

	public AddinventorypageTest() throws Throwable {
		super();

	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		loginpage = new Loginpage();
		homepage = new Homepage();
		addinventorypage = new Addinventorypage();
		allinventorypage = new AllInventoryPage();
		homepage = loginpage.verifyLoginpage();
		addinventorypage = homepage.Verifyhomepage();

	}

	@Test
	public void VerifyaddinventoryTitle() {
		String title = addinventorypage.VerifyaddinventoryTitle();
		Assert.assertEquals(title, "Empire Home Admin Panel");

	}

	@DataProvider
	public Object[][] Exceldata() {
		Object[][] data = UtlisTest.GetExcelData(shname);
		return data;
	}

	@Test(dataProvider = "Exceldata")
	public void VerifyAddInventoryTest(String modelnumber, String ItemTitle, String ItemDesrcription, String Brand,
			String Height, String Width, String Breadth, String ColorName, String ColorImageUploaded,
			String RecieveDate, String actualprice, String MRPPrice, String HSNCode, String PODetails,
			String InVoiceNumber, String Qty, String taxapplicable, String ProdutMainImageUploaded) throws Throwable {
		allinventorypage = addinventorypage.VerifyAddInventory(modelnumber, ItemTitle, ItemDesrcription, Brand, Height,
				Breadth, Width, ColorName, ColorImageUploaded, RecieveDate, MRPPrice, actualprice, PODetails,
				InVoiceNumber, Qty, taxapplicable, ProdutMainImageUploaded, ProdutMainImageUploaded  );
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
