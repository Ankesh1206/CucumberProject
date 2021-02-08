package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/appfeatures/Search.feature"},
		glue = {"stepdefinition","myhooks"},//glue : which package steps are available
		tags = "@Smoke or @Regression",
		plugin = {"pretty"})
public class AmazontestRunner {

}
