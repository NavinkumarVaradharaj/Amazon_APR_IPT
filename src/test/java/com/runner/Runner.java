package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\com\\feature\\AddtoCart.feature", 
				glue = { "com.stepdefenition","com.hooks" }, 	
				plugin = { "pretty", "html:target/cucumber-reports",
							"json:target/reports.json",
						 	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, monochrome = true
				)
public class Runner {

}
