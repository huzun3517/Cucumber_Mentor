package OmerBey.StepDefinitions;

import OmerBey.Pages.DialogContent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class myTest2 {

    DialogContent dialogContent = new DialogContent();

    WebDriver driver;

    @Given("^Tisorte tiklat$")
    public void tisorte_tiklat()  {

        dialogContent.findElementAndClickFunction("Tshirts");
    }

    @And("^list gorunumune tikla$")
    public void list_gorunumune_tikla() {

        dialogContent.findElementAndClickFunction("listButoon");

    }

    @And("^Favorilere ekle butonuna bas$")
    public void favorilere_ekle_butonuna_bas()  {

        dialogContent.findElementAndClickFunction("addToWishlist");

    }

    @Then("^cikan mesaji verify et$")
    public void cikan_mesaji_verify_et()  {

        dialogContent.findElementAndVerifyContainsText("message","You must be logged in to manage your wishlist");
        System.out.println("mesaj doğrulandı");


    }

}
