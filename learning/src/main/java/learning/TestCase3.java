package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase3 {

	public static void main(String[] args) {
		FirefoxDriver  driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/");
		driver.findElement(By.linkText("create an account")).click();
		driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Lavina");
		driver.findElement(By.name("lastname")).sendKeys("Agrawal");
		driver.findElement(By.name("dob")).sendKeys("10/26/1990");
		driver.findElement(By.name("email_address")).sendKeys("agrawallavi12@gmail.com");
		driver.findElement(By.name("street_address")).sendKeys("J-18 Mantri Aangan");
		driver.findElement(By.name("postcode")).sendKeys("411036");
		driver.findElement(By.name("city")).sendKeys("Pune");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		//driver.findElement(By.name("country")).sendKeys("India"); for drop down list this also working
		Select dropdown = new Select(driver.findElement(By.name("country")));
		dropdown.selectByVisibleText("India");
		driver.findElement(By.name("telephone")).sendKeys("8446758021");
		driver.findElement(By.name("password")).sendKeys("abcd123");
		driver.findElement(By.name("confirmation")).sendKeys("abcd123");
		driver.findElement(By.id("tdb4")).click();
		
		String Confirmation_message = driver.findElement(By.xpath(".//*[@id='bodyContent']/h1")).getText();
		
		if(Confirmation_message.equals("Your Account Has Been Created!")){
			System.out.println("Customer Registration successfull - Passed");
		}
			else {
				System.out.println(("Customer Registration Unsuccessful - Failed "));
			}
		driver.close();
		
		
	}

}
