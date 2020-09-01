package com.webappsecurity.zero.TestSccripts;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.webappsecurity.zero.Pages.AccountSummary;
import com.webappsecurity.zero.Pages.ConfirmationPage;
import com.webappsecurity.zero.Pages.FundTransferVerify;
import com.webappsecurity.zero.Pages.HomePage;
import com.webappsecurity.zero.Pages.Login;
import com.webappsecurity.zero.Pages.TransferFunds;

public class VerifyFundtransferTest extends Base {
	
	@Test
	public void fundTransferTest() {
		HomePage hPage = new HomePage(driver);
		Login lPage = new Login(driver);
		AccountSummary acc = new AccountSummary(driver);
		TransferFunds tfnd = new TransferFunds(driver);
		FundTransferVerify ftveri = new FundTransferVerify(driver);
		ConfirmationPage cfp = new ConfirmationPage(driver);
		
		hPage.applicationSign();
		lPage.applicationLogin("username", "password");;
		acc.appicationAccnt();
		tfnd.applicationTransferFunds("200");
		ftveri.fndVerify();
		String actualMsg = cfp.getMsg();
		String expectedMsg = "You successfully submitted your transaction.";
		Assert.assertEquals(actualMsg, expectedMsg);	
	}
	
}
