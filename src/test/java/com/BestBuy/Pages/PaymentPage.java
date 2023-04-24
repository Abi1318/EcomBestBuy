package com.BestBuy.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BestBuy.Utils.BaseTestEcom;

public class PaymentPage extends BaseTestEcom {
	@FindBy(xpath = "//button[text()='Checkout']")
	WebElement checkout;

	public void clickCheckOut() {
		waitForElement(checkout);
		clickAction(checkout);
	}

	@FindBy(xpath = "//button[text()='Continue as Guest']")
	WebElement guest;

	public void clickGuest() {
		waitForElement(guest);
		clickAction(guest);
	}

	@FindBy(id = "user.emailAddress")
	WebElement email;

	public void EnterEmail(String emailID) {
		waitForElement(email);
		typeText(email, emailID);
	}

	@FindBy(xpath = "//input[@type='tel']")
	WebElement phone;

	public void EnterPhoneNo(String phNo) {
		waitForElement(phone);
		typeText(phone, phNo);
	}

	@FindBy(xpath = "//span[text()='Continue to Payment Information']")
	WebElement payment;

	public void clickPayment() {
		waitForElement(payment);
		clickAction(payment);
	}

	@FindBy(id = "number")
	WebElement card;

	public void enterCard(String num) {
		waitForElement(card);
		typeText(card, num);
	}

	@FindBy(id = "firstName")
	WebElement FN;

	public void typeFirstName(String FirstName) {
		waitForElement(FN);
		typeText(FN, FirstName);
	}

	@FindBy(name = "lastName")
	WebElement LN;

	public void typeLastName(String LastName) {
		waitForElement(LN);
		typeText(LN, LastName);
	}

	@FindBy(name = "addressLine1")
	WebElement addr;

	public void typeAddress(String Address) {
		waitForElement(addr);
		typeText(addr, Address);
	}

	@FindBy(id = "city")
	WebElement city;

	public void typeCity(String cityName) {
		waitForElement(city);
		typeText(city, cityName);
	}

	@FindBy(id = "state")
	WebElement state;

	public void selectState(String st) {
		waitForElement(state);

		DropDownByValue(state, st);

	}

	@FindBy(id = "postalCode")
	WebElement code;

	public void typeZipCode(String Zip) {
		waitForElement(code);
		typeText(code, Zip);
	}

	@FindBy(xpath = "//span[text()='Place Your Order']")
	WebElement order;

	public void clickPlaceOrder() {
		waitForElement(order);
		clickAction(order);
	}
}
