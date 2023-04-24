package com.BestBuy.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BestBuy.Utils.BaseTestEcom;



//4.Write a code for navigation of all Menu and validation of title in each page.
public class MenuTitlePage extends BaseTestEcom {
	@FindBy(linkText= "United States")
	WebElement US;
	public void clickUS() {
		waitForElement(US);
		clickAction(US);
	}
	@FindBy(linkText="Top Deals")
	WebElement deal;
	public void clickTopDeal() {
		waitForElement(deal);
		clickAction(deal);
	}
	@FindBy(linkText="Deal of the Day")
	WebElement daydeal;
	public void clickDealOfTheDay() {
		waitForElement(daydeal);
		clickAction(daydeal);
	}
	@FindBy(linkText="Totaltech Membership")
	WebElement totaltech;
	public void clickTotaltech() {
		waitForElement(totaltech);
		clickAction(totaltech);
	}
	@FindBy(linkText="Credit Cards")
	WebElement credit;
	public void clickCreditCard() {
		waitForElement(credit);
		clickAction(credit);
	}
	@FindBy(linkText="Gift Cards")
	WebElement gift;
	public void clickGiftCard() {
		waitForElement(gift);
		clickAction(gift);
	}
	@FindBy(xpath="//span[text()='More']")
	WebElement mor;
	public void clickMore() {
		waitForElement(mor);
		clickAction(mor);
	}
	@FindBy(linkText="Gift Ideas")
	WebElement ideas;
	public void clickGiftIdeas() {
		waitForElement(ideas);
		clickAction(ideas);
	}
	@FindBy(linkText="Health & Wellness")
	WebElement health;
	public void clickHealthWellness() {
		waitForElement(health);
		clickAction(health);
	}
	
	@FindBy(linkText="Best Buy Outlet")
	WebElement outlet;
	public void clickOutlet() {
		waitForElement(outlet);
		clickAction(outlet);
	}
	
	@FindBy(linkText="Best Buy Business")
	WebElement business;
	public void clickBusiness() {
		waitForElement(business);
		clickAction(business);
	}
	
	
}
