package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecyclePage extends CommonAPI {
    public RecyclePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[@class='heading noCta hasText']")
    private WebElement headerText;

    public String recycleHeaderText(){return getElementText(headerText);}
}
