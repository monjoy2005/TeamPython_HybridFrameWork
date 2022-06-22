package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonalInformationPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(PersonalInformationPage.class);

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



//reusable steps

    public void clickOnMyPersonalInfo(){
        click(personalInfo);
       LOG.info("click on personal info success");
}

    public void selectDay(String option){
        selectFromDropdown(days,option);
        LOG.info("select day  success");
 }

    public void selectMonth(String option){
        selectFromDropdown(months,option);
        LOG.info("select month success");
    }

    public void selectYear(String option){
        selectFromDropdown(years,option);
        LOG.info("select year success");
    }

    public void enterCurrentPassword(String text){
        type(oldPassword,text);
        LOG.info("enter current password success");
    }

    public void clickOnSubmit(){
        click(submit);
        LOG.info("click on submit success");
    }

}
