package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class AddToCartPage extends CommonAPI {
    public AddToCartPage(WebDriver driver){
        PageFactory.initElements(driver, this);}


    @FindBy(xpath = "//div[@class='container cf-body-ssb']/div[3]/div/div[2]/button")
    private WebElement nextStepAccessoriesBtn;
    @FindBy(xpath = "//div[@class='recommendations-container configurator-wrapper ng-scope']/div[2]/div/div[2]/div/div/div/span/button")
    private WebElement nextStepCartBtn;

    public void clickNextStepAccessoriesBtn(){click(nextStepAccessoriesBtn);
        System.out.println("Click Next Step Accessories Btn success");}
    public void clickNextStepCartBtn(){click(nextStepCartBtn);
        System.out.println("Click Next Step Cart Btn success");}
}
