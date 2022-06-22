package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;

public class Dropdown_Products_Laptops_ForHomePage extends CommonAPI {
    public Dropdown_Products_Laptops_ForHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);}


    @FindBy(xpath = "//div[@class='anavmfe__accordion__body ']/div[2]/input")
    private WebElement radioBtnForBusiness;
    @FindBy(xpath = "(//div[@class='anavmfe__facets__wrapper_conatiner']/following-sibling::fieldset[2]/div/div/span/input)[1]")
    private WebElement processor12thGenIntelCoreCheckBox;
    @FindBy(xpath = "//div[@class='leftanav__grey__container']/div[2]/div/fieldset[21]/div/div/span/input")
    private WebElement grayOptionCheckBox;
    @FindBy(xpath = "//div[@class='leftanav__option__container']/div/fieldset[19]/div/div/span/input")
    private WebElement silverOptionCheckBox;
    @FindBy(xpath = "//div[@class='pg-title']/div/h1/span")
    private WebElement headerTextGrayLaptop;
    @FindBy(xpath = "//div[@class='system-result-top-content']/div/div[2]/div/div[2]/div/fieldset[6]/div/div/span/input")
    private WebElement screenSize17inCheckBox;
    @FindBy(xpath = "//div[@class='leftanav__option__container']/div/fieldset[15]/div/div[2]/span/input")
    private WebElement allNvidiaCheckBox;
    @FindBy(xpath = "//div[@class='brand-compare-links cat-fran-card-links cat-fran-card-shop-link-first']/div/div/a")
    private WebElement shopXpsBtn;

    public void clickRadioBtnForBusiness(){click(radioBtnForBusiness);
        System.out.println("click Radio Btn For Business success");}
    public void clickProcessor12thGenIntelCoreCheckBox(){click(processor12thGenIntelCoreCheckBox);
        System.out.println("Check Processor 12 Gen success");}
    public boolean forBusinessRadioBtnIsChecked() {
        return checkBoxIsChecked(radioBtnForBusiness);
    }
    public void clickGrayOptionCheckBox(){click(grayOptionCheckBox);
        System.out.println("Check Gray Option success");}
    public void clickSilverOptionCheckBox(){click(silverOptionCheckBox);
        System.out.println("Check Silver Option success");}
    public void clickAllNvidiaCheckBox(){click(allNvidiaCheckBox);
        System.out.println("Check All Nvidia Option success");}
    public void clickShopXpsBtn(){click(shopXpsBtn);
        System.out.println("Check Shop XPS Btn success");}
    public boolean processor12thGenIntelCoreCheckBoxIsChecked() {
        return checkBoxIsChecked(processor12thGenIntelCoreCheckBox);
    }
    public void clickScreenSize17inCheckBox(){click(screenSize17inCheckBox);
        System.out.println("Check Screen Size 17 in success");}
    public boolean grayOptionCheckBoxIsChecked() {
        return checkBoxIsChecked(grayOptionCheckBox);
    }
    public String grayColorHeaderText(){return getElementText(headerTextGrayLaptop);}

}
