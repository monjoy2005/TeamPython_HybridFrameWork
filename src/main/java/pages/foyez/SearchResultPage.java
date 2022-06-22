package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchResultPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(SearchResultPage.class);
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
        LOG.info("extend women success");
    }

    public void hoverOverFloating(WebDriver driver){
        hoverOver(driver,floatingMenu);
        LOG.info("hover over success");

    }

    public void clickOnItemViewer(){
        click(itemViewer);
        LOG.info("click on item viewer success");
    }

    public void clickOnTopSellerItem(){
        click(topSellerItem);
        LOG.info("click on top seller item success");
    }

    public void clickOnFashionManu(){
        click(fashionManu);
        LOG.info("click on fashion manufacturer success");
    }

    public void clickOnFashionSupplier(){
        click(fashionSupplier);
        LOG.info("click on fashion supplier success");
    }

    public void clickOnCategories_Women_Top_plus(){
        click(Categories_Women_Top_plus);
        LOG.info("click on categories women top plus success");
    }
    public void clickOnCategories_Women_Top_TShirt(){
        click(Categories_Women_Top_TShirt);
        LOG.info("click on categories women top T-shirt success");
    }

    public void clickOnCategories_Women_Dresses_plus(){
        click(Categories_Women_Dresses_plus);
        LOG.info("click on categories women dresses plus success");
    }

    public void clickOnCategories_Women_Dresses_SummerDresses(){
        click(Categories_Women_Dresses_SummerDresses);
        LOG.info("click on categories women dresses summerDresses success");
    }

    public void clickOnFloatingCasual(){
        click(floatingCasual);
        LOG.info("click on floating casual success");
    }

    public void clickOnFloatingEvening(){
        click(floatingEvening);
        LOG.info("click on floating evening success");
    }

    public void clickOnFloatingTShirts(){
        click(floatingTShirts);
        LOG.info("click on floating T-shirts success");
    }


    public void clickOnItemFromSide(){
        click(itemViewFromSide);
        LOG.info("click on item from side success");
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
        LOG.info("click on floating menu success");
    }

}
