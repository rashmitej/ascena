package com.acenaretail.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.ascenaretail.pages.HomePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest {
	

		public static WebDriver driver;
		public HomePage homepage;

	
@BeforeTest
	public void setup() {

	
		driver = new ChromeDriver();
		driver.get("https://loft.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		homepage = new HomePage(driver);

	}

	
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}
	

}
