package TestNGTests.abcd;

import org.testng.annotations.Test;

public class NewTest3 {
	@Test(groups = {"sanity","regression"},priority =1)
	public void login(){
		System.out.println("Login successful");
	}
@Test(groups = {"sanity"})
public void fundTransfer(){
	System.out.println("Fund transfer successful");
}
@Test(groups = {"sanity"},priority =2)
public void search(){
	System.out.println("Search successful");
}
@Test(groups = {"regression"})
public void advancedSearch(){
	System.out.println("Advanced Search successful");
}
@Test(groups = {"regression"})
public void prepaidRecharge(){
	System.out.println("Prepaid Recharge successful");
}
@Test(groups = {"regression"})
public void billPayment(){
	System.out.println("Fund transfer successful");
}
@Test(groups = {"sanity","regression"},priority =10)
public void logout(){
	System.out.println("Logout successful");
}
}
