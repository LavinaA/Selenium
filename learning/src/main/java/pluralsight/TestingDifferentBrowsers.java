package pluralsight;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingDifferentBrowsers {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","/home/ravi/softwares/chromedriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("agrawallavina45@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("washingtondc45");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
	}
	

}
