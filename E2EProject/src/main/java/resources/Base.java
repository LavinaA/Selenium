package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public WebDriver driver;	
	public Properties prop;
	//public File src;
	
	
	//Properties class pules the data from properties file and the knowledge that where the file
	//is present is given by Fileinputstrean and to link both we have load method
	public WebDriver initializeDriver() throws IOException{
	
	prop=new Properties();
	FileInputStream fis=new FileInputStream("//home//ravi//projects//Selenium//E2EProject//src//main//java//resources//data.properties");
	
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("Chrome")){
		driver=new ChromeDriver();
	}
	else if(browserName.equals("Firefox")){

		driver=new FirefoxDriver();
	}
	else if(browserName.equals("IE"))
	{
		driver=new InternetExplorerDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
}
	public void getScreenshots(String result) throws IOException{
		//WebDriver driver =new FirefoxDriver();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("home//ravi//desktop//"+result+"screens.png"));
	}

}
