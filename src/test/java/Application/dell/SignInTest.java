package Application.dell;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dell_Pages.*;
import utility.ExcelReader;
import utility.Utility;

public class SignInTest extends CommonAPI {
    @Test
    public void createAccountBtn(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_SignIn_CreateAccountPage dropdownSignInCreateAccountPage =new Dropdown_SignIn_CreateAccountPage(getDriver());
        homePage.hoverOverOnSignInBtn(getDriver());
        homePage.chickCreateAccountBtn();
        Assert.assertTrue(isPresent(dropdownSignInCreateAccountPage.createAccountText),"Create Your Account");
    }

    @Test
    public void signInBtn(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_SignIn_SignInPage dropdownSignInSignInPage =new Dropdown_SignIn_SignInPage(getDriver());
        //Dropdown_SignIn_CreateAccountPage dropdownSignInCreateAccountPage =new Dropdown_SignIn_CreateAccountPage(getDriver());
        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"//data/TestData.xlsx");
        DashBoardPage dashBoardPage =new DashBoardPage(getDriver());
        homePage.hoverOverOnSignInBtn(getDriver());
        homePage.clickSignInBtn();
        dropdownSignInSignInPage.clearEmailAddressField();
        dropdownSignInSignInPage.inputEmailAddress(excelReader.getDataFromCell("dell",3,3));
        dropdownSignInSignInPage.clearPasswordField();
        dropdownSignInSignInPage.inputPassword(excelReader.getDataFromCell("dell",3,4));
        dropdownSignInSignInPage.clickSignInBtn();
        String expectedMassage = "Mritunjoy";
        Assert.assertEquals(expectedMassage,dashBoardPage.getWelcomeUserName());
    }

    @Test
    public void dellFinancialServiceBtn(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_SignIn_DellFinancialSesvicesPage dropdownSignInDellFinancialSesvicesPage =new Dropdown_SignIn_DellFinancialSesvicesPage(getDriver());
        homePage.hoverOverOnSignInBtn(getDriver());
        homePage.clickFinancialServiceBtn();
        Assert.assertFalse(dropdownSignInDellFinancialSesvicesPage.dellFinancialServiceTextIsPresent());
    }
    @Test
    public void premierSignInBtn(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_PremierSignInPage dropdown_premierSignInPage = new Dropdown_PremierSignInPage(getDriver());
        homePage.hoverOverOnSignInBtn(getDriver());
        homePage.clickPremierSignInBtn();
        Assert.assertTrue(dropdown_premierSignInPage.premierSignInHeaderTextsPresent());
    }

    @Test
    public void signInWithInvalidCredential(){
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverOnSignInBtn(getDriver());
        homePage.clickSignInBtn();
        Dropdown_SignIn_SignInPage dropdownSignInSignInPage =new Dropdown_SignIn_SignInPage(getDriver());
        dropdownSignInSignInPage.clearEmailAddressField();
        dropdownSignInSignInPage.clearPasswordField();
        dropdownSignInSignInPage.clickSignInBtn();
        String expectedMassage = "Please enter your email address.";
        Assert.assertEquals(dropdownSignInSignInPage.errorEmailAddressMassage(),expectedMassage);
    }

    @Test
    public void signInWithInvalidCredential2(){
        HomePage homePage = new HomePage(getDriver());
        homePage.hoverOverOnSignInBtn(getDriver());
        homePage.clickSignInBtn();
        Dropdown_SignIn_SignInPage dropdownSignInSignInPage =new Dropdown_SignIn_SignInPage(getDriver());
        dropdownSignInSignInPage.clearEmailAddressField();
        dropdownSignInSignInPage.clearPasswordField();
        dropdownSignInSignInPage.clickSignInBtn();
        String expectedMassage = "Please enter your email address.";
        Assert.assertEquals(dropdownSignInSignInPage.errorEmailAddressMassage(),expectedMassage);
    }


}