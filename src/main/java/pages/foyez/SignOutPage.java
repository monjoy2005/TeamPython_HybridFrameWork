package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignOutPage extends CommonAPI {
    private final Logger LOG = LoggerFactory.getLogger(SignOutPage.class);
    @FindBy(css = "a[title='Log me out']")
    private WebElement signOut;

    @FindBy(css = "a[title='Sign out']")
    private WebElement signOutFromFooter;


    public SignOutPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }


    //reusable steps
    public void clickOnSignOut(){
        click(signOut);
        LOG.info("click on sign out success");
    }

    public void clickOnSignOutFromFooter(){
        click(signOutFromFooter);
        LOG.info("click on sign out from footer success");
    }





}
