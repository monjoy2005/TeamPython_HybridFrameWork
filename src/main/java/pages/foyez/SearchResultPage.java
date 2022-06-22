package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends CommonAPI {


    @FindBy(xpath = "//p[@class='alert alert-warning']")
    private WebElement KeyWordText;

    @FindBy(xpath = "//h1/span[@class='lighter']")
    private WebElement searchedItem;

    @FindBy(css = "span.heading-counter")
    private WebElement noOfFoundResult;

    @FindBy(css="div.product-container")
    private WebElement itemViewer;

    @FindBy(xpath ="(//ul/li[1]/a/img[@class='replace-2x img-responsive'])[1]")
    private WebElement topSellerItem;


    @FindBy(css="div#short_description_block div p")
    private WebElement itemDescription;

    @FindBy(xpath = "//li/a[@title='More about Fashion Manufacturer']")
    private WebElement fashionManu;

    @FindBy(xpath = "//div/h1[@class='page-heading product-listing']")
    private WebElement listOfProductFromFashionManu;

    @FindBy(xpath = "//li/a[@title='More about Fashion Supplier']")
    private WebElement fashionSupplier;

    @FindBy(xpath = "//div/h1[@class='page-heading product-listing']")
    private WebElement listOfProductFromFashionSupplier;

    @FindBy(xpath = "//div/div/div/ul/li/span[@class='grower CLOSE']")
    private WebElement Categories_Women_plus;

    @FindBy(xpath = "(//ul/li/span[@class='grower CLOSE'])[1]")
    private WebElement Categories_Women_Top_plus;
    @FindBy(xpath = "(//a[@href='http://automationpractice.com/index.php?id_category=5&controller=category'])[3]")
    private WebElement Categories_Women_Top_TShirt;

    @FindBy(xpath = "//h1/span[@class='cat-name']")
    private WebElement TShirts; //assertion

    @FindBy(xpath = "(//ul/li/span[@class='grower CLOSE'])[2]")
    private WebElement Categories_Women_Dresses_plus;

    @FindBy(xpath = "(//a[@href='http://automationpractice.com/index.php?id_category=11&controller=category'])[3]")
    private WebElement Categories_Women_Dresses_SummerDresses;

    @FindBy(xpath = "//h1/span[@class='cat-name']")
    private WebElement SummerDresses;  //assertion


    @FindBy(xpath = "//a[@title='Women']")
    private WebElement floatingMenu;

    @FindBy(xpath = "(//a[@title='Casual Dresses'])[1]")
    private WebElement floatingCasual;

    @FindBy(xpath = "//h1/span[@class='cat-name']")
    private WebElement casualAssertion;

    @FindBy(xpath = "(//a[@title='Evening Dresses'])[1]")
    private WebElement floatingEvening;

    @FindBy(xpath = "//h1/span[@class='cat-name']")
    private WebElement eveningAssertion;


    @FindBy(xpath = "(//a[@title='T-shirts'])[1]")
    private WebElement floatingTShirts;

    @FindBy(xpath = "//span[@class='heading-counter']")
    private WebElement floatingTShirtsAssertion;

    @FindBy(css = "h1[itemprop='name']")
    private WebElement fadedShortTShirtAssertion;


    @FindBy(xpath = "(//h5/a[@class='product-name'])[3]")
    private WebElement itemViewFromSide;


















    public SearchResultPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }


//    reusable steps

    public void extendWomen(){
        click(Categories_Women_plus);
    }

    public void hoverOverFloating(WebDriver driver){
        hoverOver(driver,floatingMenu);

    }

    public void clickOnItemViewer(){
        click(itemViewer);
    }

    public void clickOnTopSellerItem(){
        click(topSellerItem);
    }

    public void clickOnFashionManu(){
        click(fashionManu);
    }

    public void clickOnFashionSupplier(){
        click(fashionSupplier);
    }

    public void clickOnCategories_Women_Top_plus(){
        click(Categories_Women_Top_plus);
    }
    public void clickOnCategories_Women_Top_TShirt(){
        click(Categories_Women_Top_TShirt);
    }

    public void clickOnCategories_Women_Dresses_plus(){
        click(Categories_Women_Dresses_plus);
    }

    public void clickOnCategories_Women_Dresses_SummerDresses(){
        click(Categories_Women_Dresses_SummerDresses);
    }

    public void clickOnFloatingCasual(){
        click(floatingCasual);
    }

    public void clickOnFloatingEvening(){
        click(floatingEvening);
    }

    public void clickOnFloatingTShirts(){
        click(floatingTShirts);
    }


    public void clickOnItemFromSide(){
        click(itemViewFromSide);
    }




    public String searchedItemAssertion(){
        return getElementText(searchedItem);
    }

    public String noOfFoundResultHeader(){
        return getElementText(noOfFoundResult);
    }

    public String keyWordTextAssertion(){
       return getElementText(KeyWordText);
    }


    public String itemDescriptionHeader(){
        return getElementText(itemDescription);
    }

    public String listOfProductFromFashionManuAssertion(){
        return getElementText(listOfProductFromFashionManu);
    }

    public String listOfProductionFromFashionSupplierAssertion(){
        return getElementText(listOfProductFromFashionSupplier);
    }

    public String TShirtsHeader(){
        return getElementText(TShirts);
    }

    public String SummerDressesAssertion(){
        return getElementText(SummerDresses);
    }

    public String casualHeader(){
        return getElementText(casualAssertion);
    }

    public String eveningHeader(){
        return getElementText(eveningAssertion);
    }

    public String floatingTShirtHeader(){
        return getElementText(floatingTShirtsAssertion);
    }

    public String fadedShortTShirtHeader(){
        return getElementText(fadedShortTShirtAssertion);
    }


    public void clickOnFloatingMenu(){
        click(floatingMenu);
    }

}
