package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage extends CommonAPI {


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
    }

    public String addressHeader(){
        return getElementText(addressAssertion);
    }


    public void clickOnUpdate(){
        click(update);
    }



    public void clearCityField(){
        clear(city);
    }



    public void enterCity(String text){
        type(city,text);
    }



    public String myAddress(){
        return getElementText(myAddressAssertion);
    }


    public void clickOnAddNewAddress(){
        click(addNewAddress);
    }

    public void enterNewAddress(String text){
        type(newAddress,text);
    }

    public void enterNewCity(String text){
        type(newCity,text);
    }

    public void selectNewState(String option){
        selectFromDropdown(newState,option);
    }

    public void enterNewPostcode(String text){
        type(newPostcode,text);
    }

    public void enterNewMobilePhone(String text){
        type(newMobilePhone,text);
    }



    public void enterNewAlias(String text){
        type(newAlias,text);
    }


    public void clickONNewAddressSubmit(){
        click(newAddressSubmit);
    }


    public void clickOnDeleteAddress(){
        click(deleteAddress);
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
