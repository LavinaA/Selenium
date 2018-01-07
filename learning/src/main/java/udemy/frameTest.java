package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		//First switch to frame abnd then click on any elemnent required
		
		//Switch to frame by index .It is not recommended
		//driver.switchTo().frame(0);
		
		//To find how many frames are present
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//Switch to frame by Webelement
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		//driver.findElement(By.id("draggable")).click();
		
		//Drag and drop
		//Dont forget to build and perform on action class
		Actions a =new Actions(driver);
		WebElement source =driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement target=driver.findElement(By.xpath(".//*[@id='droppable']"));
		a.dragAndDrop(source,target).build().perform();
		
		//To perform any action outside of the frame
		driver.switchTo().defaultContent();
		

	}

}
