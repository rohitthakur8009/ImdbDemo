package net.userSteps;

import com.thoughtworks.selenium.webdriven.commands.Close;

import junit.framework.Assert;
import net.Pages.BreakingBadDetailsPage;
import net.Pages.CreateNewAccountPage;
import net.Pages.HomePage;
import net.Pages.SignInOptionsPage;
import net.Pages.TopTvChartsPage;
import net.Utils.UserData;
import net.thucydides.core.annotations.Step;

public class NewUserSteps {

	HomePage homePage;
	TopTvChartsPage topTvChartsPage;
	BreakingBadDetailsPage breakingBadDetailsPage;
	SignInOptionsPage signInOptionsPage;
	CreateNewAccountPage createNewAccountPage;
	
	@Step
	 public void open_home_page()
	 {
		homePage.open();
	 }
	
	
	@Step
	public void goto_Tv_Show_Details_Link(String tvShow)
	{
		topTvChartsPage.clickTvShow(tvShow);
	}
	
	@Step
	public void verify_Tv_Details_Page()
	{
		
		
		//Assert.assertEquals(breakingBadDetailsPage.getTitle(),breakingBadDetailsPage.getExpectedPageTitle());
		
		Assert.assertEquals(breakingBadDetailsPage.getExpectedPageHeader(),breakingBadDetailsPage.getActualPageHeader());
		
		Assert.assertTrue("Breaking Bad Poster", breakingBadDetailsPage.checkPoster());
		
	}
	
	@Step
	public void goto_Tv_Charts_Link(String link)
	{
		homePage.clickLinkFromMainMenu(link);
	}
	
	@Step
	public void goto_SignIn_Page()
	{
		homePage.clickOtherSignInLink();
	}


	public void goto_Create_New_Account() {
		
		signInOptionsPage.click_CreateAccountLink();
	}


	public void complete_RegistrationProcess() {
		
		createNewAccountPage.submit_Registration_Form();
	}


	public void verify_RegistrationComplete() {
		Assert.assertTrue(homePage.verifyUserLoginDetails());
		
	}


	public void signOut() {
	
		homePage.clickLogOutLink();
		
	}


	public void verify_UserLoggedOut() {
		Assert.assertFalse(homePage.verifyUserLoginDetails());
	}


	public void complete_RegistrationProcess(UserData userData) {
		createNewAccountPage.submit_Registration_Form(userData);
		
	}


	public void completeEmailVerification() {
		// TODO Auto-generated method stub
		
	}
	
	
}
