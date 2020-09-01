package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds {
	@FindBy (id= "tf_fromAccountId")
	private WebElement frmAccount;
	
	@FindBy (id= "tf_toAccountId")
	private WebElement toAccount;
	
	@FindBy (id="tf_amount")
	private WebElement tfAmmount;
	
	@FindBy (id = "tf_description")
	private WebElement tfdescription;
	
	@FindBy (id = "btn_submit")
	private WebElement btnSubmit;
	
	public TransferFunds(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void applicationTransferFunds(String amount) {
		Select frmA = new Select(frmAccount);
		frmA.selectByIndex(2);
		
		Select toA = new Select(toAccount);
		toA.selectByValue("5");
		
		tfAmmount.sendKeys("200");
		tfdescription.sendKeys("Fund transfer from saving to loan");
		btnSubmit.click();
	}
}


