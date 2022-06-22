package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOutPage extends CommonAPI {

    @FindBy(css = "a[title='Log me out']")
    private WebElement signOut;

    @FindBy(css = "a[title='Sign out']")
    private WebElement signOutFromFooter;


    public SignOutPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void clickOnSignOut(){
        click(signOut);
    }

    public void clickOnSignOutFromFooter(){
        click(signOutFromFooter);
    }





}
