package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.TestBase;
import utils.WebUtils;

public class LoginPageObjects extends TestBase{
	WebUtils webUtils;

	public LoginPageObjects() {
		PageFactory.initElements(driver, this);
		webUtils = new WebUtils(driver);
	}

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "submit")
	WebElement submit;

	@FindBy(className = "post-title")
	WebElement loginTitle;

	public void login(String name, String pwd) {
		webUtils.sendKeys(username, name);
		webUtils.sendKeys(password, pwd);
		webUtils.click(submit);
	}

	public void verifyTitle(String expectedResult) {
		String actual= loginTitle.getText();
		Assert.assertEquals(actual, expectedResult);

	}
}
