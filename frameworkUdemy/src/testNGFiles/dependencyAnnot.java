package testNGFiles;

import org.testng.annotations.Test;

public class dependencyAnnot {
	
	@Test
	public void OpeningBrowser()
	{
		//This opens the Browser
		System.out.println("opening browser");

	}
	/*This method will execute only if OpeningBrowser method executes successfully.If OpeningBrowser
	fails and still you want FlightBooking method to execute then use alwaysRun=true
*/	
	@Test(dependsOnMethods={"OpeningBrowser"},alwaysRun=true)
	public void FlightBooking()
	{
		System.out.println("Flight booking");
	}
	//When you wantt o skip a particular method from execution
	@Test
	public void Payment()
	{
		//This opens the Browser
		System.out.println("exceuting payment method");

	}
	/*timeOut is used for controlling performance issues.If script takes more than 5 sec to run,then TimeRalted 
	will fail*/
	@Test(timeOut=5000)
	public void TimeRelated()
	{
		//This opens the Browser
		System.out.println("exceuting timerelated method");

	}

}
