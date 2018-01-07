package TestNGTests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample1 {
	@Test (priority = 1)
	public void abcd(){
		Assert.assertEquals("Gmail","Gmail");
	}
	@Test(priority = 2)
	public void xyz() {
		Assert.assertEquals("Google", "Google");
	}
	@Test (priority =3,enabled = false)
	public void pqr(){
		Assert.assertEquals("Yahoo", "Yahoo");
	}
}
