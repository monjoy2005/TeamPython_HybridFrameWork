package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.CustomizingItemPage;
import pages.foyez.HomePage;
import utility.ExcelReader;
import utility.Utility;

public class DropdownSizeTest extends CommonAPI {

    @Test
    public void selectRegardingSize(){
        HomePage homePage= new HomePage(getDriver());
        CustomizingItemPage customizingItemPage=new CustomizingItemPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String size=excelReader.getDataFromCell("Sheet1",0,1);
        homePage.clickOnHomePageItem();
        customizingItemPage.selectOptionFromDropdownMenu(size);
        String expectedMessage="Size ";
        Assert.assertEquals(customizingItemPage.sizeLabelHeader(),expectedMessage);

    }


}
