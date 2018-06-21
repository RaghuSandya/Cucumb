package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/Baburao/workspace/com.cucumber.selenium/freecrmBDDFramework/src/main/java/features/dealMap.feature",
					glue={"stepDefination"},
					plugin={"html:target/cucumber-html-report",
					"json:target/cucumber.json","junit:target/cucumber.xml"},
					format={"pretty","html:test-output"},
					monochrome=true,
					strict=true,
					dryRun=false)
public class TestRunner {

}
