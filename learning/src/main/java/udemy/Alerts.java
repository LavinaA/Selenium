package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		//driver.switchTo().alert().accept();//ok done yes
		System.out.println(driver.switchTo().alert().getText());
		
		//to send text in the edit box of alert
		driver.switchTo().alert().sendKeys("xyz");
	}
//for negative acceptions like to click on cancel etc
	//driver.switchTo().alert().dismiss()
}
 