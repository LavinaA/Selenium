package learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	public static void main(String[] args) {
		System.out.println(" [ Starting... ]");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
        driver.get("http://www.google.com");
 
		driver.quit();
		
		System.out.println(" [ Ending... ]");
	}
}
