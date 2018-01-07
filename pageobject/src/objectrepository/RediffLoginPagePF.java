package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {
	
	
	WebDriver driver;
	/*By username=By.xpath(".//*[@id='login1']");
	By password=By.xpath(".//*[@id='password']");
	By proceed =By.xpath("//input[@value='Go']");
	By home=By.linkText("Home");*/
	
	public RediffLoginPagePF (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=".//*[@id='login1']")
	WebElement username;
	
	@FindBy(xpath=".//*[@id='password']")
	WebElement password;
	
	@FindBy(xpath=".//input[@value='Go']")
	WebElement proceed;
	
	@FindBy(linkText="Home")
	WebElement home;
	
	public WebElement EmailId(){
		return username;
	}
	
	public WebElement password(){
		return password;
	}
	
	public WebElement proceed(){
		return proceed;
	}
	
	public WebElement home(){
		return home;
	}
	
	
}
