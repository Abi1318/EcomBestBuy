package com.BestBuy.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BestBuy.Pages.BrandAddCartPage;
import com.BestBuy.Utils.BaseTestEcom;
import com.BestBuy.Utils.Reports;

@Listeners(Reports.class)
public class BrandAddCartTest extends BaseTestEcom {
	Reports rp = new Reports();
	@Test(priority = 4)
	public void brandCart() {
		// 8.Write a code to select and add an item from (Menu à Brands à Select Any Brand).
		rp.setTCDesc("Go to menu navigate to Brands & navigate to Apple brand & navigate to Airpods then select one item & add it into cart");
		launchBrowser("https://www.bestbuy.com");
		BrandAddCartPage bp = PageFactory.initElements(driver, BrandAddCartPage.class);
		bp.clickUS();
		bp.clickMenu();
		bp.clickBrands();
		bp.clickApple();
		bp.clickAirPods();
		bp.clickEarPods();
		bp.clickAddToCart();
		bp.goToCart();
		System.out.println("Earpod item has been added to the cart successfully");
		closeBrowser();
	}

}
