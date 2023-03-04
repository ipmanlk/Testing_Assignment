package com.actitime.qa.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/home/ipman/projects/playground/Testing_Assignment/src/main/java/com/actitime/qa/feature/Loging.feature"
		,glue={"com/actitime/qa/stepdefinitions"}
		,monochrome = true,
				strict=true,
				dryRun=false
		)




public class TestRunner {
	
	
	

}
