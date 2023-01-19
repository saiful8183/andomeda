package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ConfigDataProvider {

	
	Properties prop;
	
	
public  ConfigDataProvider() {
		
		
	File src=new File("./Config/config.properties");	
	
	try {
		FileInputStream fis = new FileInputStream(src); 
		prop = new Properties(); 
		prop.load(fis);
	} catch (Exception e) {
		
		System.out.println("Unable to read config file");
		
		
		
	}
	}

public String getBrowser() { 
return prop.getProperty("browser"); 
}



public String getUrl() { 
return prop.getProperty("url"); 


}

public String getFname() {
	return prop.getProperty("fname");
}



public String getLname() {
	return prop.getProperty("lname");
}

public String getZip() {
	return prop.getProperty("zip");
	}
}





