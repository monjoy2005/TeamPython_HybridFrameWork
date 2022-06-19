package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer_MyProductPage extends CommonAPI {
    public Footer_MyProductPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='col-12 col-lg-6']/h1")
    private WebElement headerText;

    public String myProductPageHeaderText(){return getElementText(headerText);}
}
