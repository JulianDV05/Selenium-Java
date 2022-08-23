package pagenet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInNetPage extends Base {
	
	public By inputEmail = By.name("userLoginId");
	public By inputPassword = By.name("password");
	public By submit = By.cssSelector("button[class='btn login-button btn-submit btn-small']");
	public By h1 = By.cssSelector("h1[class='profile-gate-label']");

	public SignInNetPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void signInUser() {
		
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
	
	public boolean h1IsPresent() {
		return isPresent(h1);
	}
	

}
