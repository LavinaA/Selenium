package learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementHandling {
	public static void main(String[] args)  {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		String Error_Msg = alert.getText();
		System.out.println(Error_Msg);
		//alert.dismiss();
	}
}



