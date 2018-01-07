package udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetAlert;

public class calendar {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		//Get the date August 23
		//The idea is to first get number 23 and then month
		//Grab the common attribute,put into list and iterate
		//Get the month.The logic is to click on next till you find the desired month from current month

		//Tricky part is getting the element locator here.check carefully
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("August"))
		{
			//Click the next button till you get August month
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();

		}

		List<WebElement> dates=driver.findElements(By.className("day"));
		int count =driver.findElements(By.className("day")).size();
		
		for(int i =0;i<count;i++){
			String text =driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("23")){
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		
		
		
		
		
	}

}
