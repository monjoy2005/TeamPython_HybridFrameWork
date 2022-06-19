package Application.dell;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dell_Pages.*;

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
    public void copyrightOption(){
        HomePage homePage = new HomePage(getDriver());
        Footer_CopyrightPage footer_copyrightPage = new Footer_CopyrightPage(getDriver());
        homePage.clickFooterCopyrightBtn();
        String expectedHeaderText = "Copyrights";
        Assert.assertEquals(expectedHeaderText,footer_copyrightPage.copyrightHeaderText());
    }

    @Test
    public void myProductOption(){
        HomePage homePage = new HomePage(getDriver());
        Footer_MyProductPage footer_myProductPage = new Footer_MyProductPage(getDriver());
        homePage.clickFooterMyProductOption();
        String expectedHeaderText = "My Products and Services";
        Assert.assertEquals(expectedHeaderText,footer_myProductPage.myProductPageHeaderText());
    }


}