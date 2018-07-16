package com.Facebook.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.TestBase.TestBaseFacebook;
import com.signup.Facebook.pages.FacebookSignupPage;

public class signUpTestcases extends TestBaseFacebook {


	public signUpTestcases() {
		super();
		
	}

	
	@BeforeMethod
	public void setUp() {
		initialisation();
		
		
	}
	
	@Test(priority=1)
	public void verifyReceipelink() throws InterruptedException {
		FacebookSignupPage signup=new FacebookSignupPage();

		signup.clickReceipelink();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
