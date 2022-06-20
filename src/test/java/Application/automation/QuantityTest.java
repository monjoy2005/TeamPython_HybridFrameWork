package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.CustomizingItemPage;
import pages.foyez.HomePage;

public class QuantityTest extends CommonAPI {

    @Test
    public void increasingItemQuantity(){
        HomePage homePage= new HomePage(getDriver());
        CustomizingItemPage customizingItemPage=new CustomizingItemPage(getDriver());
        homePage.clickOnHomePageItem();
        for(int i=1;i<5;i++){
            customizingItemPage.clickOnQuantityUp();
        }
        String expectedURL="http://automationpractice.com/index.php?id_product=1&controller=product";
        Assert.assertEquals(getPageUrl(),expectedURL);

    }

    @Test
    public void decreasingItemQuantity(){
        HomePage homePage= new HomePage(getDriver());
        CustomizingItemPage customizingItemPage=new CustomizingItemPage(getDriver());
        homePage.clickOnHomePageItem();
        for(int i=1;i<5;i++){
            customizingItemPage.clickOnQuantityUp();
        }
        for(int i=5;i>0;i--){
            customizingItemPage.clickOnQuantityDown();
        }
        String expectedURL="http://automationpractice.com/index.php?id_product=1&controller=product";
        Assert.assertEquals(getPageUrl(),expectedURL);

    }




}
