package net.Pages;

import org.openqa.selenium.By;

import net.Utils.UserData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.yopmail.com")
public class EmailPage extends PageObject {
	
	private static String subjectLine = "IMDb User Registration";
	private static String confLink ="https://www.imdb.com/registration/confirmation";
	WebElementFacade loginInputBox;
	
	@FindBy(xpath="//form//a[@id='lrefr']")
	WebElementFacade checkEmailsButton;
	
	
	
	
	@FindBy(xpath="//span[contains(text(),'IMDb User Registration')]")
	WebElementFacade emailSubject;
	
	@FindBy(partialLinkText="https://www.imdb.com/registration/confirmation")
	WebElementFacade confirmationLink;
	
	public void loginwithMailID() {
		
		UserData userData = Serenity.sessionVariableCalled("user");
		
		loginInputBox.type(userData.getEmail());
		
		checkEmailsButton.click();
		
	}

	public boolean checkVerificationEmail()
	{
		return emailSubject.isPresent();
	}
	
	public void clickVerificationLink()
	{
		if(emailSubject.isPresent())
		{
			emailSubject.click();
			
			confirmationLink.click();
			
		}
	}
	
	
}
