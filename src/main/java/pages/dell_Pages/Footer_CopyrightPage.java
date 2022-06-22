package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer_CopyrightPage extends CommonAPI {

    public Footer_CopyrightPage(WebDriver driver){PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//div[@class='uif_mhFooterWrap clearfix']/h1")
    private WebElement headerText;



    public boolean copyrightHeaderTextIsPresent() {
        return super.isPresent(headerText);
    }
    public String copyrightHeaderText(){return getElementText(headerText);}
}