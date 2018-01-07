package pluralsight;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoAdvancedElements {

	public static void main(String[] args) throws Exception {
	/*	WebDriver driver = new FirefoxDriver();*/
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities("firefox","",Platform.LINUX);
		desiredCapabilities.setCapability("marionette", true);
		URL remoteAddress = new URL("http://localhost:4444/wd/hub");
		WebDriver driver = 	new RemoteWebDriver(remoteAddress,desiredCapabilities);
		
		driver.get("https://www.google.co.in/");
		WebElement searchField = driver.findElement(By.id("lst-ib"));
		searchField.sendKeys("pluralsight");
		searchField.submit();
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait wait =new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Images")));
		driver.findElement(By.linkText("Images")).click(); 
		
		WebElement imageElement = driver.findElements(By.cssSelector("a[class = rg_1]")).get(0);
		WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
		imageLink.click();
	}

}
