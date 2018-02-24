package jdbConnection.DatabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mysqlConnection {

	public static void main(String[] args) throws SQLException {
		
		String host ="localhost";
		String port ="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://" +host +":" +port + "/qadbt", "root","password");
		Statement s=con.createStatement();
		
		ResultSet rs =s.executeQuery("select * from credentials where scenario ='zerobalanced'");
		
		while (rs.next()){
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(rs.getString("username"));
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(rs.getString("password"));
		}
	}

}
