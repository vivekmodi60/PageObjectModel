package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath ="//td[contains(text(),'User: Vivek Modi')]")
	WebElement userNameLabel;
	
	@FindBy(xpath ="//a[contains(text(), 'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath ="//a[contains(text(), 'New Contact')]")
	WebElement newContactLink;
	
	@FindBy(xpath ="//a[contains(text(), 'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath ="//a[contains(text(), 'Tasks')]")
	WebElement tasksLink;
	
	
	//Initializing the Page objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
	public boolean verifyCorrectUserName() throws InterruptedException {
		//Thread.sleep(10000);
		return userNameLabel.isDisplayed();
	}
		
	public String verifyHomePageTitle() throws InterruptedException {
	    //Thread.sleep(6000);
		return driver.getTitle();
	}
	
	public ContactsPage clickOnContactsLink() throws InterruptedException {
		//Thread.sleep(6000);
		contactsLink.click();
		return new ContactsPage();           //this will return object of the class ContactsPage
		                                     //Contacts page is landing page on clicking Contacts link
	}
	
	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();              //this will return object of the class DealsPage
		                                     //Deals page is landing page on clicking Deals link
	}
	
	public TasksPage clickOnTasksLink() {
		tasksLink.click();
		return new TasksPage();              //this will return object of the class DealsPage
		                                     //Deals page is landing page on clicking Deals link
	}
	
	public void clickOnNewContactsLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		
		newContactLink.click();
		
	}

}
