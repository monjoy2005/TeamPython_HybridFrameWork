package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.AddressPage;
import pages.foyez.HomePage;
import pages.foyez.LoginPage;
import utility.ExcelReader;
import utility.Utility;

public class AddressTest extends CommonAPI {


    @Test(enabled = false)
    public void address(){
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        AddressPage addressPage=new AddressPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        String password= excelReader.getDataFromCell("Sheet1",1,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        String expectedMessage= excelReader.getDataFromCell("Sheet1",8,0);
        Assert.assertEquals(homePage.userNameAssertion(),expectedMessage);
        homePage.clickOnUserName();
        addressPage.clickOnMyAddresses();
        String expected=excelReader.getDataFromCell("Sheet1",4,3);
        Assert.assertEquals(addressPage.addressHeader(),expected);






    }

    @Test(enabled = false)
    public void updateAddress(){

        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        AddressPage addressPage=new AddressPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        String password= excelReader.getDataFromCell("Sheet1",1,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        homePage.clickOnUserName();
        addressPage.clickOnMyAddresses();
        String expectedAddress= excelReader.getDataFromCell("Sheet1",7,3);
        Assert.assertEquals(addressPage.addressMessage(),expectedAddress);
        addressPage.clickOnUpdate();
        addressPage.clearCityField();
        String updatedCity=excelReader.getDataFromCell("Sheet1",5,3);
        addressPage.enterCity(updatedCity);
        String expected= excelReader.getDataFromCell("Sheet1",6,3);
        Assert.assertEquals(addressPage.myAddress(),expected);


    }


    @Test
    public void addNewAddress(){

        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        AddressPage addressPage=new AddressPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        String password= excelReader.getDataFromCell("Sheet1",1,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        homePage.clickOnUserName();
        addressPage.clickOnMyAddresses();
        addressPage.clickOnAddNewAddress();
        String expectedRequired=excelReader.getDataFromCell("Sheet1",8,3);
        Assert.assertEquals(addressPage.requiredField(),expectedRequired);
        String street=excelReader.getDataFromCell("Sheet1",0,4);
        String city=excelReader.getDataFromCell("Sheet1",1,4);
        String state=excelReader.getDataFromCell("Sheet1",2,4);
        String zip=excelReader.getDataFromCell("Sheet1",3,4);
        String cell=excelReader.getDataFromCell("Sheet1",4,4);
        String refer=excelReader.getDataFromCell("Sheet1",5,4);
        addressPage.enterNewAddress(street);
        addressPage.enterNewCity(city);
        addressPage.selectNewState(state);
        addressPage.enterNewPostcode(zip);
        addressPage.enterNewMobilePhone(cell);
        addressPage.enterNewAlias(refer);
        addressPage.clickONNewAddressSubmit();
        String expected=excelReader.getDataFromCell("Sheet1",6,4);
        Assert.assertEquals(getPageUrl(),expected);


    }

    @Test(enabled = false)
    public void deleteAddress(){

        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        AddressPage addressPage=new AddressPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        String password= excelReader.getDataFromCell("Sheet1",1,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        homePage.clickOnUserName();
        addressPage.clickOnMyAddresses();
        addressPage.clickOnDeleteAddress();
        getDriver().switchTo().alert().accept();
        String expected=excelReader.getDataFromCell("Sheet1",7,4);
        Assert.assertEquals(addressPage.allAddressList(),expected);

    }






}
