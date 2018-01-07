package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 Actions a =new Actions(driver);
		 
		 //To hover our mouse over specified elemet
		 a.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]"))).build().perform();
		 
		 //To right click on the element after hovering(Context click is the function name fro right click
		 a.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]"))).contextClick().build().perform();
		 
		 //to enter something in capital letters
		 a.moveToElement(driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		 //to select entered text
		 a.moveToElement(driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	
	}

}
