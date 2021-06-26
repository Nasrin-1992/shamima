package pageFectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	WebDriver dr;
	public HomePage_PF(WebDriver dr) {
	this.dr=dr;
	PageFactory.initElements(dr, this);
	}
	
@FindBy(id = "logout")
WebElement btn_logout;

public void ckeckLogOUtIsDisplayed() {
	btn_logout.isDisplayed();
}





}
