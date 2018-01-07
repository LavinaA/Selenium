package TestNGTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingDependsOnMethod {
	@Test
	public void login(){
		System.out.println("Login successful");
	}
	@Test (dependsOnMethods = {"advancedSearch"})
	public void logout(){
		System.out.println("Logout successful");
	}
	@Test (dependsOnMethods = {"login"})
	public void search() {
		System.out.println("Search successful");
	}
	@Test  (dependsOnMethods = {"search"},alwaysRun = true)
	public void advancedSearch(){
		System.out.println("Advanced Search successful");
	}

}
