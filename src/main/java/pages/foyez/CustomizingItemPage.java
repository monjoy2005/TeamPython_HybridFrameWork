package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomizingItemPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(CustomizingItemPage.class);
    @FindBy(css = "a[class='btn btn-default button-plus product_quantity_up']")
    private WebElement quantityUp;

    @FindBy(css = "a[class='btn btn-default button-minus product_quantity_down']")
    private WebElement quantityDown;

    @FindBy(css = "#group_1")
    private WebElement size;

    @FindBy(xpath = "(//label[@class='attribute_label'])[1]")
    private WebElement sizeLabelAssertion;


    @FindBy(css = "a[title='Blue']")
    private WebElement color;

    @FindBy(xpath = "(//label[@class='attribute_label'])[2]")
    private WebElement colorAssertion;


    @FindBy(css = "button[class='btn btn-default btn-pinterest']")
    private WebElement pinterest;

    @FindBy(css = "li[class='print']")
    private WebElement print;



    public CustomizingItemPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }


    //reusable steps

    public void clickOnColor(){
        click(color);
        LOG.info("click on color success");
    }

    public void clickOnQuantityUp(){
        click(quantityUp);
        LOG.info("click on quantity up success");
    }

    public void clickOnQuantityDown(){
        click(quantityDown);
        LOG.info("click on quantity down success");
    }



    public void selectOptionFromDropdownMenu(String option){
        selectFromDropdown(size,option);
        LOG.info("select option from dropdown menu success");
    }



    public void clickOnPinterest(){
        click(pinterest);
        LOG.info("click on pinterest success");
    }

    public void clickOnPrint(){
        click(print);
        LOG.info("click on print success");
    }


    public String sizeLabelHeader(){
        return getElementText(sizeLabelAssertion);
    }

    public String colorHeader(){
        return getElementText(colorAssertion);
    }
}
