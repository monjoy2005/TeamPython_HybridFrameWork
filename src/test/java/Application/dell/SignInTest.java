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
        homePage.hoverOverOnSignInBtn(getDriver());         //this is the format off calling hoverOver
        //hoverOver(getDriver(),homePage.signInHoverOver);        //this is NOT the format
        homePage.chickCreateAccountBtn();
        isPresent(dropdownSignInCreateAccountPage.createAccountText);
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
        dropdownSignInSignInPage.cleanEmailAddressField();
        dropdownSignInSignInPage.inputEmailAddress(excelReader.getDataFromCell("dell",3,3));
        dropdownSignInSignInPage.cleanPasswordField();
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
        isPresent(dropdownSignInDellFinancialSesvicesPage.dellFinancialServiceText);

    }



}