package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.PropertyHandler;

public class TestBase {

	public static WebDriver driver;

	public void startBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().browserVersion("131").setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		getDriver().get(PropertyHandler.getProperty("baseUrl"));
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("browser launched successfully");
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	
	public void end() {
		driver.quit();
	}
	
	
}
