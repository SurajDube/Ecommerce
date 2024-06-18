package com.durgasoft.ecommerce.homepage;

import org.testng.annotations.Test;
import com.durgasoft.ecommerce.PageUI.CreateLoginAccount;
import com.durgasoft.ecommerce.basepage.BasePage;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;

public class TC001_CustomerRegistration extends BasePage {
	
	public static final Logger log = Logger.getLogger(TC001_CustomerRegistration.class.getName());
	
	@Test
	  public void CustomerRegistration() throws Exception {
		log.info("*****Starting TC001_Customer Registration*****"); 
		CreateLoginAccount login = new CreateLoginAccount(driver);
		 login.CreateAccount();
		 log.info("*****Ending TC001_Customer Registration*****");
	  }

  @BeforeClass
  public void beforeTest() throws Exception {
	  browserLaunch(getData("browser"), getData("url"));	  
  }
}