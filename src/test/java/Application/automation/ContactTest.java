package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.ContactPage;
import utility.ExcelReader;
import utility.Utility;

public class ContactTest extends CommonAPI {
    @Test
    public void contact(){
        ContactPage contactPage=new ContactPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String option=excelReader.getDataFromCell("Sheet1",0,3);
        contactPage.clickOnContact();
        contactPage.selectOptionFromSubjectDropdown(option);
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        contactPage.typeEmail(email);
        String text=excelReader.getDataFromCell("Sheet1",1,3);
        contactPage.writeMessage(text);
        contactPage.clickOnSubmitMessage();
        String message=excelReader.getDataFromCell("Sheet1",2,3);
        //String expectedMessage="CUSTOMER SERVICE - CONTACT US";
        Assert.assertEquals(contactPage.contactHeader(),message);



    }






}
