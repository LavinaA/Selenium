package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sanityTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
			driver.get("http://www.gcrit.com/build3/admin/login.php?osCAdminID=pg37dk1m527ip23baosr0r8su6");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin@123");
			driver.findElement(By.id("tdb1")).click();
			
			String url = driver.getCurrentUrl();
			if (url.equals("http://www.gcrit.com/build3/admin/index.php?osCAdminID=pg37dk1m527ip23baosr0r8su6&osCAdminID=pg37dk1m527ip23baosr0r8su6"))
			{
				System.out.println("Login passed");
				
			}else
			{
				System.out.println("Login Failed");
			}
			driver.close();
	}

}
