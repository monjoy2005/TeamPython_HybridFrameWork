package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.HomePage;
import pages.foyez.LoginPage;
import pages.foyez.OrderHistoryPage;
import utility.ExcelReader;
import utility.Utility;

public class OrderHistoryTest extends CommonAPI {

@Test(enabled = false)
public void OrderCheckTest(){
    HomePage homePage= new HomePage(getDriver());
    LoginPage loginPage= new LoginPage(getDriver());
    OrderHistoryPage orderHistoryPage=new OrderHistoryPage(getDriver());
    ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
    String email= excelReader.getDataFromCell("Sheet1",0,0);
    String password= excelReader.getDataFromCell("Sheet1",1,0);
    homePage.clickOnSignIn();
    loginPage.putEmail(email);
    loginPage.putPassword(password);
    loginPage.hitSignIn();
    homePage.clickOnUserName();
    orderHistoryPage.clickOnOrderHistory();


}

@Test(enabled = false)
    public void orderDetailsTest(){

    HomePage homePage= new HomePage(getDriver());
    LoginPage loginPage= new LoginPage(getDriver());
    OrderHistoryPage orderHistoryPage=new OrderHistoryPage(getDriver());
    ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
    String email= excelReader.getDataFromCell("Sheet1",0,0);
    String password= excelReader.getDataFromCell("Sheet1",1,0);
    homePage.clickOnSignIn();
    loginPage.putEmail(email);
    loginPage.putPassword(password);
    loginPage.hitSignIn();
    homePage.clickOnUserName();
    orderHistoryPage.clickOnOrderHistory();
    orderHistoryPage.clickOnDetails();
    String expected=excelReader.getDataFromCell("Sheet1",8,4);
    Assert.assertEquals(getPageUrl(),expected);

}

@Test(enabled = false)
    public void backToUserAccount(){
    HomePage homePage= new HomePage(getDriver());
    LoginPage loginPage= new LoginPage(getDriver());
    OrderHistoryPage orderHistoryPage=new OrderHistoryPage(getDriver());
    ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
    String email= excelReader.getDataFromCell("Sheet1",0,0);
    String password= excelReader.getDataFromCell("Sheet1",1,0);
    homePage.clickOnSignIn();
    loginPage.putEmail(email);
    loginPage.putPassword(password);
    loginPage.hitSignIn();
    homePage.clickOnUserName();
    orderHistoryPage.clickOnOrderHistory();
    orderHistoryPage.clickOnBackToAccount();
}

@Test
    public void backToHomeTest(){
    HomePage homePage= new HomePage(getDriver());
    LoginPage loginPage= new LoginPage(getDriver());
    OrderHistoryPage orderHistoryPage=new OrderHistoryPage(getDriver());
    ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
    String email= excelReader.getDataFromCell("Sheet1",0,0);
    String password= excelReader.getDataFromCell("Sheet1",1,0);
    homePage.clickOnSignIn();
    loginPage.putEmail(email);
    loginPage.putPassword(password);
    loginPage.hitSignIn();
    homePage.clickOnUserName();
    orderHistoryPage.clickOnOrderHistory();
    orderHistoryPage.clickOnHome();
    String expected=excelReader.getDataFromCell("Sheet1",9,4);
    Assert.assertEquals(getPageUrl(),expected);
}












}
