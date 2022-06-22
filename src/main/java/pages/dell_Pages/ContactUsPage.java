package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends CommonAPI {
    public ContactUsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='site-canvas-mob min-height-body']/div/div/h1")
    private WebElement headerText;


    public boolean checkHeaderTextIsPresent() {return isPresent(headerText);}
}