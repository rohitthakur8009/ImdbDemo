package net.Pages;

import java.util.concurrent.TimeUnit;

import org.mockito.internal.matchers.Find;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TopTvChartsPage extends PageObject {

	WebElementFacade tvShowLink;
	
	public void clickTvShow(String link)
	{
	
		
		tvShowLink = find(By.linkText(link));
		
		evaluateJavascript("arguments[0].scrollIntoView(true);arguments[0].click();", tvShowLink);
		

	}
	
}
