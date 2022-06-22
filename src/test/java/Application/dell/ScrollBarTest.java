package Application.dell;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dell_Pages.DriversAndDownloadPage;
import pages.dell_Pages.Footer_MyProductPage;
import pages.dell_Pages.HomePage;

public class ScrollBarTest extends CommonAPI {

    @Test
    public void myProductOptionWithScrollBar(){
        HomePage homePage = new HomePage(getDriver());
        Footer_MyProductPage footer_myProductPage = new Footer_MyProductPage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,9500)");
        homePage.clickFooterMyProductOption();
        String expectedHeaderText = "My Products and Services";
        Assert.assertEquals(expectedHeaderText,footer_myProductPage.myProductPageHeaderText());
    }
    @Test
    public void driversAndDownloadsWithScrollBar(){
        HomePage homePage = new HomePage(getDriver());
        DriversAndDownloadPage driversAndDownloadPage = new DriversAndDownloadPage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,2500)");
        homePage.clickDriversAndDownloadsBtn();
        Assert.assertTrue(driversAndDownloadPage.driversAndDownloadHeaderTextIsPresent());

    }
    @Test
    public void myProductsOptionWithScrollBar(){
        HomePage homePage = new HomePage(getDriver());
        Footer_MyProductPage footer_myProductPage = new Footer_MyProductPage(getDriver());
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,9500)");
        homePage.clickFooterMyProductOption();
        String expectedHeaderText = "My Products and Services";
        Assert.assertEquals(expectedHeaderText,footer_myProductPage.myProductPageHeaderText());
    }


}
