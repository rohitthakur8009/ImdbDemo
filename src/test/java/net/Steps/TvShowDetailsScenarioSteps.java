package net.Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.userSteps.NewUserSteps;

public class TvShowDetailsScenarioSteps {
	
	@Steps
	NewUserSteps newUser;
	
@Given("^I am on the Home Page$")
public void i_am_on_the_Home_Page()  {
	
	newUser.open_home_page();
   
}

@When("^I go to Top TV Charts by clicking '(.*)'$")
public void i_go_to_Top_TV_Charts_by_clicking_Top_Rated_TV_Shows(String link) throws Throwable {
    newUser.goto_Tv_Charts_Link(link);

}

@When("^I go to TV Show Details page by Clicking '(.*)'$")
public void i_go_to_TV_Show_Details_page_by_Clicking_Breaking_Bad(String tvShow) {
	newUser.goto_Tv_Show_Details_Link(tvShow);
  
}

@Then("^I am able to see 'Breaking Bad' details page$")
public void i_am_able_to_see_Breaking_Bad_details_page()  {
	
	newUser.verify_Tv_Details_Page();
   
}
	
	
	

}
