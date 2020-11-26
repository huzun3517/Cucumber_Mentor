package TahirBey.StepDefinitions;

import TahirBey.Pages.SearchProducts;
import TahirBey.Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ProductSteps {

    SearchProducts src=new SearchProducts();
    WebDriver driver;

    @Given("^Go to browser$")
    public void goToBrowser() {
        driver= Driver.getDriver();
    }

    @And("^Navigate to Etsy website$")
    public void navigateToEtsyWebsite() {

        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("^click Accept button$")
    public void clickAcceptButton() {

        src.findElementAndClickFunction("acceptButton");

    }

    @When("^Enter \"([^\"]*)\" on search line$")
    public void enterOnSearchLine(String arg0)  {

        src.findElementAndSendKeysFunction("typeSearch", arg0);
    }

    @And("^click search button$")
    public void clickSearchButton() {

        src.findElementAndClickFunction("searchButton");
    }

    @Then("^Get numbers of products by text$")
    public void getNumbersOfProductsByText() {

        src.elementGetTex("text");
    }

}
