package com.webappsecurity.zero.TestSccripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	WebDriver driver;
	@BeforeClass
	public void  openBrowser() {
		System.setProperty("driver.chromedrive.exe", "chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
		
	}


}
  