package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheckOutPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(CheckOutPage.class);
@FindBy(css = "#layered_id_attribute_group_2")
public WebElement sizeForFilter;
@FindBy(css = "#layered_id_feature_3")
public WebElement filterCompositionViscose;
@FindBy(css = "#layered_id_feature_19")
public WebElement filterPropertiesShortDress;

@FindBy(xpath = " //a/span[text()='Add to cart']")
private WebElement addCart;

@FindBy(css="a[title='Proceed to checkout']")
private WebElement checkOut;

@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
private WebElement checkOutProceed;

@FindBy(xpath = "//span[text()='Proceed to checkout']")
private WebElement checkOutAfterMessage;

@FindBy(xpath = "//div[@id='ordermsg']/label")
private WebElement orderMessageAssertion;

@FindBy(css = "textarea[name='message']")
private WebElement messagebox;

@FindBy(css = "#cgv")
public WebElement termsOfServiceCheckbox;

@FindBy(xpath = "(//button/span)[2]")
private WebElement checkOutAfterTermsCheck;

@FindBy(xpath = "//h1[text()='Please choose your payment method']")
private WebElement paymentAssertion;

@FindBy(css = "a[title='Pay by bank wire']")
private WebElement paymentMethod;

@FindBy(xpath = "//span[text()='I confirm my order']")
private WebElement confirmOrder;

@FindBy(xpath = "//p/strong")
private WebElement confirmationAssertion;


@FindBy(css = "a[title='View my shopping cart']")
private WebElement shoppingCart;


@FindBy(xpath = "//a[@id='button_order_cart']/span")
private WebElement checkOutFromShoppingCart;



@FindBy(css = "#id_address_delivery")
private WebElement deliveryAddress;


@FindBy(css = "#addressesAreEquals")
private WebElement uncheckAddress;


@FindBy(xpath = "//h1[text()='Authentication']")
private WebElement authentication;

@FindBy(css = "a[class='button-exclusive btn btn-default']")
private WebElement otherPaymentMethod;

@FindBy(css = "a[title='Pay by check.']")
private WebElement payByCheck;


@FindBy(xpath = "//h1[text()='Order confirmation']")
private WebElement orderConfirmation;


    public CheckOutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }



//reusable steps
    public void clickOnSize(){
        click(sizeForFilter);
        LOG.info("click on size success");
    }

    public void clickOnComposition(){
        click(filterCompositionViscose);
        LOG.info("click composition success");
    }

    public void clickOnProperties(){
        click(filterPropertiesShortDress);
        LOG.info("click to properties success");
    }

    public void clickOnAddToCart(){
        click(addCart);
        LOG.info("click on add to cart success");
    }

    public void clickOnCheckOut(){
        click(checkOut);
        LOG.info("click on check out success");
    }


    public void clickOnCheckOutProceed(){
        click(checkOutProceed);
        LOG.info("click on checkout proceed success");
    }

    public void enterMessage(String text){
        type(messagebox,text);
        LOG.info("enter message success");
    }

    public String messageHeader(){
        return getElementText(orderMessageAssertion);
    }

    public void clickOnCheckOutAfterMessage(){
        click(checkOutAfterMessage);
        LOG.info("click on check out after message success");
    }
    public void clickOnAgreeCheckbox(){
        click(termsOfServiceCheckbox);
        LOG.info("click on agree check box success");
    }

    public void clickOnCheckOutAfterTermCheck(){
        click(checkOutAfterTermsCheck);
        LOG.info("click on checkout after term check success");
    }

    public void clickOnPaymentMethod(){
        click(paymentMethod);
        LOG.info("click on payment method success");
    }

    public void clickOnConfirmOrder(){
        click(confirmOrder);
        LOG.info("click on confirm order success");
    }
    public String confirmHeader(){
        return getElementText(confirmationAssertion);
    }


    public void hoverOverShoppingCart(WebDriver driver){
        hoverOver(driver,shoppingCart);
        LOG.info("hover over success");
    }

    public void clickOnCheckOutFromShoppingCart(){
        click(checkOutFromShoppingCart);
        LOG.info("click on check out from shopping cart success");
    }


    public void selectDeliveryAddress(String option){
        selectFromDropdown(deliveryAddress,option);
        LOG.info("select delivery address success");
    }

    public void clickOnUncheckAddress(){
        click(uncheckAddress);
        LOG.info("uncheck address success");
    }


    public String accountPage(){
        return getElementText(authentication);
    }

    public void clickOnOtherPaymentMethod(){
        click(otherPaymentMethod);
        LOG.info("click on other payment method success");
    }

    public void clickOnPayByCheck(){
        click(payByCheck);
        LOG.info("click on pay by check success");
    }

    public String orderConfirmationHeader(){
        return getElementText(orderConfirmation);
    }


}
