package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dropdown_PremierSignInPage extends CommonAPI {
    public Dropdown_PremierSignInPage(WebDriver driver){
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//div[@class='signin-container pull-left padding-small col-xs-6']/div/h2")
    private WebElement headerText;

    public boolean premierSignInHeaderTextsPresent() {
        return isPresent(headerText);
    }
}
