package com.BestBuy.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BestBuy.Utils.BaseTestEcom;

public class BottomLinkPage extends BaseTestEcom{
	@FindBy(linkText= "United States")
	WebElement US;
	public void clickUS() {
		waitForElement(US);
		clickAction(US);
	}
	@FindBy(linkText="Accessibility")
	WebElement link;
	public void lastlink() {
		waitForElement(link);
		jsScrollUntillFound(link);
	}
	@FindBy(xpath="//span[text()='Account']")
	WebElement Accounts;
	public void firstHeader() {
		waitForElement(Accounts);
		jsScrollUntillFound(Accounts);
	}
	@FindBy(xpath="//div[@class='flex justify-content-start']//a")
	List<WebElement> atags;
	public void aTags() {
		for (WebElement seperattion : atags) {
			String bottomLink = seperattion.getAttribute("href");
			Brokenlink(bottomLink);
		}
		
	}

}
