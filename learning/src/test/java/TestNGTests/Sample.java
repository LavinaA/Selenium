package TestNGTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void verifyTitle(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com");
		String pageTitle = driver.getTitle();
		Assert.assertEquals(pageTitle,"Sign in - Google Accounts");
	}
}
