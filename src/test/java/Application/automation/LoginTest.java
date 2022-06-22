package Application.automation;

import base.CommonAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.HomePage;
import pages.foyez.LoginPage;
import utility.ExcelReader;
import utility.Utility;

import java.util.List;

public class LoginTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(LoginTest.class);
    @Test
    public void SignInWithValidCred(){
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        String password= excelReader.getDataFromCell("Sheet1",1,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        String expectedMessage= excelReader.getDataFromCell("Sheet1",8,0);
        Assert.assertEquals(homePage.userNameAssertion(),expectedMessage);
}

    @Test
    public void SignInWithInvalidCred(){
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",2,0);
        String password= excelReader.getDataFromCell("Sheet1",3,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        String expectedMessage= excelReader.getDataFromCell("Sheet1",9,0);
        Assert.assertEquals(loginPage.warningHeader(),expectedMessage);


    }
    @Test
    public void SignInWithInvalidIdAndValidPass(){
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",4,0);
        String password= excelReader.getDataFromCell("Sheet1",5,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        String expectedMessage= excelReader.getDataFromCell("Sheet1",10,0);
        Assert.assertEquals(loginPage.forgotPasswordHeader(),expectedMessage);


    }

    @Test
    public void SignInWithValidIdAndInvalidPass(){
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",6,0);
        String password= excelReader.getDataFromCell("Sheet1",7,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        String expectedMessage= excelReader.getDataFromCell("Sheet1",11,0);
        Assert.assertEquals(loginPage.alreadyRegisteredHeader(),expectedMessage);

    }




}
