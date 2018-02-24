package academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class validateTitle extends Base {

	//public WebDriver driver;

	public static Logger log =LogManager.getLogger(validateTitle.class.getName());

	@BeforeTest
	public void initialize() throws IOException{
		driver=initializeDriver();
		log.info("Driver initialized");

	}

	@Test
	public void basePageNavigation() throws IOException {
		//	driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		LandingPage lp=new LandingPage(driver);
		log.info("Navigated to home page");
		//compare value from actualand expeted
		System.out.println(lp.getTitle().getText());
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES123");
		log.info("Sucessfully validated");
		System.out.println("Test case ends");
	}
	
	@AfterTest
	public void closeBrowser(){
		driver.close();
		driver=null;
	}
}

