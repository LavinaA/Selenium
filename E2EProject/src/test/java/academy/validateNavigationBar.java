package academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import resources.Base;

public class validateNavigationBar extends Base {

	public static Logger log = LogManager.getLogger(validateNavigationBar.class.getName());

	@BeforeTest
	public void initialize() throws IOException{
		log.info("Driver initialised-1");
		driver=initializeDriver();
	}

	@Test
	public void basePageNavigation() throws IOException{
		driver.get("http://www.qaclickacademy.com/");
		driver.get(prop.getProperty("url"));
		LandingPage lp=new LandingPage(driver);
		Assert.assertTrue(lp.getNavBar().isDisplayed());	
	}

	@AfterTest
	public void closeBrowser(){
		driver.close();
		driver=null;
		log.info("Driver closed-1");
	}
}

