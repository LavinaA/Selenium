package udemy;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class httpcertificates {
	
	//This program will not work.Written just for my reference.

	public static void main(String[] args) {
		
		//DesiredCapability is general chrome profile
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		
		
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
		ChromeOptions c =new ChromeOptions();
		
		//Chromeoptions is used for your local browser settings
		
		//c.merge(ch);//This method must be removed from the current code but this is how we merge both the objects
		WebDriver driver = new FirefoxDriver();
		
		
		
		
		
	}

}
