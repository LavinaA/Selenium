package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase4 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://gcrit.com/build3/");
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.name("email_address")).sendKeys("agrawallavi12@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcd123");
		driver.findElement(By.id("tdb5")).click();
		String url = driver.getCurrentUrl();
		//System.out.println(url);

		if (url.contains("http://www.gcrit.com/build3/index.php")){
		System.out.println("Login Successful - Passed");
		}
		else{
		System.out.println("Login Unsuccessful - Failed");
		}
		driver.close(); 
	}

}
