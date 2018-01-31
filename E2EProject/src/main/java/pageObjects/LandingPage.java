package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver driver;
	
	By Login=By.cssSelector("a[href*='sign_in");
	By title=By.xpath(".//*[@id='content']/div/div/h2");
        
    public LandingPage(WebDriver driver) {
    	this.driver=driver;
    }

	public WebElement Login(){
    	
    	return driver.findElement(Login);
    }
    
    public WebElement getTitle(){
    	return driver.findElement(title);
    }

}
