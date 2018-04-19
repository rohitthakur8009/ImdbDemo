package net;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

	@RunWith(CucumberWithSerenity.class)
	@CucumberOptions(features="src/test/resources/feature/Question1/Open_Breaking_Bad_Details.feature")
	public class OpenBreakingBadDetailsRunner  {
		
		  @Managed
		    WebDriver driver;

	}
