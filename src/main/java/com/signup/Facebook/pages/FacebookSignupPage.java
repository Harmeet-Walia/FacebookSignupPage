package com.signup.Facebook.pages;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.facebook.TestBase.TestBaseFacebook;

public class FacebookSignupPage extends TestBaseFacebook {
	
	@FindBy(name="firstname")
	WebElement firstname;
	
	@FindBy(name="lastname")
	WebElement lastname;
	
	@FindBy(name="reg_email__")
	WebElement email;
	
	@FindBy(name="reg_passwd__")
	WebElement newPassword;
	
	@FindBy(name="birthday_day")
	WebElement day;
	
	@FindBy(name="birthday_month")
	WebElement month;
	
	@FindBy(name="birthday_year")
	WebElement year;
	
	@FindBy(id="u_0_a")
	WebElement radioButtonMale;	
	
	@FindBy(linkText="Create a Page")
	WebElement businessPage;
	
	@FindBy(linkText="Recipes")
	WebElement receipelink;
	
	
	
	public FacebookSignupPage() {
		PageFactory.initElements(driver, this);
		
		
	}



	public void signUp() throws InterruptedException {
		
		firstname.sendKeys("John");
		lastname.sendKeys("Sam");
		email.sendKeys("abc567@gmail.com");
		newPassword.sendKeys("@bc1234");
		Thread.sleep(6000);
		
		Select select = new Select(month);
		select.selectByValue("2");

		
		Select select1 = new Select(day);
		select1.selectByValue("14");

		
		Select select2 = new Select(year);
		select2.selectByValue("1980");

		radioButtonMale.click();

		clickBusinessPage();
		

	}

	

	public  void clickBusinessPage() throws InterruptedException {
		businessPage.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
	}
	
	public ReceipePages clickReceipelink() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		   js.executeScript("scroll(0,1000)");
		  Thread.sleep(5000);
		receipelink.click();
		return new ReceipePages();
		
	}

}
