package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminInterface {
	
	public static WebDriver driver ;
	
	public void launchApplication(){
			driver = new FirefoxDriver();
			driver.get("http://www.gcrit.com/build3/admin/");
	}
	public void closeApplication(){
		driver.close();
	}
	public void adminLogin(String username,String password){
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
	}
		public void addManufacturer(String name){
			driver.findElement(By.linkText("Manufacturers")).click();
			driver.findElement(By.className("ui-button-text")).click();
			driver.findElement(By.name("manufacturers_name")).sendKeys(name);
			driver.findElement(By.id("tdb1")).click();
		}
		public void addCategory(String name){
			driver.findElement(By.linkText("Categories/Products")).click();
			driver.findElement(By.className("ui-button-text")).click();
			driver.findElement(By.name("categories_name[1]")).sendKeys(name);
			driver.findElement(By.id("tdb3")).click();
		}
		/*public void addProduct(String name){
			driver.findElement(By.linkText("Categories/Products")).click();
			driver.findElement(By.xpath(".//*[@id='tdb2']/span[2]")).click();
			driver.findElement(By.name("manufacturers_name")).sendKeys(name);
			driver.findElement(By.id("tdb3")).click();
		}
		*/
		
		public static void main(String[] args) throws InterruptedException {
			AdminInterface obj = new AdminInterface();
//Test Case :1 -Verify "Launch Application (gcrshop webportal Admin Interface) " with valid URL			
			obj.launchApplication();
			Boolean Username = driver.findElement(By.name("username")).isDisplayed();
			Boolean Password = driver.findElement(By.name("password")).isDisplayed();
			Boolean Login= driver.findElement(By.id("tdb1")).isDisplayed();

			if(Username == true && Password == true && Login == true){
				System.out.println("Test Case 1 "+ "Username,Password and Login elements exists -Passed");
			}else
				System.out.println("Test Case 1 "+ "Username,Password and Login elements not exists -Failed");
			obj.closeApplication();
			
			//Test Case :2  -Verify "Admin Login with valid inputs
				obj.launchApplication();
				obj.adminLogin("admin","admin@123");
				String url = driver.getCurrentUrl();
				if (url.equals("http://www.gcrit.com/build3/admin/index.php")){
					System.out.println("Test Case 2 "+ "Admin Login successful -Passed ");
				}else
				System.out.println("Test Case 2 "+ "Admin Login Unsucessful -Failed");
			obj.closeApplication();
			
			//Test Case :3  -Verify required elements availability in GcrShop web portal
 			obj.launchApplication();
			obj.adminLogin("admin", "admin@123");
			boolean CatandProduct = driver.findElement(By.linkText("Categories/Products")).isDisplayed();
			boolean Manufacturer = driver.findElement(By.linkText("Manufacturers")).isDisplayed();
			
			if(CatandProduct == true && Manufacturer ==true){
				System.out.println("Test Case 3 " +"Categories,Products and Manufacturers elements available - Passed");
			}else
				System.out.println("Test Case 3 " +"Categories,Products and Manufacturers elements not available - Failed");
			obj.closeApplication();
			//Test Case :4  -Verify Add Manufacturer in GcrShop web portal
			obj.launchApplication();
			obj.adminLogin("admin","admin@123");
			//String Man_count = driver.findElement(By.xpath(".//*[@id='contentText']/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr[22]/td/table/tbody/tr/td[1]/strong[3]")).getText();
			obj.addManufacturer("InfoSystems");
			String Man_count = driver.findElement(By.xpath(".//*[@id='contentText']/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr[22]/td/table/tbody/tr/td[1]/strong[3]")).getText();
			int manu_count = Integer.parseInt(Man_count);
			driver.navigate().refresh();
			Thread.sleep(5000); 
			if(manu_count == 1197){
				System.out.println("Test Case 4 " +"Manufacturer added : -Passed");
			}else
				System.out.println("Test Case 4 " +"Manufacturer not added : -Failed");
			obj.closeApplication();
			
			
		}

}
