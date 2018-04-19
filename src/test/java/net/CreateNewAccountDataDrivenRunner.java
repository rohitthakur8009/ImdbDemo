package net;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.Utils.UserData;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.userSteps.NewUserSteps;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value="src/test/resources/data/logindata.csv")
public class CreateNewAccountDataDrivenRunner {

	UserData userData;
	
	public void setUserData(String userName, String email, String password)
	{
		userData = new UserData();
		
		userData.setUserName(userName);
		userData.setPassword(password);
		userData.setEmail(email);
	}
	
	@Steps
	NewUserSteps newUserSteps;
	
	@Test
	public void RegisterUser()
	{
		newUserSteps.open_home_page();
		
		newUserSteps.goto_SignIn_Page();
		
		newUserSteps.goto_Create_New_Account();
		
		newUserSteps.complete_RegistrationProcess(userData);
		
		newUserSteps.verify_RegistrationComplete();
		
		newUserSteps.signOut();
		
		newUserSteps.verify_UserLoggedOut();
		
	}

}
