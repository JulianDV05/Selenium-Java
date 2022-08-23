package tests;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class NetflixTest {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.netflix.com/co/login");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void loginTest() {
		WebElement inputEmail = driver.findElement(By.name("userLoginId"));
		WebElement inputPassword = driver.findElement(By.name("password"));
		inputEmail.sendKeys("maryanvalencia3096@gmail.com");
		inputPassword.sendKeys("3134085590");
		//WebElement submit = driver.findElement(By.class("btn login-button btn-submit btn-small"));
	}

}
