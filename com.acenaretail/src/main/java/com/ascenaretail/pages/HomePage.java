package com.ascenaretail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {
	private WebDriver driver;
	
	
	private By myAccountLink = By.xpath("//a[contains(text(), 'My Account')]");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	
	}
	
	
	
	  public String getHomePageTitle() { 
		  String tittle = driver.getTitle();
	  System.out.println("login page title : " + tittle);
	  return tittle;
	  
	  }
	 
	
	public void clickMyAccountlink() throws InterruptedException {
		System.out.println("about to click ");
		driver.findElement(myAccountLink).click();
		Thread.sleep(1000);
	}
	
}
