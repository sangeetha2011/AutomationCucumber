package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.After;
import org.junit.Assert;
import page.BlueBackgroundPage;
import util.BrowserFactory;


public class BackgroundDef {
	WebDriver driver;
	BlueBackgroundPage background;

	//@Before
	public void startBrowser() {
		driver = BrowserFactory.init();
	}
	
	
	

		@Given("^User is on the TechfiosTest page$")
		public void user_is_on_the_techfiostest_page() {
			driver.get("https://techfios.com/test/101/");
			background =  PageFactory.initElements(driver, BlueBackgroundPage.class);
			
		}
		 
		@When("^I click on the skyBlueButton$")
		public void when_I_click_on_the_skyBlueButton() {
			background.skyblueButton();
			
		}
		@Then ("^The background color should change to sky blue$")
		public void the_background_color_will_change_to_sky_blue() throws InterruptedException {
			background.validate_skyblue_background();
			
			
		}
		//@After
		public void tearDown() {
			driver.close();
			driver.quit();
		}

}
