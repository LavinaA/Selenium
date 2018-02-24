package stepdefin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AttitudeTest {
	
	@Given("^I work in ([^\"]*)$")
	public void ln(String str){
		
		if(str.equals("Latenights")){
			
			System.out.println("Latenight automation");
		}
		if(str.equals("Mornings")){
			System.out.println("Morning automation");
		}
	}
	
	@When("^I meet ([^\"]*)$")
	public void Imeet(String str){
		if(str.equals("watchmen")){
			System.out.println("I meet watchmen automation");
		}
		if(str.equals("NewspaperBoy")){
			System.out.println("I meet newspaperboy automation");
		}
			
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
