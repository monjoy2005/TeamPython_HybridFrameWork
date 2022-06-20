package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizingItemPage extends CommonAPI {

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
    }

    public void clickOnQuantityUp(){
        click(quantityUp);
    }

    public void clickOnQuantityDown(){
        click(quantityDown);
    }



    public void selectOptionFromDropdownMenu(String option){
        selectFromDropdown(size,option);
    }



    public void clickOnPinterest(){
        click(pinterest);
    }

    public void clickOnPrint(){
        click(print);
    }


    public String sizeLabelHeader(){
        return getElementText(sizeLabelAssertion);
    }

    public String colorHeader(){
        return getElementText(colorAssertion);
    }
}
