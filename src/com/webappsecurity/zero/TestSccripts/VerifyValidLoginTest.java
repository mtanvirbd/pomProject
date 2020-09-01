package com.webappsecurity.zero.TestSccripts;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.Pages.AccountSummary;
import com.webappsecurity.zero.Pages.HomePage;
import com.webappsecurity.zero.Pages.Login;


public class VerifyValidLoginTest extends Base {

	@Test
	public void validLoginTest() {
		HomePage hpS = new HomePage(driver);
		Login lpS = new Login(driver);
		AccountSummary acs = new AccountSummary(driver);
		
		
		hpS.applicationSign();
		lpS.applicationLogin("username", "password");
		Boolean accountSummaryPresent = acs.isTransferFundlinkVisible();
		Assert.assertTrue(accountSummaryPresent);	
	}
}
	
	
