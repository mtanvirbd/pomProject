package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(id="user_login") 
	private WebElement uName;
	
	@FindBy(id="user_password") 
	private WebElement uPasswd;
	
	@FindBy(name="submit")
	private WebElement sBtn;
	
	@FindBy(css="#login_form > div.alert.alert-error") 
	public WebElement errorMsg;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void applicationLogin(String userName, String userPasswd) {
		uName.sendKeys(userName);
		uPasswd.sendKeys(userPasswd);
		sBtn.click();
	}
	
	public String isErrormsgDisplayed() {
		String errorMessage = errorMsg.getText();
		return errorMessage;
		
	}
}
