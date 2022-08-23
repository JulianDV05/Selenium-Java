/**
 * 
 */
package tests;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author jairo.romero
 *
 */
public class FirstTest {
	private WebDriver driver;

	/**
	 * @param args
	 */
	@Before
	public void setUp() {
		// TODO Auto-generated method stub
		DesiredCapabilities caps = new DesiredCapabilities();
		System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void firstTest() {
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Hola Mundo");
		searchBox.submit();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		assertEquals("Hola Mundo - Buscar con Google", driver.getTitle());
	}
	
	@After
	public void tearDown() {
		driver.close();
	}

}
