package com.BestBuy.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BestBuy.Pages.EcomLoginPage;
import com.BestBuy.Utils.BaseTestEcom;
import com.BestBuy.Utils.Reports;

@Listeners(Reports.class)
public class EcomLoginTest extends BaseTestEcom{
	Reports rp = new Reports();
	@Test(priority = -1)
	public void signIn() {
		// 3.Write a code to do Login functionality.
		rp.setTCDesc("Login the BestBuy E-commerce Website");
		launchBrowser("https://www.bestbuy.com");
		EcomLoginPage elp=PageFactory.initElements(driver, EcomLoginPage.class);
		elp.clickUS();
		elp.clickAccounts();
		elp.clickSignIn();
		elp.typeMail("abinayakarunagaran09@gmail.com");
		elp.enterPassword("Nine+One=10");
		elp.clickLogin();
		screenShotOperation("LoginProblem");
		System.out.println("BestBuy Sign in has been been done");
		closeBrowser();
	}
	

}
