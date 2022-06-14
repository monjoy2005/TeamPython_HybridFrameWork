package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends CommonAPI {

    public SearchResultPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@class='direct-content__img']")
    private WebElement amdLogo;

    @FindBy(xpath = "//span[@class='search-string']")
    private WebElement monitorsText;
    @FindBy(xpath = "//h2[@class='pageinfo']/span[3]")
    private WebElement kvmText;

    @FindBy(xpath = "//h2[@class='pageinfo']/span[3]")
    private WebElement serverPageInfo;

    @FindBy(xpath = "//input[@name='44398']")
    private WebElement lessThan100;
    @FindBy(xpath = "//div[@class='anavmfe__facet__item']")
    private WebElement lessThan100Massage;

    @FindBy(xpath = "//h2[@class='direct-content__title']")
    private WebElement supportHeaderText;

    @FindBy(xpath = "//div[@class='bc-category-label icon-home']/span")
    private WebElement keyboardHeaderText;


    public boolean checkAmdLogoIsPresent(){return isPresent(amdLogo);}
    public boolean checkMonitorsTextIsPresent(){return isPresent(monitorsText);}
    //Need to ask is this is the right way
    public boolean checkKvmTextIsPresent(){
        return isPresent(kvmText);
    }

    public String getServerPageInfo() {
        return getElementText(serverPageInfo);
    }

    public void checkLessThan100(){click(lessThan100);}
    public boolean checkLessThan100MassageIsPresent() {return isPresent(lessThan100Massage);}
    public boolean checkSupportHeaderTextIsPresent() {return isPresent(supportHeaderText);}

    public boolean checkKeyboardHeaderTextIsPresent() {return super.isPresent(keyboardHeaderText);}
}