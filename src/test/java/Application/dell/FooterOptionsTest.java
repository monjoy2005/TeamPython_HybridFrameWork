package Application.dell;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dell_Pages.ContactUsPage;
import pages.dell_Pages.Footer_CopyrightPage;
import pages.dell_Pages.HomePageFooter_EmailSignUpPage;
import pages.dell_Pages.HomePage;

public class FooterOptionsTest extends CommonAPI {


    @Test
    public void contactUsBtn(){
        HomePage homePage=new HomePage(getDriver());
        ContactUsPage contactUsPage = new ContactUsPage(getDriver());
        homePage.clickContactSupportBtn();
        contactUsPage.checkHeaderTextIsPresent();

    }

    @Test
    public void emailSignUpBtn(){
        HomePage homePage = new HomePage(getDriver());
        HomePageFooter_EmailSignUpPage homePageFooterEmailSignUpPage = new HomePageFooter_EmailSignUpPage(getDriver());
        homePage.clickEmailSignUpBtn();
        homePageFooterEmailSignUpPage.emailSignUpHeaderTextIsPresent();
    }

    @Test
    public void copyrightBtn(){
        HomePage homePage = new HomePage(getDriver());
        Footer_CopyrightPage footer_copyrightPage = new Footer_CopyrightPage(getDriver());
        homePage.clickFooterCopyrightBtn();
        //footer_copyrightPage.copyrightHeaderTextIsPresent();                 //can <is present> make it a TEST??
        String expectedHeaderText = "Copyrights";
        Assert.assertEquals(expectedHeaderText,footer_copyrightPage.copyrightHeaderText());
    }


}