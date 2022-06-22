package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart extends CommonAPI {
    public Cart(WebDriver driver){
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//div[@class='right-column']/div[2]/div/a/span/span[2]")
    private WebElement cartOption;
    @FindBy(xpath = "//div[@class='mh-cart-subtotal']/span[2]")
    private WebElement subtotal;
    @FindBy(xpath = "//div[@class='select-dropdown-wrap']/div/a")
    private WebElement removeBtn;
    @FindBy(xpath = "//div[@class='col-sm-9 empty-cart']/h2")
    private WebElement headerText;

    public void hoverOverCartOption(WebDriver driver){hoverOver(driver, cartOption);}
    public String subtotalAmount(){return getElementText(subtotal);}
    public void clickRemoveBtn(){click(removeBtn);
        System.out.println("Item Remove Successfully");}
    public String headerTextOfEmptyCart(){return getElementText(headerText);}
}
