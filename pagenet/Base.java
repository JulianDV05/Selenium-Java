package pagenet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	private WebDriver driver;
	
	
	public Base(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver edgeDriverConnection() {
		System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		return driver;
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void wait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public void visit(String url) {
		driver.get(url);
		wait(8);
	}
	
	public boolean isPresent(By locator) {
		try {
			return findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchCookieException e) {
			return false;
		}
	}
}
