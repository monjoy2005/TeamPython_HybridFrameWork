package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends CommonAPI {
    public DashBoardPage(WebDriver driver){
        PageFactory.initElements(driver, this);}


    @FindBy(className = "#um-si-label")
    private WebElement welcomeUserName;

    public String getWelcomeUserName(){return getElementText(welcomeUserName);}
}
