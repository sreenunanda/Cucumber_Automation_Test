package stepdefinitions;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.LoginPageObjects;

public class LoginSteps extends TestBase{
	LoginPageObjects loginPageObjects=new LoginPageObjects();

	@Given("^Enter the user credentials (.*) and (.*)$")
	public void loginTest(String username,String password) {
		loginPageObjects.login(username, password);
	}
	
	@Then("^Verify the login title (.+)$")
	public void verifyLoginTitle(String expectedResult) {
		loginPageObjects.verifyTitle(expectedResult);
	}
}
