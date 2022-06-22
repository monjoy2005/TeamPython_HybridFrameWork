package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderHistoryPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(OrderHistoryPage.class);
@FindBy(xpath = "(//span[text()='Order history and details'])")
private WebElement orderHistory;

@FindBy(xpath = "(//a[@class='btn btn-default button button-small'])[2]")
private WebElement orderDetails;

@FindBy(xpath = "(//a[@class='btn btn-default button button-small'])[3]")
private WebElement backToAccount;

@FindBy(xpath = "(//a[@class='btn btn-default button button-small'])[4]")
private WebElement backToHome;


@FindBy(css = "p[class='info-account']")
private WebElement accountInfo;



    public OrderHistoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

//reusable steps
    public void clickOnOrderHistory(){
        click(orderHistory);
        LOG.info("click on order history success");
    }

    public void clickOnDetails(){
        click(orderDetails);
        LOG.info("click on details success");
    }


    public void clickOnBackToAccount(){
        click(backToAccount);
        LOG.info("click on back to account success");
    }

    public void clickOnHome(){
        click(backToHome);
        LOG.info("click on home success");
    }


    public String accountInfo(){
        return getElementText(accountInfo);
    }

}
