package udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class miscellaneous {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		//Maximise the browser
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		//Delete cookies
		driver.manage().deleteAllCookies();
		
	//	driver.manage().deleteCookieNamed("aspfg");
	//	driver.manage().addCookie(cookie);
		
		
		
		
		
		
		

	}

}
