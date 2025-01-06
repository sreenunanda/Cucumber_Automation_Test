package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtils {
	WebDriver lDriver;

	public WebUtils(WebDriver driver) {
		lDriver = driver;
	}

	public void sendKeys(WebElement element, String value) {
		if (value != null) {
			waitForElementVisible(element).sendKeys(value);
		}
	}

	public void click(WebElement element) {
		waitForElementClickable(element).click();
	}

	public WebElement waitForElementVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(lDriver, Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public WebElement waitForElementClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(lDriver, Duration.ofSeconds(30));
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
