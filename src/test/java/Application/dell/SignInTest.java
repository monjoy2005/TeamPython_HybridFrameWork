package Application.dell;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dell_Pages.Dropdown_SignIn_CreateAccountPage;
import pages.dell_Pages.Dropdown_SignIn_DellFinancialSesvicesPage;
import pages.dell_Pages.HomePage;
import pages.dell_Pages.Dropdown_SignIn_SignInPage;

public class SignInTest extends CommonAPI {
    @Test
    public void createAccountBtn(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_SignIn_CreateAccountPage dropdownSignInCreateAccountPage =new Dropdown_SignIn_CreateAccountPage(getDriver());
        homePage.hoverOverOnSignInBtn(getDriver());         //this is the format off calling hoverOver
        //hoverOver(getDriver(),homePage.signInHoverOver);        //this is NOT the format
        homePage.chickCreateAccountBtn();
        isPresent(dropdownSignInCreateAccountPage.createAccountText);
    }

    @Test
    public void signInBtn(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_SignIn_SignInPage dropdownSignInSignInPage =new Dropdown_SignIn_SignInPage(getDriver());
        Dropdown_SignIn_CreateAccountPage dropdownSignInCreateAccountPage =new Dropdown_SignIn_CreateAccountPage(getDriver());
        homePage.hoverOverOnSignInBtn(getDriver());
        homePage.clickSignInBtn();
        String expectedHeaderText = "Sign In";
        Assert.assertEquals(expectedHeaderText, dropdownSignInSignInPage.signInPageHeaderText());
    }

    @Test
    public void dellFinancialServiceBtn(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_SignIn_DellFinancialSesvicesPage dropdownSignInDellFinancialSesvicesPage =new Dropdown_SignIn_DellFinancialSesvicesPage(getDriver());
        homePage.hoverOverOnSignInBtn(getDriver());
        homePage.clickFinancialServiceBtn();
        isPresent(dropdownSignInDellFinancialSesvicesPage.dellFinancialServiceText);

    }



}