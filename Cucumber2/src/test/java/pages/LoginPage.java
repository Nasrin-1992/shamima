package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
WebDriver dr;
public LoginPage(WebDriver dr) {
this.dr=dr;	
}

 By txt_username=By.id("email");
 By txt_password=By.id("pass");
 By btn_login=By.name("login");
 By btn_logout=By.id("");
	
	public void enterUsername(String username) {
		dr.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		dr.findElement(txt_password).sendKeys(password);
	}
	
	public void click() {
		dr.findElement(btn_login).click();
	}
	public void ckecklogOutIsDisplayed() {
		dr.findElement(btn_login).isDisplayed();
	}
	public void loginValidUser(String username, String password) {
		dr.findElement(txt_username).sendKeys(username);
		dr.findElement(txt_password).sendKeys(password);
		dr.findElement(btn_login).click();
		
	}
	
	
	
	
	
	
	
	
	
	
}
