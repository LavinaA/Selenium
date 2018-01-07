package testNGFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annot2 {

	
	@BeforeSuite
	public void installsoftware()
	{
		System.out.println("I am the First");
	}
	
	@Test(groups={"Priority1"})
	public void software()
	{
		System.out.println("I am software");
	}
	@Test(groups={"Priority2"})
	public void hardware()
	{
		System.out.println("I am the hardware");
	}
	@AfterSuite
	public void deinstallsoftware()
	{
		System.out.println("I am the Last");
	}
	
}