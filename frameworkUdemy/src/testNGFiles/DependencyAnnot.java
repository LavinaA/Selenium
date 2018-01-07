package testNGFiles;

import org.testng.annotations.Test;

public class DependencyAnnot {
	
	
	@Test
	public void OpeningBrowser()
	{
		//This opens the Browser
		System.out.println("Executing Test 2");

	}
	@Test(dependsOnMethods = {"OpeningBrowser"})
	public void FlightBooking()
	{
		System.out.println("Executing Test 1");
	}

}
