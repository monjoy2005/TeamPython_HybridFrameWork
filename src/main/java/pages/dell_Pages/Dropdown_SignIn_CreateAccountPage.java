package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dropdown_SignIn_CreateAccountPage extends CommonAPI{


    public Dropdown_SignIn_CreateAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='dds__pb-4 dds__text-center']/h1")
    public WebElement createAccountText;


    public void clickSingUpBtn(){click(createAccountText);
        System.out.println("Click Create Account Btn success");}

    // reusable methods




}