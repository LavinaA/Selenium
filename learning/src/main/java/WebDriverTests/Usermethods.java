package WebDriverTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Usermethods {
	public static WebDriver driver ;
	
	public void launchBrowser(){
		driver = new FirefoxDriver();
	}
	
	public void adminLogin(){
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
	}
	public void adminLogin(String username,String password){
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
	} 
	public void closeBrowser(){
		if(!driver.toString().contains("null")){
			driver.close();
		}
	}

	public static void main(String[] args) {
		Usermethods obj = new Usermethods();
		obj.launchBrowser();
		obj.adminLogin();
		driver.close();
		obj.launchBrowser();
		obj.adminLogin("admin","admin@123");
		driver.close();
		
	}

}
