package udemy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class remotegrid {

	public static void main(String[] args) throws MalformedURLException {

			DesiredCapabilities dc =new DesiredCapabilities();
			//It takes browser name in small letters only
			dc.setBrowserName("firefox");
			dc.setPlatform(Platform.WINDOWS);
			
			//Webdriver driver =new FirefoxDriver();
			
			WebDriver driver =new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
			
			//after this the usual code will continue
	}
	
	

}
