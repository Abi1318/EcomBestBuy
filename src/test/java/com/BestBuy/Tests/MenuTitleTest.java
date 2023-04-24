package com.BestBuy.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.BestBuy.Pages.MenuTitlePage;
import com.BestBuy.Utils.BaseTestEcom;
import com.BestBuy.Utils.Reports;

@Listeners(Reports.class)
public class MenuTitleTest extends BaseTestEcom {
	Reports rp = new Reports();

	@Test(priority = 0)
	public void title() {
		try {
			// 4.Write a code for navigation of all Menu and validation of title in each page.
			rp.setTCDesc("Navigate to all menu and validate the titles in each page");
			launchBrowser("https://www.bestbuy.com");
			MenuTitlePage mp = PageFactory.initElements(driver, MenuTitlePage.class);
			mp.clickUS();
			mp.clickTopDeal();
			mp.validateTitle("Top Deals and Featured Offers on Electronics - Best Buy");
			System.out.println("Top Deal : Title validation done");

			mp.clickDealOfTheDay();
			mp.validateTitle("Deal of the Day: Electronics Deals - Best Buy");
			System.out.println("Deal of the Day : Title validation done");

			mp.clickTotaltech();
			mp.validateTitle("Best Buy Totaltech™ – Best Buy");
			System.out.println("Totaltech Membership : Title validation done");

			mp.clickCreditCard();
			mp.validateTitle("Best Buy Credit Card: Rewards & Financing");
			System.out.println("Credit Card : Title validation done ");

			mp.clickGiftCard();
			mp.validateTitle("Gifts Cards and E-Gift Cards - Best Buy");
			System.out.println("Gift Cards : Title validation done");

			mp.clickMore();
			mp.clickGiftIdeas();
			Thread.sleep(3000);
			mp.validateTitle("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
			System.out.println("More-->Gift Ideas : Title validation done");

			mp.clickMore();
			mp.clickHealthWellness();
			Thread.sleep(3000);
			mp.validateTitle("Health & Wellness Solutions & Technology - Best Buy");
			System.out.println("More-->Health & Wellness : Title validation done");

			mp.clickMore();
			mp.clickOutlet();
			Thread.sleep(3000);
			mp.validateTitle("Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy");
			System.out.println("More-->Best Buy Outlet : Title validation done");

			mp.clickMore();
			mp.clickBusiness();
			Thread.sleep(3000);
			mp.validateTitle("Best Buy for Business - Best Buy");
			System.out.println("More-->Best buy business : Title validation done");
			closeBrowser();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
