package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dropdown_Products_WorkstationsPage extends CommonAPI {
    public Dropdown_Products_WorkstationsPage(WebDriver driver){PageFactory.initElements(driver, this);}

    @FindBy (xpath = "//div[@class='cat-banner-text']/h1")
    public WebElement workstationsHeaderText;


}