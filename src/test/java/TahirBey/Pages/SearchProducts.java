package TahirBey.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProducts extends _Parent {

    public SearchProducts() {

        PageFactory.initElements(driver, this);
    }

    WebElement myElement;

    @FindBy(css ="button[class='wt-btn wt-btn--secondary wt-width-full']")
    private WebElement  acceptButton;

    @FindBy(css ="input[data-id='search-query']")
    private WebElement  typeSearch;

    @FindBy(css ="button[value='Search']")
    private WebElement  searchButton;


    @FindBy(xpath ="//span[@class='wt-text-caption wt-text-link-no-underline']")
    private WebElement  text;





    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {

            case "acceptButton":
                myElement = acceptButton;
                break;

            case "searchButton":
                myElement = searchButton;
                break;

        }

        clickFunction(myElement);
    }



    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "typeSearch":
                myElement = typeSearch;
                break;
        }
        sendKeysFunction(myElement,value);
    }


    public void elementGetTex(String ElementName){
        switch (ElementName) {
            case "text":
                myElement = text;
                break;
        }

        System.out.println(myElement.getText());
    }


}
