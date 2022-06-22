package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFooter_EmailSignUpPage extends CommonAPI {
    public HomePageFooter_EmailSignUpPage(WebDriver driver){
        PageFactory.initElements(driver, this);}


    @FindBy(xpath = "//div[@class='col-md-8']/h1")
    private WebElement headerText;

    public boolean emailSignUpHeaderTextIsPresent() {return isPresent(headerText);}
}