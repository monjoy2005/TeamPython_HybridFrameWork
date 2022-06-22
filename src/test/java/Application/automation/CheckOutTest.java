package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.foyez.*;
import utility.ExcelReader;
import utility.Utility;

public class CheckOutTest extends CommonAPI {

    @Test(enabled = false)
        public void checkOut(){
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        AddToCartPage addToCartPage=new AddToCartPage(getDriver());
        CheckOutPage checkOutPage=new CheckOutPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        String password= excelReader.getDataFromCell("Sheet1",1,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        String expectedMessage= excelReader.getDataFromCell("Sheet1",8,0);
        Assert.assertEquals(homePage.userNameAssertion(),expectedMessage);
        searchResultPage.clickOnFloatingMenu();
        checkOutPage.clickOnSize();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.sizeForFilter));
        checkOutPage.clickOnComposition();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.filterCompositionViscose));
        checkOutPage.clickOnProperties();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.filterPropertiesShortDress));
        addToCartPage.clickOnList();
        Assert.assertTrue(isInteractable(addToCartPage.listView));
        checkOutPage.clickOnAddToCart();
        checkOutPage.clickOnCheckOut();
        checkOutPage.clickOnCheckOutProceed();
        String text= excelReader.getDataFromCell("Sheet1",0,8);
        checkOutPage.enterMessage(text);
        String expected= excelReader.getDataFromCell("Sheet1",1,8);
        Assert.assertEquals(checkOutPage.messageHeader(),expected);
        checkOutPage.clickOnCheckOutAfterMessage();
        checkOutPage.clickOnAgreeCheckbox();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.termsOfServiceCheckbox));
        checkOutPage.clickOnCheckOutAfterTermCheck();
        checkOutPage.clickOnPaymentMethod();
        String expectedMethod= excelReader.getDataFromCell("Sheet1",2,8);
        Assert.assertEquals(checkOutPage.confirmHeader(),expectedMethod);
        checkOutPage.clickOnConfirmOrder();
    }


    @Test(enabled = false)
    public void checkoutWithDeliveryAddressChange(){

        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        AddToCartPage addToCartPage=new AddToCartPage(getDriver());
        CheckOutPage checkOutPage=new CheckOutPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        String password= excelReader.getDataFromCell("Sheet1",1,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        String expectedMessage= excelReader.getDataFromCell("Sheet1",8,0);
        Assert.assertEquals(homePage.userNameAssertion(),expectedMessage);
        searchResultPage.clickOnFloatingMenu();
        checkOutPage.clickOnSize();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.sizeForFilter));
        checkOutPage.clickOnComposition();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.filterCompositionViscose));
        checkOutPage.clickOnProperties();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.filterPropertiesShortDress));
        addToCartPage.clickOnList();
        Assert.assertTrue(isInteractable(addToCartPage.listView));
        checkOutPage.clickOnAddToCart();
        addToCartPage.clickOnContinueShopping();
        checkOutPage.hoverOverShoppingCart(getDriver());
        checkOutPage.clickOnCheckOutFromShoppingCart();
        checkOutPage.clickOnCheckOutProceed();
        String deliveryAddress= excelReader.getDataFromCell("Sheet1",3,8);
        checkOutPage.selectDeliveryAddress(deliveryAddress);
        String text= excelReader.getDataFromCell("Sheet1",0,8);
        checkOutPage.enterMessage(text);
        String expected= excelReader.getDataFromCell("Sheet1",1,8);
        Assert.assertEquals(checkOutPage.messageHeader(),expected);
        checkOutPage.clickOnCheckOutAfterMessage();
        checkOutPage.clickOnAgreeCheckbox();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.termsOfServiceCheckbox));
        checkOutPage.clickOnCheckOutAfterTermCheck();
        checkOutPage.clickOnPaymentMethod();
        String expectedMethod= excelReader.getDataFromCell("Sheet1",2,8);
        Assert.assertEquals(checkOutPage.confirmHeader(),expectedMethod);
        checkOutPage.clickOnConfirmOrder();

    }


    @Test(enabled = false)
    public void checkoutWithDifferentDeliveryAndBillingAddress(){
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        AddToCartPage addToCartPage=new AddToCartPage(getDriver());
        CheckOutPage checkOutPage=new CheckOutPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        String password= excelReader.getDataFromCell("Sheet1",1,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        String expectedMessage= excelReader.getDataFromCell("Sheet1",8,0);
        Assert.assertEquals(homePage.userNameAssertion(),expectedMessage);
        searchResultPage.clickOnFloatingMenu();
        checkOutPage.clickOnSize();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.sizeForFilter));
        checkOutPage.clickOnComposition();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.filterCompositionViscose));
        checkOutPage.clickOnProperties();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.filterPropertiesShortDress));
        addToCartPage.clickOnList();
        Assert.assertTrue(isInteractable(addToCartPage.listView));
        checkOutPage.clickOnAddToCart();
        addToCartPage.clickOnContinueShopping();
        checkOutPage.hoverOverShoppingCart(getDriver());
        checkOutPage.clickOnCheckOutFromShoppingCart();
        checkOutPage.clickOnCheckOutProceed();
        String deliveryAddress= excelReader.getDataFromCell("Sheet1",3,8);
        checkOutPage.selectDeliveryAddress(deliveryAddress);
        checkOutPage.clickOnUncheckAddress();
        String text= excelReader.getDataFromCell("Sheet1",0,8);
        checkOutPage.enterMessage(text);
        String expected= excelReader.getDataFromCell("Sheet1",1,8);
        Assert.assertEquals(checkOutPage.messageHeader(),expected);
        checkOutPage.clickOnCheckOutAfterMessage();
        checkOutPage.clickOnAgreeCheckbox();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.termsOfServiceCheckbox));
        checkOutPage.clickOnCheckOutAfterTermCheck();
        checkOutPage.clickOnPaymentMethod();
        String expectedMethod= excelReader.getDataFromCell("Sheet1",2,8);
        Assert.assertEquals(checkOutPage.confirmHeader(),expectedMethod);
        checkOutPage.clickOnConfirmOrder();


    }

    @Test(enabled = false)
    public void checkoutByNonAccountHolder(){
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        AddToCartPage addToCartPage=new AddToCartPage(getDriver());
        CheckOutPage checkOutPage=new CheckOutPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        searchResultPage.clickOnFloatingMenu();
        checkOutPage.clickOnSize();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.sizeForFilter));
        checkOutPage.clickOnComposition();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.filterCompositionViscose));
        checkOutPage.clickOnProperties();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.filterPropertiesShortDress));
        addToCartPage.clickOnList();
        Assert.assertTrue(isInteractable(addToCartPage.listView));
        checkOutPage.clickOnAddToCart();
        checkOutPage.clickOnCheckOut();
        checkOutPage.clickOnCheckOutProceed();
        String expected= excelReader.getDataFromCell("Sheet1",4,8);
        Assert.assertEquals(checkOutPage.accountPage(),expected);


    }

    @Test
    public void checkoutWithChangingPaymentMethod(){

        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        AddToCartPage addToCartPage=new AddToCartPage(getDriver());
        CheckOutPage checkOutPage=new CheckOutPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        String password= excelReader.getDataFromCell("Sheet1",1,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        String expectedMessage= excelReader.getDataFromCell("Sheet1",8,0);
        Assert.assertEquals(homePage.userNameAssertion(),expectedMessage);
        searchResultPage.clickOnFloatingMenu();
        checkOutPage.clickOnSize();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.sizeForFilter));
        checkOutPage.clickOnComposition();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.filterCompositionViscose));
        checkOutPage.clickOnProperties();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.filterPropertiesShortDress));
        addToCartPage.clickOnList();
        Assert.assertTrue(isInteractable(addToCartPage.listView));
        checkOutPage.clickOnAddToCart();
        checkOutPage.clickOnCheckOut();
        checkOutPage.clickOnCheckOutProceed();
        String text= excelReader.getDataFromCell("Sheet1",0,8);
        checkOutPage.enterMessage(text);
        String expected= excelReader.getDataFromCell("Sheet1",1,8);
        Assert.assertEquals(checkOutPage.messageHeader(),expected);
        checkOutPage.clickOnCheckOutAfterMessage();
        checkOutPage.clickOnAgreeCheckbox();
        Assert.assertTrue(checkBoxIsChecked(checkOutPage.termsOfServiceCheckbox));
        checkOutPage.clickOnCheckOutAfterTermCheck();
        checkOutPage.clickOnPaymentMethod();
        checkOutPage.clickOnOtherPaymentMethod();
        checkOutPage.clickOnPayByCheck();
        checkOutPage.clickOnConfirmOrder();
        String expectedHeader= excelReader.getDataFromCell("Sheet1",5,8);
        Assert.assertEquals(checkOutPage.orderConfirmationHeader(),expectedHeader);





    }







}
