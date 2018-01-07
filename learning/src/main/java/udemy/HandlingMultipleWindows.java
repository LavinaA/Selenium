package udemy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F");
		 driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		 System.out.println(driver.getTitle());
		 
		 //switch to child window
		 Set<String> ids =driver.getWindowHandles();
		 
		 
		 java.util.Iterator<String> it=ids.iterator();
		 String parentId= it.next();
		 String childId =it.next();
		
		 System.out.println("Before switching to child window i.e on parent window");
		 driver.switchTo().window(parentId);
		 System.out.println(driver.getTitle());
		 
		 driver.switchTo().window(childId);
		 System.out.println("after switching to child window");
		 System.out.println(driver.getTitle());
		 
		 
	}

}
