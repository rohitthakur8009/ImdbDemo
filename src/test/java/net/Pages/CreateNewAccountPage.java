package net.Pages;

import net.Utils.UserData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreateNewAccountPage extends PageObject {

	@FindBy(xpath="//input[@id='ap_customer_name']")
	WebElementFacade nameInputBox;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElementFacade emailInputBox;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElementFacade passInputBox;
	
	@FindBy(xpath="//input[@id='ap_password_check']")
	WebElementFacade reEnterPassInputBox;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElementFacade createAccountBtn;
	
	UserData userData;
	
	public void submit_Registration_Form()
	{
		userData = new UserData();
		userData = userData.generateUserData();
		
		nameInputBox.type(userData.getUserName());
		
		emailInputBox.type(userData.getEmail());
		
		passInputBox.type(userData.getPassword());
		
		reEnterPassInputBox.type(userData.getPassword());
		
		createAccountBtn.click();
		Serenity.setSessionVariable("user").to(userData);
	}

	public void submit_Registration_Form(UserData userData2) {
		nameInputBox.type(userData.getUserName());
		
		emailInputBox.type(userData.getEmail());
		
		passInputBox.type(userData.getPassword());
		
		reEnterPassInputBox.type(userData.getPassword());
		
		createAccountBtn.click();
		Serenity.setSessionVariable("user").to(userData);
		
	}
	
	 
	
}
