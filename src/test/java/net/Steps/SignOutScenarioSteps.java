package net.Steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.userSteps.NewUserSteps;

public class SignOutScenarioSteps {

	@Steps
	NewUserSteps newUserSteps;
	
	
	@When("^I login with Registered User$")
	public void i_Login_to_IMDB()  {
    
		newUserSteps.login_to_IMBb();
	}
	

	@When("^I Sign Out$")
	public void i_Sign_Out_With_IMDB()  {
    
		newUserSteps.signOut();
	}
	
	@Then("^I am Signed Out Successfully$")
	public void i_am_Sign_Out_Successfully() {
	    newUserSteps.verify_UserLoggedOut();
	}
}
