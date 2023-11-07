package Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="",features="C:\\Users\\osaravanakarthikeyan\\eclipse-workspace\\com.Omprakash.TechAssessment3\\com.Omprakash.TechAssessment3\\src\\test\\resources\\Features\\Register.feature",glue="com.Omprakash.TechAssessment3",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
	public class Runner1 {
}











































//plugin = {"pretty","junit:target/Cucumber-reports/Cucumber.junit"}