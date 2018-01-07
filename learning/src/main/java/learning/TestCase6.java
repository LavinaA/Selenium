package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase6 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@1234");
		driver.findElement(By.id("tdb1")).click();
		
		String 	URL= driver.getCurrentUrl();
		
		if (URL.equals("http://www.gcrit.com/build3/admin/index.php")){
			System.out.println("Admin Login Successful -Passed");
		}else {
			System.out.println("Admin login unsuccessful -Failed");
		}
		
		
	}

}
