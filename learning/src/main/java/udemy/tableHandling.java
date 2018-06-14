package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tableHandling {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/19195/ind-vs-sl-3rd-odi-sri-lanka-tour-of-india-2017");
		WebElement table =driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	 //  int rowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	   
	   //to tranverse from parent to third child syntax is like this div:nth-child(3)
	   //Note there is a space before div tag
	   int count =table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	   int sum=0;
	   for(int i=0;i<count-2;i++){
		String value =table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int valueInteger=Integer.parseInt(value) ;
		sum=sum+valueInteger;
		
	   }
	   //We need to grab extras and total value.They have different CSS Selector
	   //How to go from extras to runs column.It is like travelling from one sibling to another sibling.
	   //Grab the xpath of the "Extras" text and traverse to another sibling from that sibling
	   //This is a tricky part remember
	   
	 String extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	 int extrasInteger=Integer.parseInt(extras);
	 int totalSumValue=sum+extrasInteger;
	 
	 
	 //Traverse from one sibling to other sibling
	 String actualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();  
	 int actualTotalInteger = Integer.parseInt(actualTotal);
	 
	 if(totalSumValue==actualTotalInteger){
		 System.out.println("Count matches");
	 }else
	 {
		 System.out.println("Count fails");
	 }
	 
	}

}
