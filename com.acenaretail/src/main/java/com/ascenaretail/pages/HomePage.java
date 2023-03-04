package com.ascenaretail.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.PropertyConfigurator;

public class HomePage {
	private WebDriver driver;
	private static final Logger LOG = Logger.getLogger(HomePage.class.getName());

	private By myAccountLink = By.xpath("//a[contains(text(), 'My Account')]");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PropertyConfigurator.configure("./src/test/resources/log4j.properties");
	
	}
	
	
	
	  public String getHomePageTitle() { 
		  String tittle = driver.getTitle();
	  LOG.info("browser name is : " + tittle);
	  return tittle;
	  
	  }
	 
	
	public void clickMyAccountlink() throws InterruptedException {
		  LOG.info("Clicking on My Account Link");
		driver.findElement(myAccountLink).click();
		  LOG.info("MyAccount link clicked");
		Thread.sleep(1000);
	}
	
}
