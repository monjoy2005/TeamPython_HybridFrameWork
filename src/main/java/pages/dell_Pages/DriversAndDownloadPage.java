package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DriversAndDownloadPage extends CommonAPI {
    public DriversAndDownloadPage(WebDriver driver){
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//div[@class='d-flex flex-column pt-2 pt-md-0']/h1")
    private WebElement headerText;

    public boolean driversAndDownloadHeaderTextIsPresent() {
        return isPresent(headerText);
    }
}
