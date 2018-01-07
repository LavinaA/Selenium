package com.pluralsight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/ravi/softwares/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=T4saWrm9Aafy8AfS4orgBg");
	}

}
