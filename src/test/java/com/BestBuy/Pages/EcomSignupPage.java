package com.BestBuy.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BestBuy.Utils.BaseTestEcom;

public class EcomSignupPage extends BaseTestEcom {
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
	@FindBy(linkText="Create Account")
	WebElement createAccount;
	public void clickCreatAccount() {
		waitForElement(createAccount);
		clickAction(createAccount);
	}
	@FindBy(id="firstName")
	WebElement FirstName;
	public void typeFirstName(String first) {
		waitForElement(FirstName);
		typeText(FirstName, first);
	}
	@FindBy(id="lastName")
	WebElement LastName;
	public void typeLastName(String Last) {
		waitForElement(LastName);
		typeText(LastName, Last);
	}
	@FindBy(id="email")
	WebElement Email;
	public void typeEmail(String mail) {
		waitForElement(Email);
		typeText(Email, mail);
	}
	@FindBy(xpath="(//input[@type='password'])[1]")
	WebElement pswd;
	public void typePass(String Password) {
		waitForElement(pswd);
		typeText(pswd, Password);
	}
	@FindBy(id="reenterPassword")
	WebElement reEnterpswd;
	public void typeRePass(String RePassword) {
		waitForElement(reEnterpswd);
		typeText(reEnterpswd, RePassword);
	}
	@FindBy(id="phone")
	WebElement phno;
	public void typePhNo(String PhoneNo) {
		waitForElement(phno);
		typeText(phno, PhoneNo);
	}
	@FindBy(xpath="//button[text()='Create an Account']")
	WebElement createAc;
	public void clickCreateAc() {
		waitForElement(createAc);
		clickAction(createAc);
	}

}
