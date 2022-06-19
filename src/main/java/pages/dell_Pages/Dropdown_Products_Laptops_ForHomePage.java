package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dropdown_Products_Laptops_ForHomePage extends CommonAPI {
    public Dropdown_Products_Laptops_ForHomePage(WebDriver driver){
        PageFactory.initElements(driver, this);}


    @FindBy(xpath = "//div[@class='anavmfe__accordion__body ']/div[2]/input")
    private WebElement radioBtnForBusiness;
    @FindBy(xpath = "(//div[@class='anavmfe__facets__wrapper_conatiner']/following-sibling::fieldset[2]/div/div/span/input)[1]")
    private WebElement processor12thGenIntelCoreCheckBox;



    public void clickRadioBtnForBusiness(){click(radioBtnForBusiness);}
    public void clickProcessor12thGenIntelCoreCheckBox(){click(processor12thGenIntelCoreCheckBox);}

    public boolean forBusinessRadioBtnIsChecked() {
        return checkBoxIsChecked(radioBtnForBusiness);
    }

    public boolean processor12thGenIntelCoreCheckBoxIsChecked() {
        return checkBoxIsChecked(processor12thGenIntelCoreCheckBox);
    }
}
