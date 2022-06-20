package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.CustomizingItemPage;
import pages.foyez.HomePage;

public class ColorTest extends CommonAPI {

    @Test
    public void colorSelection(){
        HomePage homePage= new HomePage(getDriver());
        CustomizingItemPage customizingItemPage=new CustomizingItemPage(getDriver());
        homePage.clickOnHomePageItem();
        customizingItemPage.clickOnColor();
        String expected="Color ";
        Assert.assertEquals(customizingItemPage.colorHeader(),expected);

    }


}
