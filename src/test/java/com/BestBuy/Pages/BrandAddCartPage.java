package com.BestBuy.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BestBuy.Utils.BaseTestEcom;

public class BrandAddCartPage extends BaseTestEcom{
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
	@FindBy(xpath="//button[text()='Brands']")
	WebElement brands;
	public void clickBrands() {
		waitForElement(brands);
		clickAction(brands);
	}
	@FindBy(linkText="Apple")
	WebElement apple;
	public void clickApple() {
		waitForElement(apple);
		clickAction(apple);
	}
	@FindBy(linkText="AirPods")
	WebElement airpod;
	public void clickAirPods() {
		waitForElement(airpod);
		clickAction(airpod);
	}
	@FindBy(linkText="EarPods") 
	WebElement ear;
	public void clickEarPods() {
		waitForElement(ear);
		clickAction(ear);
	}
	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement cart;
	public void clickAddToCart() {
		waitForElement(cart);
		//clickAction(cart);
		//jsScrollUntillFound(cart);
		jsWebElementClick(cart);
	}
	@FindBy(linkText="Go to Cart")
	WebElement goCart;
	public void goToCart() {
		waitForElement(goCart);
		clickAction(goCart);
	}

}
