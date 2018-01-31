package com.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	WebDriver driver;	
	
	
	//Properties class pules the data from properties file and the knowledge that where the file
	//is present is given by Fileinputstrean and to link both we have load method
	public WebDriver initializeDriver() throws IOException{
	
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("//home//ravi//projects//Selenium//E2EProject//src//main//java//com//resources//data.properties");
	
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("Chrome")){
		driver=new ChromeDriver();
	}
	else if(browserName.equals("Firefox")){

		driver=new FirefoxDriver();
	}
	else if(browserName.equals("IE"))
	{
		driver=new InternetExplorerDriver();
	}
	
	return driver;
	
	
}

}
