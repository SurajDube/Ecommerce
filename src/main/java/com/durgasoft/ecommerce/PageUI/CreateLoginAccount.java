package com.durgasoft.ecommerce.PageUI;

import static org.testng.Assert.assertEquals;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.durgasoft.ecommerce.basepage.BasePage;

public class CreateLoginAccount extends BasePage {
	
	public static final Logger log = Logger.getLogger(CreateLoginAccount.class.getName());
	
	@FindBy(linkText="Sign in") WebElement linkSignIN;
	@FindBy(id="email_create") WebElement txtEmailID;
	@FindBy(id="SubmitCreate") WebElement btnCreateAnAccount;
	@FindBy(xpath="//h1[text()='Create an account']") WebElement txtCreateAnAccount;
	@FindBy(id="id_gender1") WebElement radioMr;
	@FindBy(id="customer_firstname") WebElement txtFirstName;
	@FindBy(id="customer_lastname") WebElement txtLastName;
	@FindBy(id="passwd") WebElement txtPassword;
	@FindBy(id="days") WebElement dropDownDays;
	@FindBy(id="months") WebElement dropDownMonth;
	@FindBy(id="years") WebElement dropDownYears;
	@FindBy(id="newsletter") WebElement newschkbox;
	@FindBy(id="address1") WebElement txtaddress1;
	@FindBy(id="address2") WebElement txtaddress2;
	@FindBy(id="city") WebElement txtCity;
	@FindBy(id="id_state") WebElement dropdownState;
	@FindBy(id="postcode") WebElement txtZipCode;
	@FindBy(id="id_country") WebElement dropdownCountry;
	@FindBy(id="phone_mobile") WebElement txtMobile;
	@FindBy(id="alias") WebElement txtAliasAddress;
	@FindBy(id="submitAccount") WebElement btnRegister;
	@FindBy(xpath="//h1[text()='My account']") WebElement txtMyAccount;
	
	public CreateLoginAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void CreateAccount() throws Exception {
		linkSignIN.click();
		log.info("Clicked on SignIN button with object:"+linkSignIN.toString());
		txtEmailID.sendKeys(getData("firstname")+getData("lastname")+randomNumber()+getData("domainname"));
		log.info("Entering EmailID:"+txtEmailID.getAttribute("value")+"using object:"+txtEmailID.toString());
		btnCreateAnAccount.click();
		log.info("Click on Create an account:"+btnCreateAnAccount.toString());
		Thread.sleep(5000);
		assertEquals(txtCreateAnAccount.getText(), "CREATE AN ACCOUNT");
		log.info("Verifying Custmor information Page by using Object:"+txtCreateAnAccount.toString());
		radioMr.click();
		log.info("Click on Mr radio button by using object:"+radioMr.toString());
		txtFirstName.sendKeys("Suraj");
		log.info("Click on Mr first name by using object:"+txtFirstName.toString());
		txtLastName.sendKeys("Kumar Dubey");
		log.info("Click on Mr last name by using object:"+txtLastName.toString());
		txtPassword.sendKeys("suraj@100795");
		log.info("Click on password by using object:"+txtLastName.toString());
		dropDownDays.sendKeys("10");
		log.info("Click on Date by using object:"+dropDownDays.toString());
		dropDownMonth.sendKeys("July");
		log.info("Click on month by using object:"+dropDownMonth.toString());
		dropDownYears.sendKeys("1995");
		log.info("Click on year by using object:"+dropDownYears.toString());
		newschkbox.click();
		log.info("Click on newschkbox by using object:"+newschkbox.toString());
		btnRegister.click();
		log.info("Click on Register by using object:"+btnRegister.toString());
			
	}
}