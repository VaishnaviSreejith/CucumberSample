package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Featurefiles/", plugin= {"json:cucumber.json"},glue = {
		"org.stepdefinition", "org.hooks" }, dryRun = false)

public class Testrunner {

}
