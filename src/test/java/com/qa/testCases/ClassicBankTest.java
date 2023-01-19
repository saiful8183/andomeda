package com.qa.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClassicBankTest {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.firefox.driver","/Users/saiful/Downloads/geckodriver");
		  
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//Opening an URL
driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");//Fb,target

/*
 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * //login as a manager
 * driver.findElement(By.xpath("//button[@ng-click='manager()']")).click();
 * //click on add customer button
 * 
 * driver.findElement(By.xpath("//button[@ng-class='btnClass1']")).click();
 * 
 * 
 * //adding customer details
 * driver.findElement(By.xpath("//input[@ng-model='fName']")).sendKeys("Abc");
 * driver.findElement(By.xpath("//input[@ng-model='lName']")).sendKeys("Xyz");
 * driver.findElement(By.xpath("//input[@ng-model='postCd']")).sendKeys("10008")
 * ;
 * 
 * // clicking on add customer button
 * driver.findElement(By.xpath("//button[@type='submit']")).click();
 * 
 * //handling alart driver.switchTo().alert().accept();
 * 
 * 
 * //clicking open account button
 * driver.findElement(By.xpath("//button[@ng-class='btnClass2']")).click();
 * 
 * 
 * //clicking on CustomerName drop down button WebDriverWait wait=new
 * WebDriverWait (driver, Duration.ofSeconds(10));
 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
 * "//label/parent::div/child::select[@name='userSelect']")));
 * 
 * 
 * //click on the dropdown button
 * 
 * 
 * driver.findElement(By.xpath(
 * "//label/parent::div/child::select[@name='userSelect']")).click();
 * 
 * 
 * //select the newly added customer Select dropdown = new
 * Select(driver.findElement(By.name("userSelect")));
 * dropdown.selectByVisibleText("Abc Xyz");
 * 
 * 
 * 
 * 
 * 
 * //select currency Select currency = new
 * Select(driver.findElement(By.name("currency")));
 * currency.selectByVisibleText("Dollar");
 * 
 * 
 * 
 * 
 * 
 * //clicking on process button
 * driver.findElement(By.xpath("//button[@type='submit']")).click();
 * 
 * 
 * //accepting the account creation alert driver.switchTo().alert().accept();
 * 
 * 
 * //clicking on home button
 * driver.findElement(By.cssSelector("button.btn.home")).click();
 * 
 * 
 * 
 * //click on customer login button
 * driver.findElement(By.xpath("//button[@ng-click='customer()']")).click();
 * 
 * 
 * //Select dropDown = new Select (driver.findElement(By.name("currency")));
 * //dropDown.selectByVisibleText("Dollar");
 * 
 * 
 * 
 * //select a customer Select customer = new
 * Select(driver.findElement(By.name("userSelect")));
 * customer.selectByVisibleText("Abc Xyz");
 * 
 * 
 * //clicking on login button
 * driver.findElement(By.xpath("//button[@type='submit']")).click();
 * 
 * 
 * //click on deposit button
 * driver.findElement(By.xpath("//button[@ng-class='btnClass2']")).click();
 * 
 * 
 * 
 * 
 * 
 * //processing $1000 deposit -- passing 1000 in amount field
 * driver.findElement(By.xpath("//input[@ng-model='amount']")).sendKeys("100000"
 * );
 * 
 * 
 * //clicking on deposit button
 * driver.findElement(By.xpath("//button[@type='submit']")).click();
 * 
 * 
 * //capturing success message String successMessage =
 * driver.findElement(By.xpath("//span[@ng-show='message']")).getText();
 * System.out.println(successMessage);
 * 
 */
	}
	
	
}	




	


	

