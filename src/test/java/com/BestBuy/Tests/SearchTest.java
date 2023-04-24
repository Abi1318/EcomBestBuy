package com.BestBuy.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BestBuy.Pages.SearchPage;
import com.BestBuy.Utils.BaseTestEcom;
import com.BestBuy.Utils.Reports;

@Listeners(Reports.class)
public class SearchTest extends BaseTestEcom {
	Reports rp = new Reports();

	@Test(priority = 2)
	public void searchAndAddToCart() {
		// 6.Write code to search for and add an item to the shopping cart.
		rp.setTCDesc("Serach Toys for Girls and add any one item into the cart");
		launchBrowser("https://www.bestbuy.com");
		SearchPage sp = PageFactory.initElements(driver, SearchPage.class);
		sp.clickUSlogin();
		sp.box("toys for girls");
		sp.clickSearchBox();
		sp.clickfirstToy();
		sp.addToCart();
		sp.goToCart();
		System.out.println("Toys for girl's item has been added to the cart successfully");
		closeBrowser();
	}
}
		