package net.Pages;

import java.beans.Visibility;

import org.openqa.selenium.support.ui.ExpectedConditions;

import net.Utils.UserData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.findby.By;

public class SignInPage extends PageObject {

	@FindBy(xpath="//a[contains(text(),'Create a New Account')]")
    WebElementFacade loginInput;
	
	@FindBy(xpath="//a[contains(text(),'Create a New Account')]")
    WebElementFacade passwordInput;
	
	@FindBy(xpath="//a[contains(text(),'Create a New Account')]")
    WebElementFacade submitBtn;
	
	
	public void login_with_SessionUser()
	{	
		if(loginInput.isCurrentlyVisible() && passwordInput.isCurrentlyVisible())
		{ 
			UserData sessionData = Serenity.sessionVariableCalled("user"); 
			loginInput.type(sessionData.getEmail());
			loginInput.type(sessionData.getPassword());
			submitBtn.click();
			return;
		}
		else
			waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Sign in')]")));
		login_with_SessionUser();
	}
	
}
