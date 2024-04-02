package runner;

import org.testng.annotations.Test;



import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue="stepdefinitions")
//		tags="@tag")
//plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
//plugin={"html:target/cucumber.html"}
//plugin= {"pretty","jason:target/cucumberReports.json"},dryRun=true	)

public class Owner_Runner extends AbstractTestNGCucumberTests{

}
