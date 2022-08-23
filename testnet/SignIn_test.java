package testnet;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import page.SignInPage;
import pagenet.SignInNetPage;

public class SignIn_test {
	
	private String mail = "maryanvalencia3096@gmail.com";
	private String pass = "3134085590";
	
	private WebDriver driver;
	SignInNetPage signInNetPage;

	@Before
	public void setUp() throws Exception {
	signInNetPage = new SignInNetPage(driver);
	driver = signInNetPage.edgeDriverConnection();
	signInNetPage.visit("https://www.netflix.com/co/login");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException{
		assertTrue("Input email is not present", signInNetPage.inputEmailIsPresent());
		signInNetPage.sendTextEmail(mail);
		signInNetPage.clickSubmitButton();
		Thread.sleep(5000);
		assertTrue("Input password is not present", signInNetPage.inputPasswordIsPresent());
		signInNetPage.sendTextPassword(pass);
		signInNetPage.clickSubmitButton();
		signInNetPage.wait(5);
			
		assertTrue("h1 is present", signInNetPage.h1IsPresent());
	}

}
