package step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageFectory.HomePage_PF;
import pageFectory.LOginPage_PF;
import pages.LoginPage;

public class LoginDemoStep_PF {
	WebDriver dr;
	LOginPage_PF login;
	HomePage_PF hp;
	
	@Given("^browser is open$")
	public void browser_is_open() throws Throwable {
		System.out.println("inside step browser open");
        System.out.println("im run with loginDEmoSteps_PF class");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shamima Nasrin\\eclipse-workspace\\Cucumber2\\src\\test\\resources\\driver\\chromedriver.exe");
		dr= new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		Thread.sleep(4000);
		//driver.manage().window().maximize();
	}

	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {

		dr.get("https://www.facebook.com/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password){
		 login = new LOginPage_PF(dr);
		
		login.enterUserName(username);
		login.enterPassword(password);

		//dr.findElement(By.id("email")).sendKeys(username);

		//dr.findElement(By.id("pass")).sendKeys(password);

	}

	@When("^clicks on login$")
	public void clicks_on_login() throws Throwable {
		login.clickOnLogin();;
		//dr.findElement(By.name("login")).click(); 
	}

	@Then("^user is navigated to the home page$")
	public void user_is_navigated_to_the_home_page() throws Throwable {
		////dr.findElement(By.id(""));
		hp.ckeckLogOUtIsDisplayed();
		
	}
}
