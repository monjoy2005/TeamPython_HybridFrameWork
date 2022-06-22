package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XpsLaptopsPage extends CommonAPI {
    public XpsLaptopsPage(WebDriver driver){
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//div[@class='brand-compare-details-section']/div/div[6]/div/div/a")
    private WebElement shopXpsBtn;
    @FindBy(xpath = "//div[@class='no-div-lines-layout']/div/article/section[3]/div/div/a")
    private WebElement customizeAndBuyBtn1;
    @FindBy(xpath = "//div[@class='no-div-lines-layout']/div/article/section/div[5]/div[2]/span[2]")
    private WebElement priceSlows;

    public void clickShopXpsBtn(){click(shopXpsBtn);
        System.out.println("Click Shop XPS Btn success");}
    public void clickCustomizeAndBuyBtn1(){click(customizeAndBuyBtn1);
        System.out.println("Click Customize & Buy Btn success");}
    public String priceShowsBeforeSelect(){return getElementText(priceSlows);}
}
