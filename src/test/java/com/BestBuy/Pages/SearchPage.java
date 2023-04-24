package com.BestBuy.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BestBuy.Utils.BaseTestEcom;

public class SearchPage extends BaseTestEcom {
	@FindBy(linkText= "United States")
	WebElement US;
	public void clickUSlogin() {
		waitForElement(US);
		clickAction(US);
	}

	@FindBy(name="st")
	WebElement searchBox;
	public void box(String searchText) {
		waitForElement(searchBox);
		typeText(searchBox, searchText);
	}
	@FindBy(xpath="(//button[@type='submit'])[1]")
	WebElement enter;
	public void clickSearchBox() {
		waitForElement(enter);
		clickAction(enter);
	}
	
	@FindBy(linkText="LEGO - Disney Twirling Rapunzel 43214")
	WebElement toy;
	public void clickfirstToy() {
		waitForElement(toy);
		clickAction(toy);
	}
	
	
	@FindBy(xpath="(//button[text()='Add to Cart'])[1]")
	WebElement Cart;
	public void addToCart() {
		waitForElement(Cart);
		clickAction(Cart);
	}
	@FindBy(linkText="Go to Cart")
	WebElement goCart;
	public void goToCart() {
		waitForElement(goCart);
		clickAction(goCart);
	}

}
