package steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BlueBackgroundPage;
import page.WhiteBackgroundPage;
import util.BrowserFactory;

public class WhiteBackgroundDef {
	WebDriver driver;
	WhiteBackgroundPage whiteBackgroundPage;

	@Before
	public void startBrowser() {
		driver = BrowserFactory.init();
	}
	
	
	

		@Given("^User is on the Techfiostest page$")
		public void user_is_on_the_techfiostest_page() {
			driver.get("https://techfios.com/test/101/");
			whiteBackgroundPage =  PageFactory.initElements(driver, WhiteBackgroundPage.class);
			
		}
		 
		@When("^I click on the WhiteButton$")
		public void when_I_click_on_the_skyBlueButton() {
			whiteBackgroundPage.WhiteBackgroundButton();
			
		}
		@Then ("^The background color should change to White$")
		public void the_background_color_will_change_to_sky_blue() throws InterruptedException {
			whiteBackgroundPage.validate_white_background();
			
			
		}

		@After
		public void tearDown() {
			driver.close();
			driver.quit();
		}

}
