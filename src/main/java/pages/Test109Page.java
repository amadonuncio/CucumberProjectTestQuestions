package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Test109Page {
	WebDriver driver;

	public Test109Page(WebDriver driver) {
		this.driver = driver;
	}

//	Element Lists
	@FindBy(how = How.CSS, using = "button[onclick= 'myFunctionSky()']")
	WebElement SET_SKYBLUE_BACKGROUND_BUTTON_ELEMENT;
	@FindBy(how = How.CSS, using = "button[onclick= 'myFunctionWhite()']")
	WebElement SET_WHITE_BACKGROUND_BUTTON_ELEMENT;
	@FindBy(how = How.CSS, using = "body[style= 'background-color: skyblue;']")
	WebElement SKYBLUE_HTML_BODY_BACKGROUND_COLOR;
	@FindBy(how = How.CSS, using = "body[style= 'background-color: white;']")
	WebElement WHITE_HTML_BODY_BACKGROUND_COLOR;

//	Methods
	public void validateSetSkyBlueBackgroundButtonExists() {

		try {
			Thread.sleep(1500);
			Assert.assertTrue("Element does not exists", SET_SKYBLUE_BACKGROUND_BUTTON_ELEMENT.isDisplayed());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void validateSetWhiteBackgroundButtonExists() {

		try {
			Thread.sleep(1500);
			Assert.assertTrue("Element does not exists", SET_WHITE_BACKGROUND_BUTTON_ELEMENT.isDisplayed());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickSetSkyBlueBackgroundButton() {
		try {
			Thread.sleep(1500);
			SET_SKYBLUE_BACKGROUND_BUTTON_ELEMENT.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickSetWhiteBackgroundButton() {
		try {
			Thread.sleep(1500);
			SET_WHITE_BACKGROUND_BUTTON_ELEMENT.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void validateBackgroundColorIsSkyBlue(){
		try {
			Thread.sleep(1500);
			Assert.assertTrue("Background color is not blue.", SKYBLUE_HTML_BODY_BACKGROUND_COLOR.isDisplayed());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void validateBackgroundColorIsWhite(){
		try {
			Thread.sleep(1500);
			Assert.assertTrue("Background color is not white.", WHITE_HTML_BODY_BACKGROUND_COLOR.isDisplayed());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
