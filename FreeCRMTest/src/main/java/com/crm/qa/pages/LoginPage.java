package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	
	
//Page Factory - OR (Object Repositories);
	
	@FindBy(name= "username")
	WebElement username;
		
	@FindBy(name= "password")
	WebElement password;
		
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
//Initializing the Page objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
//Actions on above OR:
	public String validateLoginPageTitle() {
		return driver.getTitle();                 //Verify Page Title
	}
	
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();             //verify CRM logo is present or not
	}
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", loginBtn);
		    	
		return new HomePage();
	
	
}}
