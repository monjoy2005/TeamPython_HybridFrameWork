package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends CommonAPI {


@FindBy(css = "a[title='Contact Us']")
private WebElement contact;

@FindBy(css = "#id_contact")
private WebElement subjectDropdown;

@FindBy(css = "#message")
private WebElement message;

@FindBy(css = "#submitMessage")
private WebElement submitMessage;


@FindBy(css = "#email")
private WebElement email;


@FindBy(xpath = " //div/h1")
private WebElement customerAssertion;


    public ContactPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }


//reusable steps

    public void clickOnContact(){
        click(contact);
    }



    public void selectOptionFromSubjectDropdown(String option){
        selectFromDropdown(subjectDropdown,option);
    }

    public void typeEmail(String text){
        type(email,text);
    }
    public void writeMessage(String text){
        type(message,text);
    }

    public void clickOnSubmitMessage(){
        click(submitMessage);
}


public String contactHeader(){
    return getElementText(customerAssertion);

}

}
