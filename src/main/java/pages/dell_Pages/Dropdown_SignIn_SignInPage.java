package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dropdown_SignIn_SignInPage extends CommonAPI {


    public Dropdown_SignIn_SignInPage(WebDriver driver){
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//div[@class='phone-otp-Signin-label dds__mb-0 dds__text-center']/h1")
    public WebElement headerText;


    public String signInPageHeaderText(){
        return getElementText(headerText);
    }
}