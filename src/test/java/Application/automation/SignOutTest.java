package Application.automation;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.HomePage;
import pages.foyez.LoginPage;
import pages.foyez.SignOutPage;
import utility.ExcelReader;
import utility.Utility;

public class SignOutTest extends CommonAPI {

    @Test(enabled = false)
    public void signOut(){
        SignOutPage signOutPage=new SignOutPage(getDriver());
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        String password= excelReader.getDataFromCell("Sheet1",1,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        //String expectedMessage="Karim khan";
        String expectedMessage= excelReader.getDataFromCell("Sheet1",8,0);
        Assert.assertEquals(homePage.userNameAssertion(),expectedMessage);
        signOutPage.clickOnSignOut();
    }

    @Test
    public void signOutFromFooter(){
        SignOutPage signOutPage=new SignOutPage(getDriver());
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        String password= excelReader.getDataFromCell("Sheet1",1,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
       // String expectedMessage="Karim khan";
        String expectedMessage= excelReader.getDataFromCell("Sheet1",8,0);
        Assert.assertEquals(homePage.userNameAssertion(),expectedMessage);
        JavascriptExecutor js= (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,7000);");
        signOutPage.clickOnSignOutFromFooter();
    }




}
