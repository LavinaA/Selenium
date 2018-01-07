package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class framesLogic {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/recaptcha/api2/demo");
		
		/*//since the captcha are dynamic so the frames id keep on changing and frames keep on changing
		//So we need to go into each frame and check whether object is present or not
		//If it is present hen click on that frame
	This xpath -*[@id='recaptcha-anchor']/div[5]' is for captcha button*/
		//
		int number =findframeNumber(driver,By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		
		//driver.switchTo().defaultContent();
		
		int number1=findframeNumber(driver,By.xpath(".//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();
		
		}
	
	
	
	
	public static int findframeNumber(WebDriver driver,By by)
	{
		int i;
		int framecount=driver.findElements(By.tagName("iframe")).size();

		for(i=0;i<framecount;i++){
			driver.switchTo().frame(i);

			//The below size script to know whether object is present on page or not,never use isDispalyed for this as it tells whether object is in 
			// visible or invisible mode
			//Important point -Always remember if you have to find whether any object is present on page or not then use Size method
			//If size is greater than 0,then object is present


			int count=driver.findElements(by).size();

			if(count==1){
				break;
			}
			else{
				System.out.println("Continue looping");
			}
		}
		driver.switchTo().defaultContent();
		return i;
	}

	

}
