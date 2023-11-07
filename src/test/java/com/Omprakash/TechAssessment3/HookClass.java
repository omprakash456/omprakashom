package com.Omprakash.TechAssessment3;


import org.openqa.selenium.TakesScreenshot;

import com.mongodb.MapReduceCommand.OutputType;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookClass {
	@Before
	public void Start() {
		HelperClass.SetUpDriver();
	}
	@After
	public void close(Scenario scenario) {
		if(scenario.isFailed()) {
    }
		HelperClass.TearDown();
	}

}



























































//final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
//scenario.attach(screenshot,"image/png",scenario.getName());