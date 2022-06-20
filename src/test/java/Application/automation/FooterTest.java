package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.ContactPage;
import pages.foyez.FooterOptionsPage;
import pages.foyez.HomePage;
import pages.foyez.LoginPage;
import utility.ExcelReader;
import utility.Utility;

public class FooterTest extends CommonAPI {
    @Test(enabled = false)
    public void womenFooter(){
        FooterOptionsPage footerOptionsPage=new FooterOptionsPage(getDriver());
        footerOptionsPage.clickOnFooterWomen();
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String expected= excelReader.getDataFromCell("Sheet1",5,6);
        Assert.assertEquals(getPageUrl(),expected);


    }

    @Test(enabled = false)
    public void specialFooter(){
        FooterOptionsPage footerOptionsPage=new FooterOptionsPage(getDriver());
        footerOptionsPage.clickOnSpecial();
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String expected= excelReader.getDataFromCell("Sheet1",6,6);
        Assert.assertEquals(getPageUrl(),expected);

    }
    @Test(enabled = false)
    public void newProductFooter(){
        FooterOptionsPage footerOptionsPage=new FooterOptionsPage(getDriver());
        footerOptionsPage.clickOnNewProducts();
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String expected= excelReader.getDataFromCell("Sheet1",7,6);
        Assert.assertEquals(getPageUrl(),expected);
    }

    @Test(enabled = false)
    public void bestSellerFooter(){
        FooterOptionsPage footerOptionsPage=new FooterOptionsPage(getDriver());
        footerOptionsPage.clickOnBestSeller();
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String expected= excelReader.getDataFromCell("Sheet1",8,6);
        Assert.assertEquals(getPageUrl(),expected);
    }

    @Test(enabled = false)
    public void contactUsFooter(){
        FooterOptionsPage footerOptionsPage=new FooterOptionsPage(getDriver());
        ContactPage contactPage=new ContactPage(getDriver());
        footerOptionsPage.clickOnContactUs();
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String expected= excelReader.getDataFromCell("Sheet1",9,6);
        Assert.assertEquals(getPageUrl(),expected);
        String option=excelReader.getDataFromCell("Sheet1",0,3);
        contactPage.selectOptionFromSubjectDropdown(option);
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        contactPage.typeEmail(email);
        String text=excelReader.getDataFromCell("Sheet1",1,3);
        contactPage.writeMessage(text);
        contactPage.clickOnSubmitMessage();
        String message=excelReader.getDataFromCell("Sheet1",2,3);
        Assert.assertEquals(contactPage.contactHeader(),message);


    }

    @Test(enabled = false)
    public void termsConditionFooter(){
        FooterOptionsPage footerOptionsPage=new FooterOptionsPage(getDriver());
        footerOptionsPage.clickOnTermsCondition();
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String expected= excelReader.getDataFromCell("Sheet1",10,6);
        Assert.assertEquals(getPageUrl(),expected);
    }

    @Test(enabled = false)
    public void aboutUsFooter(){
        FooterOptionsPage footerOptionsPage=new FooterOptionsPage(getDriver());
        footerOptionsPage.clickOnAboutUs();
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String expected= excelReader.getDataFromCell("Sheet1",11,6);
        Assert.assertEquals(getPageUrl(),expected);
    }

    @Test(enabled = false)
    public void siteMapFooter(){
        FooterOptionsPage footerOptionsPage=new FooterOptionsPage(getDriver());
        footerOptionsPage.clickOnSitemap();
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String expected= excelReader.getDataFromCell("Sheet1",12,6);
        Assert.assertEquals(getPageUrl(),expected);
    }

    @Test(enabled = false)
    public void orderFooter(){
        FooterOptionsPage footerOptionsPage=new FooterOptionsPage(getDriver());
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        String password= excelReader.getDataFromCell("Sheet1",1,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        footerOptionsPage.clickOnOrder();
        String expected= excelReader.getDataFromCell("Sheet1",13,6);
        Assert.assertEquals(getPageUrl(),expected);
    }
   // @Test
    public void scroll(){
        FooterOptionsPage footerOptionsPage=new FooterOptionsPage(getDriver());

    }



}
