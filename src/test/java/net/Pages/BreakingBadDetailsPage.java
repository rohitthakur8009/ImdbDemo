package net.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BreakingBadDetailsPage extends PageObject {

	private static String PAGE_TITLE = "Breaking Bad (TV Series 2008-2013) - IMDb";
	private static String PAGE_HEADER = "Breaking Bad";
	
	@FindBy(xpath = "//h1")
	private WebElementFacade pageHeader;
	
	@FindBy(xpath = "//img[@title='Breaking Bad Poster']")
	private WebElementFacade pagePoster;
	
    public String getExpectedPageTitle()
    {
    	return PAGE_TITLE;
    }
    
    public String getExpectedPageHeader()
    {
    	return PAGE_HEADER.trim();
    }
    
    public String getActualPageHeader()
    {
    	return pageHeader.getText().trim();
    }
    
    
    public boolean checkPoster()
    {
    	
    	
    	return pagePoster.isCurrentlyVisible();
    			
    			
    }

}
