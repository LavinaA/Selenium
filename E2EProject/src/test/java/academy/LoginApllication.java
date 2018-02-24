package academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class LoginApllication extends Base {

	public WebDriver driver;

	@BeforeTest
	public void initialize() throws IOException{
		driver=initializeDriver();
	}


	@Test(dataProvider="getData")

	public void basePageNavigation(String username,String pwd,String text) throws IOException{
		driver.get("http://www.qaclickacademy.com/");
		LandingPage lp=new LandingPage(driver);
		lp.Login().click();
		LoginPage lop=new LoginPage(driver);
		lop.EmailId().sendKeys(username);
		lop.password().sendKeys(pwd);
		System.out.println(text);
		lop.proceed().click();

	}
	@DataProvider
	public Object[][] getData(){

		//rows represent number of records present
		//col represents number of values passed for each test
		Object[][] data=new Object[2][3];

		data[0][0]="shailesh";
		data[0][1]="shailesh@123";
		data[0][2]="restricted user";

		data[1][0]="amit";
		data[1][1]="amit@123";
		data[1][2]="non restricted user";

		return data;
	}
	@AfterTest
	public void closeBrowser(){

		driver.close();
		driver=null;
	}

}

