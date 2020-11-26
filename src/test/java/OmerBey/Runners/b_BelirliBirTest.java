package OmerBey.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        features = {"src/test/java/OmerBey/FeatureFiles/testim2.feature"},
        glue = {"OmerBey/StepDefinitions"},
        plugin = { "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json","html:target/cucumber-html-report","usage:target/cucumber-usage.json","" +
                "junit:target/cucumber-results.xml" },
        dryRun = false

)

public class b_BelirliBirTest extends AbstractTestNGCucumberTests {


}
