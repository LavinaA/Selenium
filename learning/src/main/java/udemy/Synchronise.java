package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronise {

	public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        //Example of implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.alaskaair.com/");
        driver.findElement(By.xpath(".//*[@id='fromCity1']")).sendKeys("nyc");
        //to tab from part particualr position use below in sendkeys
        driver.findElement(By.xpath(".//*[@id='fromCity1']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath(".//*[@id='toCity1']")).sendKeys("sea");	
        driver.findElement(By.xpath(".//*[@id='toCity1']")).sendKeys(Keys.ENTER);	
        driver.findElement(By.xpath(".//*[@id='findFlights']")).click();
        //Example of explicit wait
        WebDriverWait d = new WebDriverWait(driver, 6);
        d.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@aria-label,'Only show refundable fares for this flight']")));
        driver.findElement(By.xpath("//a[contains(@aria-label,'Only show refundable fares for this flight']))")).click();
        
        //This should click on refundable link but it is not working since site is not allowing to do so
        driver.findElement(By.xpath("//a[contains(@aria-label,'Only show refundable fares for this flight'")).click();
        
        //this program will not work as alaska airlines has restricted the site to be used by automation tools
        
        
	}

}
