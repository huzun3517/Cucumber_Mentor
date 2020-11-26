package OmerBey.StepDefinitions;

import OmerBey.Pages.DialogContent;
import OmerBey.Utilities.Driver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class myTest1 {

    DialogContent dialogContent = new DialogContent();

    WebDriver driver;

    @Given("^Websiteye git$")
    public void websiteyeGit() {

        driver = Driver.getDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @And("^Sign in butonuna tikla$")
    public void signInButonunaTikla() {

        dialogContent.findElementAndClickFunction("signInButton");

    }

    @And("^Email \"([^\"]*)\" gir$")
    public void emailGir(String mail) {

        dialogContent.findElementAndSendKeysFunction("emailTextArea",mail);

    }

    @And("^Create an Account butonuna tikla$")
    public void createAnAccountButonunaTikla() {

        dialogContent.findElementAndClickFunction("submitButton");
    }

    @And("^Title sec$")
    public void titleSec() {

        dialogContent.findElementAndClickFunction("gender1");


    }

    @And("^firstname \"([^\"]*)\" ve lastname \"([^\"]*)\" gir$")
    public void firstnameVeLastnameGir(String firstname, String lastname) {

        dialogContent.findElementAndSendKeysFunction("firstname1",firstname);
        dialogContent.findElementAndSendKeysFunction("lastname1",lastname);

    }

    @And("^password \"([^\"]*)\" gir$")
    public void passwordGir(String password)  {

        dialogContent.findElementAndSendKeysFunction("password1",password);

    }

    @When("^Company \"([^\"]*)\" gir$")
    public void companyGir(String company) {

        dialogContent.findElementAndSendKeysFunction("company",company);

    }

    @Then("^Adress \"([^\"]*)\" gir$")
    public void adressGir(String adress)  {

        dialogContent.findElementAndSendKeysFunction("adres",adress);



    }
}
