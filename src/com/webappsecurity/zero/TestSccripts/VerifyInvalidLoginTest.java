package com.webappsecurity.zero.TestSccripts;




import org.testng.Assert;

import org.testng.annotations.Test;

import com.webappsecurity.zero.Pages.HomePage;
import com.webappsecurity.zero.Pages.Login;

public class VerifyInvalidLoginTest extends Base {
	
	
	
	@Test
	public void isErrormsgdisplayed() {
		HomePage hp = new HomePage(driver);
		Login lin = new Login(driver);
		
		hp.applicationSign();
		lin.applicationLogin("usernm12", "udds3123");
		String actualMsg = lin.isErrormsgDisplayed();
		String expectedMsg = "Login and/or password are wrong.";
		Assert.assertEquals(actualMsg, expectedMsg);
		
		
	}
	
	
}
