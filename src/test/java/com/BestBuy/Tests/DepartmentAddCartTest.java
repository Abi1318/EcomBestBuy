package com.BestBuy.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BestBuy.Pages.DepartmentAddCartPage;
import com.BestBuy.Utils.BaseTestEcom;
import com.BestBuy.Utils.Reports;

@Listeners(Reports.class)
public class DepartmentAddCartTest extends BaseTestEcom {
	Reports rp = new Reports();

	@Test(priority = 3)
	public void addToCartByDepatment() {
		// 7.Write a code to select and add an item from (Menu à Shop by Department).
		rp.setTCDesc("Go to Menu navigate to Shop by Department and Select any one item and add it into the cart");
		launchBrowser("https://www.bestbuy.com");
		DepartmentAddCartPage dp = PageFactory.initElements(driver, DepartmentAddCartPage.class);
		dp.clickUS();
		dp.clickMenu();
		dp.clickAppliances();
		dp.clickKitchenAppliances();
		dp.clickBarWine();
		dp.clickNutriBullet();
		dp.clickAddToCart();
		dp.goToCart();
		System.out.println("NutriBullet item has been added to the cart successfully");
		closeBrowser();
	}

}
