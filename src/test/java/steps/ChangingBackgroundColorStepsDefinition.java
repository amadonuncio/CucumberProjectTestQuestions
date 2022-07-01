package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Test109Page;
import pages.TestBase;

public class ChangingBackgroundColorStepsDefinition extends TestBase {
	Test109Page test109;

	@Before
	public void beforeRun() {
		init();
		test109 = PageFactory.initElements(driver, Test109Page.class);
	}

	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists()  {
	   test109.validateSetSkyBlueBackgroundButtonExists();
	}

	@When("^User clicks on the Set SkyBlue Background button$")
	public void user_clicks_on_the_Set_SkyBlue_Background_button() {
		test109.clickSetSkyBlueBackgroundButton();
	}
	

	@Then("^The background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		test109.validateBackgroundColorIsSkyBlue();
	}
	
	@Given("^Set White Background button exists$")
	public void set_White_Background_button_exists() {
	  test109.validateSetWhiteBackgroundButtonExists();
	}
	
	@When("^User clicks on the Set White Background button$")
	public void user_clicks_on_the_Set_White_Background_button() {
		test109.clickSetWhiteBackgroundButton();
	}

	@Then("^The background color will change to white$")
	public void the_background_color_will_change_to_white() {
		test109.validateBackgroundColorIsWhite();
	}

	@After
	public void afterRun() {
		tearDown();
	}

}
