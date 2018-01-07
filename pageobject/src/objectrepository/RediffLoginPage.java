package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	
	WebDriver driver;
	By username=By.xpath(".//*[@id='login1']");
	By password=By.xpath(".//*[@id='password']");
	By proceed =By.xpath("//input[@value='Go']");
	By home=By.linkText("Home");
	
	public RediffLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement EmailId(){
		
		return (driver.findElement(username));
		
	}
	
public WebElement password(){
		
		return (driver.findElement(password));
		
	}

public WebElement proceed(){
	
	return (driver.findElement(proceed));
	
}

public WebElement home(){
	
	return (driver.findElement(home));
	
}


}
