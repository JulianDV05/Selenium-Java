package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginDisneyTest {
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.disneyplus.com/es-419/login");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void loginTest() {
		WebElement inputEmail = driver.findElement(By.id("email"));
		WebElement submit = driver.findElement(By.name("dssLoginSubmit"));
		inputEmail.sendKeys("sd1@tvo.com.co");
		submit.click();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		WebElement inputPassword = driver.findElement(By.cssSelector("input[id='password']"));
		inputPassword.sendKeys("sano1010");
		submit.click();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		WebElement profile4 = driver.findElement(By.cssSelector("div[class='sc-ipZHIp sc-fOICqy xHkmD profile-avatar']"));
		profile4.click();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}

}
