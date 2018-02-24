package stepdef2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AtitudeTest2 {

	@Given("^we work in \"([^\"]*)\"$")
	public void we_work_in(String ss) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println(ss);
	   	}
	
	@When("^we meet \"([^\"]*)\">$")
	public void we_meet_(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    	System.out.println(arg1);
	
	}
	@Then("^I ([^\"]*) him$")
	public void gre(String str){
		if(str.equals("Greeted")){
			System.out.println("I greeted him automation");
		}
		if(str.equals("skipGreeting")){
			System.out.println("I skipped greeting him");
		}
}
}
