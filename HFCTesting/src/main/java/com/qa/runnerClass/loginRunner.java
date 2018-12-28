package com.qa.runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\WMS\\workspace\\HFCTesting\\src\\main\\java\\com\\qa\\featureFiles\\Login.feature",
glue = {"com\\qa\\stepDefinition"},
plugin = {"pretty", "html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
monochrome = true, //display the console output in proper readable format
strict = true, //it will check if any steps not defined in step definition
dryRun = false  //Check mapping is proper between the feature and stepdefinition file
)

public class loginRunner {

}
