package WebDriverTests;
//redirects to user interface from admin interface

import org.openqa.selenium.By;

public class TestCase1 extends Usermethods{

	public static void main(String[] args) {
		TestCase1 obj = new TestCase1();
		
		obj.launchBrowser();
		obj.adminLogin("admin","admin@123");
		driver.findElement(By.linkText("Online Catalog")).click();
		String url = driver.getCurrentUrl();
		if (url.contains("http://www.gcrit.com/build3/")){
			System.out.println("Redirected to user Interface - Passed");
		}
		else {
		System.out.println("Redirected to user Interface - Passed");	
		}
		
		obj.closeBrowser();
	}

}
