package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class globalParameter {
	WebDriver driver;
	
	@Test
	public void login() throws IOException{
		Properties prop=new Properties();
		FileInputStream fis = new FileInputStream("//home//ravi//projects//Selenium//frameworkUdemy//src//datadriven//datadriven.properties");
		prop.load(fis);	
		System.out.println(prop.getProperty("username"));

		if(prop.getProperty("browser").equals("firefox")){
			System.setProperty("webdriver.gecko.driver","//home//ravi//Downloads//geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if(prop.getProperty("browser").equals("Chrome")){
			 driver = new ChromeDriver();
		}
		else{
			 driver = new InternetExplorerDriver();
		}
		
		driver.get(prop.getProperty("url"));
	}

}
