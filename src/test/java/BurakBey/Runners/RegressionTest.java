package BurakBey.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        tags = {"@RegressionTest"},
        features = {"src/test/java/BurakBey/FeatureFiles/SwagLabs1.feature"},
        glue = {"BurakBey/StepDefinition"},
        dryRun = false,
        plugin = {
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        }
)

public class RegressionTest extends AbstractTestNGCucumberTests {


}
