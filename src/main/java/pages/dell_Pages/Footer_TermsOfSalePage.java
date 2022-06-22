package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer_TermsOfSalePage extends CommonAPI {
    public Footer_TermsOfSalePage(WebDriver driver){
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//h1[@class='uif_mhPageTitle gsd_pageTitle']")
    private WebElement headerText;

    public String termsOfSaleHeaderText() {
        return getElementText(headerText);
    }
}
