package pluralsight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverRadioButton {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///home/ravi/projects/Selenium/learning/webapp/RadioButton.html");
		List<WebElement> radiobuttons = driver.findElements(By.name("color"));
		radiobuttons.get(2).click();

		for (WebElement radiobutton : radiobuttons) {
			if(radiobutton.isSelected())
				System.out.println(radiobutton.getAttribute("value"));

		}
		
	}

}
