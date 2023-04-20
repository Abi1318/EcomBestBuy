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

	@FindBy(xpath = "//button[text()='Major Kitchen Appliances']")
	WebElement kitchen;

	public void clickKitchenAppliances() {
		waitForElement(kitchen);
		clickAction(kitchen);
	}

	@FindBy(linkText = "Refrigerators")
	WebElement fridge;

	public void clickRefridgerators() {
		waitForElement(fridge);
		clickAction(fridge);
	}
	@FindBy(linkText="4-door refrigerators")
	WebElement fourDoorFridge;
	public void clickFourDoorFridge() {
		waitForElement(fourDoorFridge);
		clickAction(fourDoorFridge);
	}
	@FindBy(xpath="(//img[@class='product-image'])[2]")
	WebElement frenchDoor;
	public void clickFrenchDoor() {
		waitForElement(frenchDoor);
		clickAction(frenchDoor);
	}
	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement cart;
	public void clickAddToCart() {
		waitForElement(cart);
		jsScrollUntillFound(cart);
		//clickAction(cart);
		jsWebElementClick(cart);
	}
}
