package OmerBey.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        tags = {"@SmokeTest"},
        features = {"src/test/java/OmerBey/FeatureFiles"},
        glue = {"OmerBey/StepDefinitions"},
        dryRun = false


)

public class c_SmokeTest extends AbstractTestNGCucumberTests {


}
