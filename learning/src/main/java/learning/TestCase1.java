package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver() ;
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		driver.findElement(By.linkText("Create account")).click();
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		if(URL.contains("wikipedia.org")){
			System.out.println("It is an internal link which is directed to another page insame application");
		}
		else{
			System.out.println("It is an external link directed to another page in another application");
		}
		driver.navigate().back();
		driver.findElement(By.partialLinkText("seleniumhq")).click();
		String URL1= driver.getCurrentUrl();
		System.out.println(URL1);
		
		if (!URL1.contains("wikipedia.org")){
			System.out.println("It is an external link directed to another page in another application");
		}
		else {
			System.out.println("It is an internal link which is directed to another page insame application");
		}

	}

}
