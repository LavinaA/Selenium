package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase8 {
	static int i ;
	static String username,password,iteration;
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		for (i=1;i<=2;i++){
		if (i==1){
			username = "admin";
			password = "admin@123";
			iteration = "Iteration 1";
		}
		else if (i==2){
			username = "admina";
			password = "admin@123a";
			iteration = "Iteration 2";
		}
		
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("tdb1")).click();
		
		String URL = driver.getCurrentUrl();

		if (URL.contains("http://www.gcrit.com/build3/admin/index.php")){
			System.out.println(iteration + "Input Data " +username + " ," +password + " Admin Login Successful -Passed");
			driver.findElement(By.linkText("Logoff")).click();
			Thread.sleep(30000);
		}
		else  if (!URL.contains("http://www.gcrit.com/build3/admin/index.php")){
			String Error_Message = driver.findElement(By.className("messageStackError")).getText();	
			if(Error_Message.contains("Invalid administrator login attempt")){
				System.out.println(iteration + "Input Data " +username + " ," +password + " Handling Invalid Inputs -Passed");
			}
			else {
				System.out.println(iteration + "Failed");
			}
		}
		}
	
		driver.close();
	}
}


