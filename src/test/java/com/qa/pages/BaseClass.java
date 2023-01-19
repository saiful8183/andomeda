package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.qa.utilities.ConfigDataProvider;

import com.qa.utilities.Helper;
import com.qa.utilities.BrowserFactory;
public class BaseClass {

	public WebDriver driver; 
	public ConfigDataProvider config; 
	//public ExcelDataProvider excel; 
	public Helper help; 
	public ExtentReports report; 
	public ExtentTest logger;

	@BeforeSuite 
	public void setUpSuite () { 
	config = new ConfigDataProvider(); 
	//excel = new ExcelDataProvider(); 
	help = new Helper(); 
	ExtentHtmlReporter reporter = 
	new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/Bank_"+help.getCurrentTime()+ ".html"); 
	report = new ExtentReports(); 
	report.attachReporter(reporter); 
	}	

	
	@BeforeTest 
	public void setUp() { 

driver = BrowserFactory.openApplication(driver, config.getBrowser(), 
				config.getUrl());
	} 



	@AfterTest
	public void tearDown() throws InterruptedException { 
	Thread.sleep(1000); 
	driver.close(); 
	}
	
	
	}
