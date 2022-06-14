package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Support_OrderSupportPage extends CommonAPI {
    public Support_OrderSupportPage(WebDriver driver){
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//div[@class='container pt-6 pt-lg-14 pb-8']/h1")
    private WebElement headerText;


    public boolean orderSupportPageHeaderTextIsPresent() {
        return isPresent(headerText);
    }
}