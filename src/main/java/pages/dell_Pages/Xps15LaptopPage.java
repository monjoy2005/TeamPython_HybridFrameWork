package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Xps15LaptopPage extends CommonAPI {
    public Xps15LaptopPage(WebDriver driver){
        PageFactory.initElements(driver, this);}

    @FindBy(xpath = "//div[@class='align-items-center col d-flex flex-wrap justify-content-end']/div[2]/a")
    private WebElement addToCartBtn;

    public void clickAddToCartBtn(){click(addToCartBtn);
        System.out.println("Click Add To Cart Btn success");}
}
