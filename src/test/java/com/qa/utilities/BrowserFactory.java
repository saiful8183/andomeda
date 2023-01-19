
package com.qa.utilities;



import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	
	
	
	WebDriver driver;
	
	public static WebDriver openApplication(WebDriver driver, String browser, String url) {

		WebDriverManager.chromedriver().setup();

		if(browser.equalsIgnoreCase("chrome")) 
		{ 
		System.setProperty("webdriver.chrome.driver", 
		"./Driver/chromedriver"); 
		driver = new ChromeDriver(); 

 
	}

	
	else if(browser.equalsIgnoreCase("firefox")) 
	{ 
	System.setProperty("webdriver.gecko.driver", 
	"./Driver/geckodriver"); 
	driver = new FirefoxDriver(); 

	}

	else if(browser.equalsIgnoreCase("edge")) 
	{ 
	System.setProperty("webdriver.edge.driver", 
	"./Driver/msedgedriver"); 
	driver = new EdgeDriver(); 
	}



	else 
	{ 
	System.out.println("This browser is not supported"); 
	}


	
		driver.manage().window().maximize(); 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



		driver.get(url); 
		return driver;


	
	
	
}
	
}
	
	