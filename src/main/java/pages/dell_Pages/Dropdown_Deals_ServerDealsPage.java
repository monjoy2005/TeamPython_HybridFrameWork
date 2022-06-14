package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dropdown_Deals_ServerDealsPage extends CommonAPI {
    public Dropdown_Deals_ServerDealsPage(WebDriver driver){
        PageFactory.initElements(driver, this);}


    @FindBy(xpath = "//div[@class='deals-category-hero-content']/h1")
    private WebElement headerText;


    public boolean serverDealsHeaderTextIsPresent() {
        return isPresent(headerText);
    }
}
