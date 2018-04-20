package net.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SignInOptionsPage extends PageObject {

	@FindBy(xpath="//a[contains(text(),'Create a New Account')]")
    WebElementFacade createAccount;

	@FindBy(xpath="//span[contains(text(),'Sign in with IMDb')]")
    WebElementFacade signInButton;

	

	public void click_CreateAccountLink()
	{
	    if(createAccount.isCurrentlyVisible())
		createAccount.click();
	    else
	    {
	    	try {
				wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	createAccount.click();
	    }
	}


	public void goto_LoginPage() {
		
		 if(signInButton.isCurrentlyVisible())
			 signInButton.click();
			    else
			    {
			    	try {
						wait(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	signInButton.click();
			    }
	}
	
	
}
