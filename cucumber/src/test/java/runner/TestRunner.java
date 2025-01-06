package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        // format = {"pretty","html:target/html/" } ,
        features = "Features", glue = "stepdefinitions",tags = "@positiveLogin")

public class TestRunner extends AbstractTestNGCucumberTests{

}
