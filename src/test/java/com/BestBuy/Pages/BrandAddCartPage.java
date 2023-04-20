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
	@FindBy(linkText="Apple Watch")
	WebElement watch;
	public void clickAppleWatch() {
		waitForElement(watch);
		clickAction(watch);
	}
	@FindBy(linkText="Apple Watch Series 8 GPS") 
	WebElement watchGPS;
	public void clickWatchGPS() {
		waitForElement(watchGPS);
		clickAction(watchGPS);
	}
	@FindBy(xpath="//button[text()='Add to Cart']")
	
	WebElement cart;
	public void clickAddToCart() {
		waitForElement(cart);
		//clickAction(cart);
		jsScrollUntillFound(cart);
		jsWebElementClick(cart);
	}
	

}
