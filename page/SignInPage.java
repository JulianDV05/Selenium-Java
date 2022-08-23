package page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends Base {
	
	public By inputEmail = By.id("email");
	public By inputPassword = By.id("password");
	public By submit = By.name("dssLoginSubmit");
	public By nav = By.cssSelector("h2[class = 'padding--bottom-6 text-color--primary']");

	public SignInPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean inputEmailIsPresent() {
		return isPresent(inputEmail);
	}
	
	public void sendTextEmail(String email) {
		type(email, inputEmail);
	}
	
	public boolean inputPasswordIsPresent() {
		return isPresent(inputPassword);
	}
	
	public void sendTextPassword(String pass) {
		type(pass, inputPassword);
	}
	
	public void clickSubmitButton() {
		click(submit);
	}
	
	public boolean navIsPresent() {
		return isPresent(nav);
	}


}
