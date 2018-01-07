package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrossBrowserTest {

	public static void main(String[] args) {
		//WebDriver driver = new FirefoxDriver();
		System.out.println("Step 1");
		System.setProperty("webdriver.chrome.driver","//home//ravi//softwares//chromedriver.exe");
		System.out.println("Step 2");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Step 3");
		
		/*System.setProperty("webdriver.ie.driver","/home/ravi/Desktop/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();*/
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=FcSbWcyrBMiGoAOhjbSIBA");
		System.out.println("Step 4");
		
		String PageTitle = driver.getTitle();
		if(PageTitle.equals("Google"))
		{
			System.out.println("Google application Passed");
		}
		else {
			System.out.println("Google application Failed");
		}
			
	}

}
