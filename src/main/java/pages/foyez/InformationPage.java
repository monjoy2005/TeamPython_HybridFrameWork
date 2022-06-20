package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationPage extends CommonAPI {


@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
private WebElement TShirts;
@FindBy(css = "a[title='Delivery']")
private WebElement delivery;
@FindBy(css = "a[title='Legal Notice']")
private WebElement legalNotice;
@FindBy(xpath = "(//a[@title='Terms and conditions of use'])[1]")
private WebElement termsCondition;
@FindBy(xpath ="(//a[@title='About us'])[1]")
private WebElement aboutUs;
@FindBy(xpath = "//a[@title='Secure payment']")
private WebElement securePayment;
@FindBy(xpath = "(//a[@title='Our stores'])[1]")
private WebElement ourStores;



@FindBy(xpath = "//h2[text()='Shipments and returns']")
private WebElement deliveryAssertion;


@FindBy(xpath ="//h2[text()='Legal']")
private WebElement legalAssertion;


@FindBy(xpath = "//h3[text()='Our team']")
private WebElement aboutUsAssertion;









    public InformationPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void clickOnTShirts(){
        click(TShirts);
    }

    public void clickOnDelivery(){
        click(delivery);
    }

    public void clickOnLegalNotice(){
        click(legalNotice);
    }

    public void clickOnTermsCondition(){
        click(termsCondition);
    }

    public void clickOnAboutUs(){
        click(aboutUs);
    }
    public void clickOnSecurePayment(){
        click(securePayment);
    }

    public void clickOnOurStores(){
        click(ourStores);
    }



    public String shipmentsHeader(){
        return getElementText(deliveryAssertion);
    }


    public String legalHeader(){
        return getElementText(legalAssertion);
    }


    public String aboutUsHeader(){
        return getElementText(aboutUsAssertion);
    }



}
