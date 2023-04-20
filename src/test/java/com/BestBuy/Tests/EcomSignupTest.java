package com.BestBuy.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BestBuy.Pages.EcomSignupPage;

import com.BestBuy.Utils.BaseTestEcom;

public class EcomSignupTest extends BaseTestEcom{
	@Test
	public void signUp() {
		launchBrowser("https://www.bestbuy.com");
		EcomSignupPage esp=PageFactory.initElements(driver, EcomSignupPage.class);
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
		
		
		
	}
	
	
	

}
