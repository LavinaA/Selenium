package WebDriverTests;

import org.openqa.selenium.By;

public class TestCase4 extends Usermethods {

	public static void main(String[] args) {
		TestCase4 obj4 = new TestCase4();
		//Test Case 1 :Redirects to user interface from admin interface
		obj4.launchBrowser();
		obj4.adminLogin("admin","admin@123");
		driver.findElement(By.linkText("Online Catalog")).click();
		String url = driver.getCurrentUrl();
		if (url.contains("http://www.gcrit.com/build3/")){
			System.out.println("Test Case 1:Redirected to user Interface - Passed");
		}
		else {
		System.out.println("Test Case 1:Redirected to user Interface - Passed");	
		}
		
		obj4.closeBrowser();
		
		//TestCAse 2 -Admin login functionality with valid inputs(Positive testing)
		obj4.launchBrowser();
		obj4.adminLogin("admin","admin@123");
		String url1 = driver.getCurrentUrl();
		if (url1.contains("http://www.gcrit.com/build3/admin/index.php")){
			System.out.println("Test Case 2:Admin Login successful - Passed");
		}
		else {
		System.out.println("Test Case 2:Admin Login unsuccessful - Failed");	
		}
		
		obj4.closeBrowser();
		
		///Test case :Admin login functionality with invalid inputs(Negative testing)
		obj4.launchBrowser();
		obj4.adminLogin("admina","admin@123a");
		String Error_Message = driver.findElement(By.className("messageStackError")).getText();
		if (Error_Message.contains("Error: Invalid administrator login attempt.")){
			System.out.println("Test Case 3:Handling Invalid inputs -Passed");
		}
		else {
		System.out.println("Test Case 3:Not handling Invalid inputs -Failed");	
		}
		
		obj4.closeBrowser();
		
	}

}
