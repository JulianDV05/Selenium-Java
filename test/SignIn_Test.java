package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import page.Base;
import page.SignInPage;

public class SignIn_Test {
	
	private String mail = "sd1@tvo.com.co";
	private String pass = "sano1010";
	
	private WebDriver driver;
	SignInPage signInPage;
	
	@Before
	public void setUp() throws Exception {
		signInPage = new SignInPage(driver);
		driver = signInPage.edgeDriverConnection();
		signInPage.visit("https://www.disneyplus.com/es-419/login");
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void signInPage() throws InterruptedException {
		assertTrue("Input email is not present", signInPage.inputEmailIsPresent());
		signInPage.sendTextEmail(mail);
		signInPage.clickSubmitButton();
		Thread.sleep(5000);
		assertTrue("Input password is not present", signInPage.inputPasswordIsPresent());
		signInPage.sendTextPassword(pass);
		signInPage.clickSubmitButton();
		signInPage.wait(5);
			
		assertTrue("nav is present", signInPage.navIsPresent());
	}
}
