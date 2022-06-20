package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformationPage extends CommonAPI {



@FindBy(xpath = "//span[text()='My personal information']")
private WebElement personalInfo;
@FindBy(css = "#days")
private WebElement days;
@FindBy(css = "#months")
private WebElement months;
@FindBy(css = "#years")
private WebElement years;
@FindBy(css = "#old_passwd")
private WebElement oldPassword;
@FindBy(xpath = "//button[@name='submitIdentity']/span")
private WebElement submit;

    public PersonalInformationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }





public void clickOnMyPersonalInfo(){
        click(personalInfo);
}

public void selectDay(String option){
        selectFromDropdown(days,option);
 }

    public void selectMonth(String option){
        selectFromDropdown(months,option);
    }

 public void selectYear(String option){
        selectFromDropdown(years,option);
    }

    public void enterCurrentPassword(String text){
        type(oldPassword,text);
    }

    public void clickOnSubmit(){
        click(submit);
    }

}
