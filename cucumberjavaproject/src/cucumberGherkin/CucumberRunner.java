package cucumberGherkin;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty", "json:target/"},
		glue = {"stepDefinitions"},
		features = {"src\\features\\loginfeature.feature"})
public class CucumberRunner {

}
