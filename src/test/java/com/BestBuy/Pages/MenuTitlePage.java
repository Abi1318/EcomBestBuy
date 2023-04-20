package com.BestBuy.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.BestBuy.Utils.BaseTestEcom;

public class MenuTitlePage extends BaseTestEcom {
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

}
