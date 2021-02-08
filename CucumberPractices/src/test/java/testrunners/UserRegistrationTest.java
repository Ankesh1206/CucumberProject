package testrunners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/appfeatures/registration.feature"},
		glue = {"stepdefinition"},//glue : which package steps are available
		//tags = "@Prod or @Smoke or @Regression",
		//tags = "@Prod and @Regression",
		//tags = "@All",
		//tags = "not @Prod",
		plugin = {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml"
				}//,
		,monochrome = false //true for alignment and formatting but use pretty
		,dryRun = false //checks for feature for missing step definition and don't result actual value if set to true
		//,strict = true
		//publish = true //-- Check this in cucumber.properties file in resources
		)

public class UserRegistrationTest {

}
