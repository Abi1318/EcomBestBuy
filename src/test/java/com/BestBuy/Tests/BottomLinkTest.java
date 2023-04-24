package com.BestBuy.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BestBuy.Pages.BottomLinkPage;
import com.BestBuy.Utils.BaseTestEcom;
import com.BestBuy.Utils.Reports;

@Listeners(Reports.class)
public class BottomLinkTest extends BaseTestEcom {
	Reports rp = new Reports();

	@Test(priority = 1)
	public void signIn() throws Exception {
		// 5.Write a code to validate the bottom links on the Home page.
		rp.setTCDesc("Validate the bottom links on the Home Page");
		launchBrowser("https://www.bestbuy.com");
		BottomLinkPage bp = PageFactory.initElements(driver, BottomLinkPage.class);
		bp.clickUS();
		bp.lastlink();
		bp.aTags();
		Thread.sleep(3000);
		bp.firstHeader();
		closeBrowser();
	}
}
