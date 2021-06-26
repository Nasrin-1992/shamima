package pageFectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOginPage_PF {
	
	WebDriver dr;
	public LOginPage_PF(WebDriver dr) {
	this.dr=dr;
	PageFactory.initElements(dr, this);
	}
	
@FindBy(id = "email")
WebElement txt_username;

@FindBy(id="passContainer")
WebElement txt_password;

@FindBy(name = "login")
WebElement btn_login;


public void enterUserName(String username) {
	txt_username.sendKeys("username");
}

public void enterPassword(String password) {
	txt_password.sendKeys(password);
}

public void clickOnLogin() {
	btn_login.click();
}







}
