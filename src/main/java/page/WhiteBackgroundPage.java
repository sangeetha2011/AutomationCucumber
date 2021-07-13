package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhiteBackgroundPage {
	WebDriver driver;

	public WhiteBackgroundPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//button[text()='Set White Background']")
	WebElement WHITE_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//body")
	WebElement WHITE_BACKGROUND_ELEMENT;

	public void WhiteBackgroundButton() {
		WHITE_BUTTON_ELEMENT.click();

	}

	public void validate_white_background() throws InterruptedException {

		String whiteColor = WHITE_BACKGROUND_ELEMENT.getCssValue("background-color");

		System.out.println(whiteColor);
   String  expected ="rgba(255, 255, 255, 1)";
   Assert.assertEquals("not Blue", expected,whiteColor); 

	}

}
