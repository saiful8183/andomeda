package com.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	//creating a constructor of homepage class
    public HomePage(WebDriver driver) { 
	
    	this.driver = driver; 
    	PageFactory.initElements(driver, this); 
    	 
    	} 
    	 
    	@FindBy(xpath="//button[@ng-click='manager()']") 
    	WebElement managerLoginBtn; 

	
	
		
	
	
	@FindBy(xpath="//button[@ng-class='btnClass1']") 
	WebElement addCustomer; 
	 
	@FindBy(xpath="//input[@ng-model='fName']") 
	WebElement fName; 
	 
	@FindBy(xpath="//input[@ng-model='lName']") 
	WebElement lName; 
	 
	@FindBy(xpath="//input[@ng-model='postCd']") 
	WebElement zipCode; 
	 
	@FindBy(xpath="//button[@type='submit']") 
	WebElement addBtn;

	
	
	
	
	
	
	
	//login manager
	public void loginAsManager() {
		
		managerLoginBtn.click();
	}
	
	
	public void addCustomer(String fname, String lname, String zip) { 
		addCustomer.click(); 
		fName.sendKeys(fname); 
		lName.sendKeys(lname); 
		zipCode.sendKeys(zip); 
		addBtn.click(); 
		driver.switchTo().alert().accept(); 
		}

	
	
         }
	
	

