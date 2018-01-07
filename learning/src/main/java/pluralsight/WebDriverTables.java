package pluralsight;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTables {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///home/ravi/projects/Selenium/learning/webapp/TableTest.html");
		WebElement outertable =driver.findElement(By.tagName("table"));
		System.out.println(outertable.getText());
		System.out.println(outertable.getTagName());
		WebElement innertable = outertable.findElement(By.tagName("table"));
		System.out.println(innertable);

		/*WebElement row = innertable.findElements(By.tagName("td")).get(1);*/
		
		List<WebElement> elements= innertable.findElements(By.tagName("td"));
		WebElement element = elements.get(1);
		
		System.out.println(element.getText());
		  
		
	}

}
