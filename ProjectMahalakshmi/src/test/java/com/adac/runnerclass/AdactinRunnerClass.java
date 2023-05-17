package com.adac.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Maha\\Documents\\JAVA\\Java\\Notes and Task send to mail\\May\\13 May 2023\\ProjectMahalakshmi\\src\\test\\resources\\Features\\AdactinLogin.feature",
				glue = {"com.adactin.stepdefinition", "com.adactin.hookspackage"},
				monochrome = true,
				dryRun = false,
				strict = true,
				plugin = {"html:Adactin/Reports", "json:Adactin/reports.json"})
public class AdactinRunnerClass {

}
