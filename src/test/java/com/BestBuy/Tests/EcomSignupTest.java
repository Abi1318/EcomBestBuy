package com.BestBuy.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BestBuy.Pages.EcomSignupPage;

import com.BestBuy.Utils.BaseTestEcom;
import com.BestBuy.Utils.Reports;

@Listeners(Reports.class)
public class EcomSignupTest extends BaseTestEcom {

	Reports rp = new Reports();

	@Test(priority = -2)
	public void signUp() {
		// 3.Write a code to do Sign-Up functionality.
		rp.setTCDesc("Sign up the BestBuy E-commerce Website");
		launchBrowser("https://www.bestbuy.com");
		EcomSignupPage esp = PageFactory.initElements(driver, EcomSignupPage.class);
		esp.clickUS();
		esp.clickAccounts();
		esp.clickCreatAccount();
		esp.typeFirstName("Abinaya");
		esp.typeLastName("MuraliMohan");
		esp.typeEmail("abinayakarunagaran09@gmail.com");
		esp.typePass("Nine+One=10");
		esp.typeRePass("Nine+One=10");
		esp.typePhNo("9944266691");
		esp.clickCreateAc();
		System.out.println("BestBuy Sign up has been been done");
		closeBrowser();

	}

}
