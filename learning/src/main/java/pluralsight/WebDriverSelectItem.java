package pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelectItem {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///home/ravi/projects/Selenium/learning/webapp/SelectItem.html");
		WebElement selectElement = driver.findElement(By.id("select1"));
		Select select = new Select(selectElement);
		select.selectByVisibleText("Mercedes"); 
	}

}
