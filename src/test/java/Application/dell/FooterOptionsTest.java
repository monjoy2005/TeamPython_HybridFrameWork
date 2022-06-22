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
        Assert.assertTrue(contactUsPage.checkHeaderTextIsPresent());
    }

    @Test
    public void emailSignUpBtn(){
        HomePage homePage = new HomePage(getDriver());
        HomePageFooter_EmailSignUpPage homePageFooterEmailSignUpPage = new HomePageFooter_EmailSignUpPage(getDriver());
        homePage.clickEmailSignUpBtn();
        String expectedTitle = "Dell-PMC";
        Assert.assertEquals(getPageTitle(),expectedTitle);
    }

    @Test
    public void copyrightOption(){
        HomePage homePage = new HomePage(getDriver());
        Footer_CopyrightPage footer_copyrightPage = new Footer_CopyrightPage(getDriver());
        homePage.clickFooterCopyrightBtn();
        String expectedUrl = "https://www.dell.com/learn/us/en/uscorp1/site-terms-of-use-copyright";
        Assert.assertEquals(getPageUrl(),expectedUrl);
    }

    @Test
    public void myProductOption(){
        HomePage homePage = new HomePage(getDriver());
        Footer_MyProductPage footer_myProductPage = new Footer_MyProductPage(getDriver());
        homePage.clickFooterMyProductOption();
        String expectedHeaderText = "My Products and Services";
        Assert.assertEquals(expectedHeaderText,footer_myProductPage.myProductPageHeaderText());
    }
    @Test
    public void termsOfSaleOption(){
        HomePage homePage = new HomePage(getDriver());
        Footer_TermsOfSalePage footer_termsOfSalePage = new Footer_TermsOfSalePage(getDriver());
        homePage.clickFooterTermsOfSaleBtn();
        String expectedHeaderText = "Terms of Sale";
        Assert.assertEquals(expectedHeaderText,footer_termsOfSalePage.termsOfSaleHeaderText());
    }

    @Test
    public void myProductOptions(){
        HomePage homePage = new HomePage(getDriver());
        Footer_MyProductPage footer_myProductPage = new Footer_MyProductPage(getDriver());
        homePage.clickFooterMyProductOption();
        String expectedHeaderText = "My Products and Services";
        Assert.assertEquals(expectedHeaderText,footer_myProductPage.myProductPageHeaderText());
    }

    @Test
    public void emailSignUpButton(){
        HomePage homePage = new HomePage(getDriver());
        HomePageFooter_EmailSignUpPage homePageFooterEmailSignUpPage = new HomePageFooter_EmailSignUpPage(getDriver());
        homePage.clickEmailSignUpBtn();
        String expectedTitle = "Dell-PMC";
        Assert.assertEquals(getPageTitle(),expectedTitle);
    }


}