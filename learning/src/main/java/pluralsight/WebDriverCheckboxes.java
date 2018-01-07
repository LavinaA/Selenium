package pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverCheckboxes {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///home/ravi/projects/Selenium/learning/webapp/CheckBoxTest.html");
		driver.findElement(By.id("ItalianCheckbox")).click();
		driver.findElement(By.id("FrenchCheckbox")).click(); 
		driver.findElement(By.id("FrenchCheckbox")).click();
		
	}

}
