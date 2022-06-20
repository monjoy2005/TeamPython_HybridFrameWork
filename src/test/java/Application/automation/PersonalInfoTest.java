package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.HomePage;
import pages.foyez.LoginPage;
import pages.foyez.PersonalInformationPage;
import utility.ExcelReader;
import utility.Utility;

public class PersonalInfoTest extends CommonAPI {

    @Test
    public void updatePersonalInfo(){

        PersonalInformationPage personalInformationPage=new PersonalInformationPage(getDriver());
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        String password= excelReader.getDataFromCell("Sheet1",1,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        homePage.clickOnUserName();
        personalInformationPage.clickOnMyPersonalInfo();
        String day= excelReader.getDataFromCell("Sheet1",0,6);
        String month= excelReader.getDataFromCell("Sheet1",1,6);
        String year= excelReader.getDataFromCell("Sheet1",2,6);
        String oldPassword= excelReader.getDataFromCell("Sheet1",3,6);
        String expected= excelReader.getDataFromCell("Sheet1",4,6);
        Assert.assertEquals(getPageUrl(),expected);
        personalInformationPage.selectDay(day);
        personalInformationPage.selectMonth(month);
        personalInformationPage.selectYear(year);
        personalInformationPage.enterCurrentPassword(oldPassword);
        personalInformationPage.clickOnSubmit();




    }






}
