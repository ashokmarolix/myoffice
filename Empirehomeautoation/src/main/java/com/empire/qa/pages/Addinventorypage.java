package com.empire.qa.pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.empire.qa.base.Base_test;
import com.empire.qa.utils.UtlisTest;

public class Addinventorypage extends Base_test {
	@FindBy(xpath = "//select[@id='catDD']//option")
	WebElement categorydropdown;

	@FindBy(xpath = "//select[@id='subcatDD']//option")
	WebElement subcategorydropdown;

	@FindBy(name = "ModelNumber")
	WebElement Modelnumber;

	@FindBy(name = "Title")
	WebElement ItemTitle;

	@FindBy(name = "ItemDescription")
	WebElement ItemDescription;

	@FindBy(name = "Brand")
	WebElement Brand;

	@FindBy(name = "Height")
	WebElement Height;

	@FindBy(name = "Width")
	WebElement Width;

	@FindBy(name = "Breadth")
	WebElement Breadth;

	@FindBy(name = "ColorName")
	WebElement ColorName;

	@FindBy(name = "ColorImageUploaded")
	WebElement ColorImageUploaded;

	@FindBy(xpath = "//select[@id='InventoryStatusId']//option")
	WebElement InventoryStatusId;

	@FindBy(xpath = "//select[@id='InventoryConditonId']//option")
	WebElement InventoryConditon;

	@FindBy(xpath = "//select[@id='InventoryLocationId']//option")
	WebElement InventoryLocation;

	@FindBy(name = "RecievedDate")
	WebElement RecievedDate;

	@FindBy(name = "actual")
	WebElement actualprice;

	@FindBy(xpath = "//select[@id='factor']//option")
	WebElement MRPfactor;

	@FindBy(name = "MRPPrice")
	WebElement MRPPrice;

	@FindBy(name = "HSNCode")
	WebElement HSNCode;

	@FindBy(name = "RackName")
	WebElement RackName;

	@FindBy(name = "PODetails")
	WebElement PODetails;

	@FindBy(name = "InvoiceNumber")
	WebElement InvoiceNumber;

	@FindBy(name = "Qty")
	WebElement Qty;

	@FindBy(id = "gstName")
	WebElement taxapplicable;

	@FindBy(name = "ProductMainImageUploaded")
	WebElement ProductMainImageUploaded;

	
	

	@FindBy(xpath = "//button[@class='btn btn-success']")
	WebElement savebutton;

	public Addinventorypage() throws Throwable {
		super();
		PageFactory.initElements(driver, this);

	}

	public String VerifyaddinventoryTitle() {
		return driver.getTitle();
	}

	public AllInventoryPage VerifyAddInventory(String modelnumber, String ItemTitle, String ItemDesrcription, String Brand,
			String Height, String Width, String Breadth, String ColorName, String ColorImageUploaded,
			String RecieveDate, String actualprice, String MRPPrice, String HSNCode, String PODetails,
			String InVoiceNumber, String Qty, String taxapplicable, String ProdutMainImageUploaded) throws Throwable {

		UtlisTest.dropdownmethod(categorydropdown, "Living Rooms");
		UtlisTest.dropdownmethod(subcategorydropdown, "mattress");
		this.Modelnumber.sendKeys(modelnumber);
		this.ItemTitle.sendKeys(ItemTitle);
		this.ItemDescription.sendKeys(ItemDesrcription);
		this.Brand.sendKeys(Brand);
		this.Height.sendKeys(Height);
		this.Width.sendKeys(Width);
		this.Breadth.sendKeys(Breadth);
		this.ColorName.sendKeys(ColorName);
		UtlisTest.dropdownmethod(InventoryStatusId, "234");
		UtlisTest.dropdownmethod(InventoryConditon, "nice");
		UtlisTest.dropdownmethod(InventoryLocation, "IND");

		this.ColorImageUploaded.sendKeys(ColorImageUploaded);
		this.RecievedDate.sendKeys("14-10-2023");
		this.actualprice.sendKeys(actualprice);
		UtlisTest.dropdownmethod(MRPfactor, "2.10");
		this.MRPPrice.sendKeys(MRPPrice);
		this.HSNCode.sendKeys(HSNCode);
		this.PODetails.sendKeys(PODetails);
		this.InvoiceNumber.sendKeys(InVoiceNumber);
		this.Qty.clear();
		this.Qty.sendKeys(Qty);
		this.taxapplicable.sendKeys(taxapplicable);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("agruments[0].click();", ProductMainImageUploaded);
		UtlisTest.UploadingFile();
		savebutton.click();
		return new AllInventoryPage();

	}
}
