package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RemoveItemPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(RemoveItemPage.class);
@FindBy(xpath = "//div/a[@title='Delete']")
private WebElement deleteCart;











    public RemoveItemPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }



    //reusable steps

    public void clickOnDeleteItems(){
        click(deleteCart);
        LOG.info("click on delete items success");
    }


}
