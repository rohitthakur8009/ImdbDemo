package net.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.Utils.UserData;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.imdb.com")
public class HomePage extends PageObject {

	@FindBy(xpath="//ul[@id='consumer_main_nav']/li[@id='navTitleMenu']")
    WebElementFacade mainMenuTab;
	
	@FindBy(xpath="//a[@id='nblogin']")
    WebElementFacade otherSignInLink;
	
	@FindBy(xpath="//a[@id='nbusername']")
    WebElementFacade loginUser;
	
	
	public void clickLinkFromMainMenu(String subMenuLink)
	{
		Actions action=new Actions(getDriver());
		action.moveToElement(mainMenuTab).build().perform();
		
		WebElementFacade subCat=find(By.linkText(subMenuLink));
		
		System.out.println(subCat.getText());
		
		evaluateJavascript("arguments[0].click();", subCat);
		/*
		waitForCondition()
		.withTimeout(10, TimeUnit.SECONDS)
		.pollingEvery(5000, TimeUnit.MILLISECONDS)
		.until(ExpectedConditions.visibilityOf(subCat));
		action.moveToElement(subCat).click().build().perform();
	*/
	}
		
	public void clickOtherSignInLink()
	{
		otherSignInLink.click();
	}

	public boolean verifyUserLoginDetails() {
		UserData sessionData = Serenity.sessionVariableCalled("user"); 
		
		if(!loginUser.isCurrentlyVisible())
			 return false;
		 else
			 if(!(loginUser.getText().equals(sessionData.getUserName())))
				 return false;
	return true;
	}

	public void clickLogOutLink() {
		Actions action=new Actions(getDriver());
		action.moveToElement(loginUser).build().perform();
		
		evaluateJavascript("arguments[0].click();", find(By.linkText("Log Out")));
		
		
	}
	
}
