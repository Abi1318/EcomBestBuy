package com.BestBuy.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BestBuy.Pages.SearchPage;


public class SearchTest extends EcomLoginTest{
	@Test
	public void searchAndAddToCart() {
		//signIn();
		launchBrowser("https://www.bestbuy.com");
		SearchPage sp=PageFactory.initElements(driver, SearchPage.class);
		sp.clickUS();
		sp.box("toys for girls");
		sp.clickSearchBox();
		sp.clickfirstToy();
		sp.addToCart();
	sp.goToCart();
		
	}
	

}
