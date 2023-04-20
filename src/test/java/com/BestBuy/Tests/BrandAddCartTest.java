package com.BestBuy.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BestBuy.Pages.BrandAddCartPage;
import com.BestBuy.Utils.BaseTestEcom;

public class BrandAddCartTest extends BaseTestEcom {
	@Test
	public void brandCart() {
		launchBrowser("https://www.bestbuy.com");
		BrandAddCartPage bp=PageFactory.initElements(driver, BrandAddCartPage.class);
		bp.clickUS();
		bp.clickMenu();
		bp.clickBrands();
		bp.clickApple();
		bp.clickAppleWatch();
		bp.clickWatchGPS();
		bp.clickAddToCart();
		
	}
	

}
