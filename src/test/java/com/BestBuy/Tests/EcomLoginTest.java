package com.BestBuy.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BestBuy.Pages.EcomLoginPage;
import com.BestBuy.Utils.BaseTestEcom;

public class EcomLoginTest extends BaseTestEcom{
	@Test
	public void signIn() {
		launchBrowser("https://www.bestbuy.com");
		EcomLoginPage elp=PageFactory.initElements(driver, EcomLoginPage.class);
		elp.clickUS();
		elp.clickAccounts();
		elp.clickSignIn();
		elp.typeMail("abinayakarunagaran09@gmail.com");
		elp.enterPassword("Nine+One=10");
		elp.clickLogin();	
	}
	

}
