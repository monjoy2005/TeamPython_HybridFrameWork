package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.InformationPage;
import utility.ExcelReader;
import utility.Utility;

public class InformationTest extends CommonAPI {

    @Test(enabled = false)
    public void shipmentsAndReturnPolicy(){
        InformationPage informationPage=new InformationPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String expected= excelReader.getDataFromCell("Sheet1",0,5);
        informationPage.clickOnTShirts();
        informationPage.clickOnDelivery();
        Assert.assertEquals(informationPage.shipmentsHeader(),expected);

    }

    @Test(enabled = false)
    public void legalNotice(){
        InformationPage informationPage=new InformationPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String expected= excelReader.getDataFromCell("Sheet1",1,5);
        informationPage.clickOnTShirts();
        informationPage.clickOnLegalNotice();
        Assert.assertEquals(informationPage.legalHeader(),expected);
    }

    @Test (enabled = false)
    public void termsCondition(){
        InformationPage informationPage=new InformationPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String expected= excelReader.getDataFromCell("Sheet1",2,5);
        informationPage.clickOnTShirts();
        informationPage.clickOnTermsCondition();
        Assert.assertEquals(getPageUrl(),expected);


    }



    @Test(enabled = false)
    public void companyDetails(){
        InformationPage informationPage=new InformationPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String expected= excelReader.getDataFromCell("Sheet1",3,5);
        informationPage.clickOnTShirts();
        informationPage.clickOnAboutUs();
        Assert.assertEquals(informationPage.aboutUsHeader(),expected);


    }


    @Test(enabled = false)
    public void securePayment(){
        InformationPage informationPage=new InformationPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String expected= excelReader.getDataFromCell("Sheet1",4,5);
        informationPage.clickOnTShirts();
        informationPage.clickOnSecurePayment();
        Assert.assertEquals(getPageUrl(),expected);


    }


    @Test
    public void physicalStore(){
        InformationPage informationPage=new InformationPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String expected= excelReader.getDataFromCell("Sheet1",5,5);
        informationPage.clickOnTShirts();
        informationPage.clickOnOurStores();
        Assert.assertEquals(getPageUrl(),expected);


    }











}
