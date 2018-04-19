package net.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SignInOptionsPage extends PageObject {

	@FindBy(linkText="Create A New Account")
    WebElementFacade createAccount;


	public void click_CreateAccountLink()
	{
	
		createAccount.click();
	}
	
	
}
