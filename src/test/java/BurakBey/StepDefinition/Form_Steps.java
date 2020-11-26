package BurakBey.StepDefinition;
;
import BurakBey.Pages.form;
import BurakBey.Utilites.BaseDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Form_Steps {

    WebDriver driver;


    @Given("^Navigate to Website$")
    public void navigate_to_Website() throws Throwable {
        driver = BaseDriver.getDriver();
        driver.get("https://eu.jotform.com/build/202614868523054");
        driver.manage().window().maximize();
    }

    @And("^Enter Ad and Soyad$")
    public void enter_Ad_and_Soyad() throws Throwable {
        form formsitesi = new form(driver);
        formsitesi.isim.sendKeys("Burak");
        formsitesi.soyIsim.sendKeys("Türkmen");
    }

    @And("^Enter E-posta$")
    public void enter_E_posta() throws Throwable {
        form formsitesi = new form(driver);
        formsitesi.mail.sendKeys("brk@brk.com");
    }

    @And("^Enter Telefon Numarasi$")
    public void enter_Telefon_Numarasi() throws Throwable {
        form formsitesi = new form(driver);
        formsitesi.alanKodu.sendKeys("49");
        formsitesi.telNo.sendKeys("12412334321");
    }

    @And("^Choose one of the hangisi options$")
    public void choose_one_of_the_hangisi_options() throws Throwable {
        form formsitesi = new form(driver);
        formsitesi.hangisi.click();
    }

    @When("^Click Gonder button$")
    public void click_Gonder_button() throws Throwable {
        form formsitesi = new form(driver);
        formsitesi.gonder.click();
    }

    @Then("^Verify the success text$")
    public void verify_the_success_text() throws Throwable {
        form formsitesi = new form(driver);
        WebElement successMassage = formsitesi.tesekkurler;
        Assert.assertTrue(successMassage.getText().contains("Teşekkürler!"));
    }
}
