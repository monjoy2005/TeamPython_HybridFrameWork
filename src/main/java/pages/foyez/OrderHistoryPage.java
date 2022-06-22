package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistoryPage extends CommonAPI {


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
    }

    public void clickOnDetails(){
        click(orderDetails);
    }


    public void clickOnBackToAccount(){
        click(backToAccount);
    }

    public void clickOnHome(){
        click(backToHome);
    }


    public String accountInfo(){
        return getElementText(accountInfo);
    }

}
