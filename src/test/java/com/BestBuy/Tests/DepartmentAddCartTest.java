package com.BestBuy.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BestBuy.Pages.DepartmentAddCartPage;
import com.BestBuy.Utils.BaseTestEcom;

public class DepartmentAddCartTest extends BaseTestEcom {
	@Test
	public void addToCartByDepatment() {
		launchBrowser("https://www.bestbuy.com");
		DepartmentAddCartPage dp=PageFactory.initElements(driver, DepartmentAddCartPage.class);
		dp.clickUS();
		dp.clickMenu();
		dp.clickAppliances();
		dp.clickKitchenAppliances();
		dp.clickRefridgerators();
		dp.clickFourDoorFridge();
		dp.clickFrenchDoor();
		dp.clickAddToCart();
		
		
		
	}

}
