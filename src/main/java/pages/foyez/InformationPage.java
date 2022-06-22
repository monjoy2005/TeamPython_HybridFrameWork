package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InformationPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(InformationPage.class);
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
        LOG.info("click on TShirts success");
    }

    public void clickOnDelivery(){
        click(delivery);
        LOG.info("click on delivery success");
    }

    public void clickOnLegalNotice(){
        click(legalNotice);
        LOG.info("click on search legal notice success");
    }

    public void clickOnTermsCondition(){
        click(termsCondition);
        LOG.info("click on terms condition success");
    }

    public void clickOnAboutUs(){
        click(aboutUs);
        LOG.info("click on about us success");
    }
    public void clickOnSecurePayment(){
        click(securePayment);
        LOG.info("click on secure payment success");
    }

    public void clickOnOurStores(){
        click(ourStores);
        LOG.info("click on our stores success");
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
