package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomePage;
import objectrepository.RediffLoginPage;

public class Loginapllication {
	
	@Test
	public void Login(){
		
		//System.setProperty("webdriver.gecko.driver", "lib//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPage rp =new RediffLoginPage(driver);
		
		rp.EmailId().sendKeys("hello");
		rp.password().sendKeys("hi");
		rp.proceed().click();
		rp.home().click();
		
		RediffHomePage rh = new RediffHomePage(driver);
		rh.search().sendKeys("hello");
		rh.submit().click();
		
		/*RediffLoginPagePF lpf =new RediffLoginPagePF(driver);
		lpf.EmailId().sendKeys("rediff");
		lpf.password().sendKeys("hi");
		lpf.proceed().click();*/
		
	
	}

}
