package learning;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver() ;
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElement(By.id("usernameId")).sendKeys("lavinaagr");
		driver.findElement(By.className("loginPassword")).sendKeys("luo792");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the captcha");
		String captcha = scan.nextLine();
		
		driver.findElement(By.className("loginCaptcha")).sendKeys(captcha);
		driver.findElement(By.id("loginbutton")).click();
		
		String URL = driver.getCurrentUrl();
		
		if (URL.equals("https://www.irctc.co.in/eticketing/home")) {
			System.out.println("Login successfull");
		}else {
			System.out.println("Login failed");
		}
		
		
		
	}

}
