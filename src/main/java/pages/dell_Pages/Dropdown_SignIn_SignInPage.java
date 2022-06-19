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
    private WebElement headerText;

    @FindBy(xpath = "//div[@class='phone-otp-email']/label/input")
    private WebElement emailAddressField;

    @FindBy(css = "#userPwd_UserInputSecret")
    private WebElement passwordField;
    @FindBy(css = "#btnSignIn")
    private WebElement signInBtn;


    public String signInPageHeaderText(){
        return getElementText(headerText);
    }
    public void cleanEmailAddressField(){clear(emailAddressField);}
    public void inputEmailAddress(String input){type(emailAddressField, input);}
    public void cleanPasswordField(){clear(passwordField);}
    public void inputPassword(String input){type(passwordField,input);}
    public void clickSignInBtn(){click(signInBtn);}

}