package WebDriverTests;

//Test case :Admin login functionality with valid inputs(Positive testing)
//Create object /Instance

public class TestCase2 extends Usermethods {

		public static void main(String[] args) {
			TestCase2 obj = new TestCase2();
			
			obj.launchBrowser();
			obj.adminLogin("admin","admin@123");
			String url = driver.getCurrentUrl();
			if (url.contains("http://www.gcrit.com/build3/admin/index.php")){
				System.out.println("Admin Login successful - Passed");
			}
			else {
			System.out.println("Admin Login unsuccessful - Failed");	
			}
			
			obj.closeBrowser();
		}

	}


