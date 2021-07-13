package page;




import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class BlueBackgroundPage {
	
		 WebDriver driver;
		
		 public BlueBackgroundPage (WebDriver driver) {
				this.driver = driver;
			}
		 
		@FindBy(how = How.XPATH, using = "//button[text()='Set SkyBlue Background']")WebElement SKYBLUEBUTTON_ELEMENT;
		@FindBy(how = How.XPATH, using = "//body")WebElement SKYBLUEBUTTON_BACKGRD_ELEMENT;
		
		 
		 
		 public void skyblueButton() {
			 SKYBLUEBUTTON_ELEMENT.click(); 
			 
		 }
		 
		public void validate_skyblue_background() throws InterruptedException {
			
		
		 String blueColor = SKYBLUEBUTTON_BACKGRD_ELEMENT.getCssValue("background-color");
		
		System.out.println(blueColor);
	String  expected ="rgba(135, 206, 235, 1)";
	Assert.assertEquals("not Blue", expected,blueColor); 
		
		} 
		 
		 
		 
		 
		 
		 
		 

}
