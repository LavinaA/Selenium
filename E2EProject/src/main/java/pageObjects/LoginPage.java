package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	
    By EmailId =By.xpath(".//*[@id='user_email']");
    By password=By.xpath(".//*[@id='user_password']");
    By proceed=By.xpath(".//*[@id='new_user']/div[3]/input");
    
    
    public LoginPage(WebDriver driver) {
    	this.driver=driver;
    }

    
    public WebElement EmailId(){
    	return driver.findElement(EmailId);
    }
    
    public WebElement password(){
    	return driver.findElement(password);
    }
    
    public WebElement proceed(){
    	return driver.findElement(proceed);
    }

}
