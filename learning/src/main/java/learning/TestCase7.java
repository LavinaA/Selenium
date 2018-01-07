package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase7 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		
		String URL = driver.getCurrentUrl();

		if (URL.contains("http://www.gcrit.com/build3/admin/login.php")){
			String Error_Message = driver.findElement(By.className("messageStackError")).getText();

			if(Error_Message.contains("Invalid administrator login attempt")){
				System.out.println("Handling invalid inputs - Passed");
			}
		}
		else {
			System.out.println(" Not Handling invalid inputs -- Failed ");
		}

	}
} 
