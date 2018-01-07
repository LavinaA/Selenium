package TestNGTests.abcd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest1 {
	@BeforeClass
	public void login(){
		System.out.println("Login successful");
	}
	@AfterClass
	public void logout(){
		System.out.println("Logout successful");
	}

	@Test
	public void addproduct(){
		System.out.println("Product deleted succesffully");
	}

	@Test
	public void addcurrency(){
		System.out.println("Currency deleted succesffully");
	}

	@Test
	public void addmaterial(){
		System.out.println("Material deleted succesffully");
	}

}
