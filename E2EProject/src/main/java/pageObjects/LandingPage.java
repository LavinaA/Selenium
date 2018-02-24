package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver driver;
	
	By Login=By.cssSelector("a[href*='sign_in");
	By title=By.xpath(".//*[@id='content']/div/div/h2");
	By navBar =By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
        
    public LandingPage(WebDriver driver) {
    	this.driver=driver;
    }

	public WebElement Login(){
    	
    	return driver.findElement(Login);
    }
    
    public WebElement getTitle(){
    	return driver.findElement(title);
    }
    public WebElement getNavBar(){
    	return driver.findElement(navBar);
    }

}
