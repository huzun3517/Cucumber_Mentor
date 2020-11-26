package OmerBey.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/java/OmerBey/FeatureFiles"},
        glue = {"OmerBey/StepDefinitions"},
        dryRun = false
)

public class a_TestRunner extends AbstractTestNGCucumberTests {


}
