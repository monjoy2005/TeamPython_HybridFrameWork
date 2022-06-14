package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dropdown_Product_Gaming_DellGamingPage extends CommonAPI {
    public Dropdown_Product_Gaming_DellGamingPage(WebDriver driver){PageFactory.initElements(driver, this);}


    @FindBy(xpath = "//li[@class='product-finder-category ']/button")
    public WebElement gamingLaptopsBtn;

    @FindBy(xpath = "//div[@class='title bottom-offset-0 clear-both']/h1")
    private WebElement GamingPageTitle;



}