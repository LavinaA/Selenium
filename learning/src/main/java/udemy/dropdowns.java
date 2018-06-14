package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {

	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.spicejet.com/");
		//Example of static dropdown
		//If you have Sleect tag in html then only you can use Select class
		//In select class you need to pass the locator of dropdown so s object is aware of dropdown
		// If you want to accees any methods in class ,create object for that class and access methods
		/*Select s =new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
		s.selectByIndex(0);
		s.selectByValue("5");
		s.selectByVisibleText("3 Adults");*/
		
//		//Example of dynamic dropdown

		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='CJB']")).click();
		//Trickey part here is you need to pick the second instance of destination by wrapping the entire 
		//xpath with [2] (second) instance.
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
		
	}

}
