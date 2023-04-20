package com.BestBuy.Tests;

import org.testng.annotations.Test;

import com.BestBuy.Utils.BaseTestEcom;

public class launh_BrokenLink extends BaseTestEcom {
	@Test
	public void link() {

		// 1.Write code to open a web browser and navigate to the Best Buy e-commerce website (https://www.bestbuy.com/).
		launchBrowser("https://www.bestbuy.com");
		Brokenlink();

	}
}