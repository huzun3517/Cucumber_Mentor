package OmerBey.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends _Parent {
    WebElement myElement;

    //buradaki driver silindi çünkü Parentten geliyor.gerek kalmadı
    public DialogContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".login")
    private WebElement signInButton;


    @FindBy(css = "#email_create")
    private WebElement emailTextArea;

    @FindBy(css = "#SubmitCreate")
    private WebElement submitButton;

    @FindBy(css = "#id_gender1")
    private WebElement gender1;

    @FindBy(css = "#customer_firstname")
    private WebElement firstname;

    @FindBy(css = "#customer_lastname")
    private WebElement lastname;

    @FindBy(css = "#passwd")
    private WebElement password;

    @FindBy(css = "#company")
    private WebElement company;

    @FindBy(css = "#address1")
    private WebElement adres;

    @FindBy(xpath = "(//a[text()='T-shirts'])[2]")
    private WebElement Tshirts;

    @FindBy(css = "i.icon-th-list")
    private WebElement listButoon;

    @FindBy(css = "div.wishlist>a")
    private WebElement addToWishlist;

    @FindBy(css = "p.fancybox-error")
    private WebElement message;













    public void findElementAndClickFunction(String ElementName) {


        switch (ElementName) {
            case "signInButton":
                myElement = signInButton;
                break;

            case "submitButton":
                myElement = submitButton;
                break;

            case "gender1":
                myElement = gender1;
                break;

            case "Tshirts":
                myElement = Tshirts;
                break;

            case "listButoon":
                myElement = listButoon;
                break;

            case "addToWishlist":
                myElement = addToWishlist;
                break;






        }

        clickFunction(myElement);
    }



    public void findElementAndSendKeysFunction(String ElementName, String value) {


        switch (ElementName) {
            case "emailTextArea":
                myElement = emailTextArea;
                break;

            case "firstname1":
                myElement = firstname;
                break;

            case "lastname1":
                myElement = lastname;
                break;

            case "password1":
                myElement = password;
                break;

            case "company":
                myElement = company;
                break;

            case "adres":
                myElement = adres;
                break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findElementAndVerifyContainsText(String ElementName, String msg) {
        switch (ElementName) {
            case "message":
                myElement = message;
                break;

        }

        verifyElementContainsText(myElement, msg);
    }
}