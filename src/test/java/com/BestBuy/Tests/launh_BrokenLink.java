package com.BestBuy.Tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BestBuy.Utils.BaseTestEcom;
import com.BestBuy.Utils.Reports;


@Listeners(Reports.class)
public class Launh_BrokenLink extends BaseTestEcom {
	
	Reports rp=new Reports();
	
	@Test(priority = -3)
	public void link() {

		// 1.Write code to open a web browser and navigate to the Best Buy e-commerce website (https://www.bestbuy.com/).
		rp.setTCDesc("Launch the url and validate if the given URL is broken link or not.");
		launchBrowser("https://www.bestbuy.com");
		
		// 2.Write a code to validate if the given URL Link is broken.
		Brokenlink("https://www.bestbuy.com");
		closeBrowser();

	}
}