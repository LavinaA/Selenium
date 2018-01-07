package com.academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageObjects.LandingPage;
import com.resources.Base;

public class validateTitle extends Base {
	
	public WebDriver driver;

	@Test
	
	public void basePageNavigation() throws IOException{
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		LandingPage lp=new LandingPage(driver);
		//compare value from actualand expeted
		System.out.println(lp.getTitle().getText());
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES");
		
	}
	}

