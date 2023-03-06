package com.acenaretail.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.acenaretail.base.BaseTest;


public class HomePageTest extends BaseTest{
	@Test(priority = 1)
	public void homePageTitleTest() {
		String actualTitle = homepage.getHomePageTitle();
		System.out.println("Tittle" + actualTitle);

		
	}
	@Test(priority = 2)
	public void homePageMyaccountclick() throws InterruptedException {
		homepage.clickMyAccountlink();

		
	}
	
	@Test(priority = 3)
	public void testcaseFail() {
		Assert.fail("this test failed");
	}


}
