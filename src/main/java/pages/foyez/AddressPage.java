package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddressPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(AddressPage.class);

@FindBy(css = "a[title='Addresses']")
private WebElement address;


@FindBy(css = "h1[class='page-heading']")
private WebElement addressAssertion;


@FindBy(css="a[title='Update']")
private WebElement update;


@FindBy(css = "#city")
private WebElement city;



@FindBy(xpath = "//div/h1[@class='page-subheading']")
private WebElement myAddressAssertion;


@FindBy(css = "a[title='Add an address']")
private WebElement addNewAddress;
@FindBy(css = "#address1")
private WebElement newAddress;
@FindBy(css = "#city")
private WebElement newCity;
@FindBy(css="#id_state")
private WebElement newState;
@FindBy(css="#postcode")
private WebElement newPostcode;
@FindBy(css = "#phone_mobile")
private WebElement newMobilePhone;
@FindBy(css = "#alias")
private WebElement newAlias;
@FindBy(css="#submitAddress")
private WebElement newAddressSubmit;

@FindBy(xpath = "(//span[text()='Delete'])[2]")
private WebElement deleteAddress;


@FindBy(xpath = "//strong[text()='Your addresses are listed below.']")
private WebElement allAddressAssertion;



@FindBy(css = "p[class='p-indent']")
private WebElement addressMessageAssertion;


@FindBy(css = "p[class='required']")
private WebElement requireFieldAssertion;




    public AddressPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

//reusable steps

    public void clickOnMyAddresses(){
        click(address);
        LOG.info("click on My address success");
    }

    public String addressHeader(){
        return getElementText(addressAssertion);
    }


    public void clickOnUpdate(){
        click(update);
        LOG.info("click on update success");
    }



    public void clearCityField(){
        clear(city);
        LOG.info("clearing city field success");
    }



    public void enterCity(String text){
        type(city,text);
        LOG.info("enter city success");
    }



    public String myAddress(){
        return getElementText(myAddressAssertion);
    }


    public void clickOnAddNewAddress(){
        click(addNewAddress);
        LOG.info("click on add new address success");
    }

    public void enterNewAddress(String text){
        type(newAddress,text);
        LOG.info("enter new address success");
    }

    public void enterNewCity(String text){
        type(newCity,text);
        LOG.info("enter new city success");
    }

    public void selectNewState(String option){
        selectFromDropdown(newState,option);
        LOG.info("selecting new State success");
    }

    public void enterNewPostcode(String text){
        type(newPostcode,text);
    }

    public void enterNewMobilePhone(String text){
        type(newMobilePhone,text);
        LOG.info("enter new mobile phone success");
    }



    public void enterNewAlias(String text){
        type(newAlias,text);
        LOG.info("enter new alias success");
    }


    public void clickONNewAddressSubmit(){
        click(newAddressSubmit);
        LOG.info("click on new address submit success");
    }


    public void clickOnDeleteAddress(){
        click(deleteAddress);
        LOG.info("click on delete address success");
    }


    public String allAddressList(){
        return getElementText(allAddressAssertion);
    }



    public String addressMessage(){
        return getElementText(addressMessageAssertion);
    }


    public String requiredField(){
        return getElementText(requireFieldAssertion);
    }


}
