package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.FilterPage;
import pages.foyez.HomePage;
import pages.foyez.SearchResultPage;

public class FilterTest extends CommonAPI {


    @Test(enabled = false)
    public void checkboxForSize(){

        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        FilterPage filterPage=new FilterPage(getDriver());
        searchResultPage.clickOnFloatingMenu();
        filterPage.sizeCheck();
        Assert.assertTrue(checkBoxIsChecked(filterPage.sizeCheckbox));

    }

    @Test(enabled = false)
    public void checkboxForComposition(){
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        FilterPage filterPage=new FilterPage(getDriver());
        searchResultPage.clickOnFloatingMenu();
        filterPage.compositionCheck();
        Assert.assertTrue(checkBoxIsChecked(filterPage.cottonComposition));
        Assert.assertTrue(checkBoxIsChecked(filterPage.polyesterComposition));
    }

    @Test(enabled = false)
    public void checkboxForStyle(){
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        FilterPage filterPage=new FilterPage(getDriver());
        searchResultPage.clickOnFloatingMenu();
        filterPage.casualCheck();
        Assert.assertTrue(checkBoxIsChecked(filterPage.casualCheckbox));
    }

    @Test(enabled = false)
    public void checkboxForProperties(){
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        FilterPage filterPage=new FilterPage(getDriver());
        searchResultPage.clickOnFloatingMenu();
        filterPage.shortSleeveCheck();
        Assert.assertTrue(checkBoxIsChecked(filterPage.shortSleeveCheckbox));
    }

    @Test(enabled = false)
    public void checkboxForManufacturer(){
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        FilterPage filterPage=new FilterPage(getDriver());
        searchResultPage.clickOnFloatingMenu();
        filterPage.manufacturerCheck();
        Assert.assertTrue(checkBoxIsChecked(filterPage.manufacturerCheckbox));

    }

    @Test(enabled = false)
    public void checkboxForCondition(){
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        FilterPage filterPage=new FilterPage(getDriver());
        searchResultPage.clickOnFloatingMenu();
        filterPage.conditionCheck();
        Assert.assertTrue(checkBoxIsChecked(filterPage.conditionCheckbox));
    }

    @Test(enabled = false)
    public void checkboxForAvailability(){
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        FilterPage filterPage=new FilterPage(getDriver());
        searchResultPage.clickOnFloatingMenu();
        filterPage.stockCheck();
        Assert.assertTrue(checkBoxIsChecked(filterPage.stockCheckbox));

    }

    @Test
    public void multipleCheckbox(){
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        FilterPage filterPage=new FilterPage(getDriver());
        searchResultPage.clickOnFloatingMenu();
        filterPage.compositionCheck();
        filterPage.casualCheck();
        filterPage.shortSleeveCheck();
        Assert.assertTrue(checkBoxIsChecked(filterPage.cottonComposition));
        Assert.assertTrue(checkBoxIsChecked(filterPage.polyesterComposition));
        Assert.assertTrue(checkBoxIsChecked(filterPage.casualCheckbox));
        Assert.assertTrue(checkBoxIsChecked(filterPage.shortSleeveCheckbox));

    }






}
