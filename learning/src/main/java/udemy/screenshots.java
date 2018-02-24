package udemy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshots {

	public static void main(String[] args) throws IOException {

	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.co.in");
	File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils to copy file from source object to local machine
	FileUtils.copyFile(src, new File("/home/ravi/Desktop/screenhot.png"));
	
	/*//To kill i.e close any application
	WindowsUtils.killByName("IntegerInput.xls");*/
		
		
	}

}
