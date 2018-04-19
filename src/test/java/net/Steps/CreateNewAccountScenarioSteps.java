package net.Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;
import net.userSteps.NewUserSteps;


public class CreateNewAccountScenarioSteps {

	@Steps
	NewUserSteps newUserSteps;
	
	@When("^I go to User Sign In Screen$")
	public void i_go_to_User_Sign_In_Screen() {
	 
		newUserSteps.goto_SignIn_Page();
	}
	

	@When("^I select Create a New Account option$")
	public void i_select_Create_a_New_Account_option()   {
    
		newUserSteps.goto_Create_New_Account();
	}
	
	@When("^I Submit the Registration Information$")
	public void i_Submit_the_Registration_Information()  {
	    newUserSteps.complete_RegistrationProcess();
	}

	@Then("^I am able to see Successfully Register$")
	public void i_am_able_to_see_Successfully_Register() {
	    newUserSteps.verify_RegistrationComplete();
	}
	

	
}
