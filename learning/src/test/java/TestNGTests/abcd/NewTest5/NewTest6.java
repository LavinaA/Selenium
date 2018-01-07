package TestNGTests.abcd.NewTest5;

import org.testng.annotations.Test;

public class NewTest6 {
	@Test
	  public void testCase4() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test Case 4 is successful : Thread id is " +id);
	  }
	  @Test
	  public void testCase5() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test Case 5 is successful : Thread id is " +id);
	  }
	  @Test
	  public void testCase6() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test Case 6  is successful : Thread id is  " +id);
	  }

}
