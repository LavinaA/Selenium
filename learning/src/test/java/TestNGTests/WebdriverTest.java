package TestNGTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebdriverTest {
	WebDriver driver ;
	@BeforeClass
	public void launchBrowser(){
		driver = new FirefoxDriver();
	}
	@Test (priority =2)
	public void verifyTitle(){
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin" );
		Assert.assertEquals("Gmail",driver.getTitle());
	}
	@Test (priority =3)
	public void verifyTitle1(){
		driver.get("https://www.yahoo.com" );
		Assert.assertEquals("Yahoo",driver.getTitle());
	}
	@AfterClass 
	public void closeBrowser(){
		driver.close();
	}
}
