package OmerBey.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        tags = {"@RegressionTest"},
        features = {"src/test/java/OmerBey/FeatureFiles"},
        glue = {"OmerBey/StepDefinitions"},
        dryRun = false,
        plugin = { //basit rapor oluşturan plugin
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        }

)

public class d_RegressionTest extends AbstractTestNGCucumberTests {
}
