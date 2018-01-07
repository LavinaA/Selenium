package WebDriverTests;

import org.openqa.selenium.By;
//Test case :Admin login functionality with invalid inputs(Negative testing)
//Create object /Instance

public class TestCase3 extends Usermethods {

		public static void main(String[] args) {
			TestCase3 obj = new TestCase3();
			
			obj.launchBrowser();
			obj.adminLogin("admina","admin@123a");
			String Error_Message = driver.findElement(By.className("messageStackError")).getText();
			if (Error_Message.contains("Error: Invalid administrator login attempt.")){
				System.out.println("Handling Invalid inputs -Passed");
			}
			else {
			System.out.println("Not handling Invalid inputs -Failed");	
			}
			
			obj.closeBrowser();
		}

	}

