package udemy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exercise {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.in/");
		//To find the total number of links on webpage,we need to search for anchor tagname because all links are defined with anchor tags in HTML
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//To find the number of links present on footer section
		WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		//To find number of eleemnts of 2nd column of footer section
		WebElement foo2= driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]"));
		System.out.println(foo2.findElements(By.tagName("a")).size());
		
		String beforeClicking = null;
		//Print all the names of the links present on 2nd colum of footer
		for(int i =0;i<(foo2.findElements(By.tagName("a")).size());i++){

			//Other Scenario is to click on eBay Policies given condiation that we dont know where the link is located on the webpage and after it is clicked verify with title and text present on the page	
			//System.out.println(foo2.findElements(By.tagName("a")).get(i).getText());
			if(foo2.findElements(By.tagName("a")).get(i).getText().contains("eBay Policies")){
				//System.out.println("Before Clicking the link EBay Policies");
				beforeClicking =driver.getTitle();
				foo2.findElements(By.tagName("a")).get(i).click();	
				break;
			}
		}
		//System.out.println("After Clicking the link Ebay Policies");
		String afterClicking = driver.getTitle();
		if(beforeClicking!=afterClicking)
		{
			
			System.out.println("PASS");
		}
		else{
			System.out.println("FAIL");
		}
	}

}
