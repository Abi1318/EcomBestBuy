package com.BestBuy.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BestBuy.Utils.BaseTestEcom;



public class EcomLoginPage extends BaseTestEcom{
	@FindBy(linkText= "United States")
	WebElement US;
	public void clickUS() {
		waitForElement(US);
		clickAction(US);
	}
	@FindBy(xpath="//span[text()='Account']")
	WebElement Accounts;
	public void clickAccounts() {
		waitForElement(Accounts);
		clickAction(Accounts);
	}
	@FindBy(linkText="Sign In")
	WebElement SignIn;
	public void clickSignIn() {
		waitForElement(SignIn);
		clickAction(SignIn);
	}
	@FindBy(id="fld-e")
	WebElement mailaddress;
	public void typeMail(String mailID) {
		waitForElement(mailaddress);
		typeText(mailaddress, mailID);
	}
	@FindBy(id="fld-p1")
	WebElement enterPswd;
	public void enterPassword(String enterPassword) {
		waitForElement(enterPswd);
		typeText(enterPswd, enterPassword);
	}
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement enterSignin;
	public void clickLogin() {
		waitForElement(enterSignin);
		clickAction(enterSignin);
	}

}
