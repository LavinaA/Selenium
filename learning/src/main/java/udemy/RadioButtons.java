package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
	//	driver.findElement(By.xpath("//input[@value='Milk']")).click();
		
		//want to know how many radio buttons are present and based on that want to click on first index
		//we dont have value attribute values as well in html.This is handling dynamic dropdowns
		
		 int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
		 System.out.println(count);
		 
		 for(int i =0;i<count;i++){

			 /*driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();*/
			 //click only if radio button is cheese
			 
			 String text =driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			  System.out.println(text);

			 if(text.equals("Cheese"))
			 {
				 driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			 }
		 }

	}

}
