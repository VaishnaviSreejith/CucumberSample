package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Featurefiles/", glue = {
		"org.stepdefinition", "org.hooks" }, dryRun = false)

public class Testrunner {

}
