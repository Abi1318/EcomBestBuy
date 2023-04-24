package com.BestBuy.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BestBuy.Utils.BaseTestEcom;

public class DepartmentAddCartPage extends BaseTestEcom {
	@FindBy(linkText= "United States")
	WebElement US;
	public void clickUS() {
		waitForElement(US);
		clickAction(US);
	}
	
	@FindBy(xpath = "//button[text()='Menu']")
	WebElement menu;

	public void clickMenu() {
		waitForElement(menu);
		clickAction(menu);
	}

	@FindBy(xpath = "//button[text()='Appliances']")
	WebElement appliances;

	public void clickAppliances() {
		waitForElement(appliances);
		clickAction(appliances);
	}

	@FindBy(xpath = "//button[text()='Small Kitchen Appliances']")
	WebElement kitchen;

	public void clickKitchenAppliances() {
		waitForElement(kitchen);
		clickAction(kitchen);
	}

	@FindBy(linkText = "Bar & Wine")
	WebElement bar;

	public void clickBarWine() {
		waitForElement(bar);
		clickAction(bar);
	}
	@FindBy(partialLinkText="NutriBullet - Brew Choice")
	WebElement Brew;
	public void clickNutriBullet() {
		waitForElement(Brew);
		clickAction(Brew);
	}
	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement cart;
	public void clickAddToCart() {
		waitForElement(cart);
		//jsScrollUntillFound(cart);
		//clickAction(cart);
		jsWebElementClick(cart);
	}
	@FindBy(linkText="Go to Cart")
	WebElement goCart;
	public void goToCart() {
		waitForElement(goCart);
		clickAction(goCart);
	}
}
