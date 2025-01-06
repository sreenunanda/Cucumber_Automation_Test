package stepdefinitions;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.PropertyHandler;

public class Hooks {
	TestBase testBase = new TestBase();

	@Before
	public void setup(Scenario scenario) {
		testBase.startBrowser(PropertyHandler.getProperty("browser"));
		System.out.println("Scenario Title : " + scenario.getName());
	}

	@After
	public void tearDown() {
		testBase.end();
	}

	@AfterStep
	public void afterStep(Scenario scenario) {
		if (scenario.isFailed()) {
			System.out.println("step failed, attaching screenshot");
		}
	}
}
