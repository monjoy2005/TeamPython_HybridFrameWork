package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FooterOptionsPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(FooterOptionsPage.class);

@FindBy(xpath = "(//span[@class='grower CLOSE']/following-sibling::a)[1]")
private WebElement womenFromFooter;

@FindBy(css = "a[title='Specials']")
private WebElement special;
@FindBy(css = "a[title='New products']")
private WebElement newProducts;

@FindBy(css = "a[title='Best sellers']")
private WebElement bestSellers;


@FindBy(css = "a[title='Contact us']")
private WebElement contactUs;

@FindBy(css = "a[title='Terms and conditions of use']")
private WebElement termsCondition;

@FindBy(css = "a[title='About us']")
private WebElement aboutUs;


@FindBy(css = "a[title='Sitemap']")
private WebElement siteMap;

@FindBy(css = "a[title='My orders']")
private WebElement order;


@FindBy(css="a[title='My addresses']")
private WebElement addressFooter;

@FindBy(css = "a[title='Manage my personal information']")
private WebElement myPersonalInfoFooter;


    public FooterOptionsPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }


//reusable steps

    public void clickOnFooterWomen(){
        click(womenFromFooter);
        LOG.info("click on footer women success");
    }


    public void clickOnSpecial(){
        click(special);
        LOG.info("click on special success");
    }

    public void clickOnNewProducts(){
        click(newProducts);
        LOG.info("click on new products success");
    }

    public void clickOnBestSeller(){
        click(bestSellers);
        LOG.info("click on best seller success");
    }

    public void clickOnContactUs(){
        click(contactUs);
        LOG.info("click on contact us success");
    }

    public void clickOnTermsCondition(){
        click(termsCondition);
        LOG.info("click on terms condition success");
    }

    public void clickOnAboutUs(){
        click(aboutUs);
        LOG.info("click on about us success");
    }
    public void clickOnSitemap(){
        click(siteMap);
        LOG.info("click on site map success");
    }


    public void clickOnOrder(){
        click(order);
        LOG.info("click on order success");
    }

public void clickOnAddressFooter(){
        click(addressFooter);
    LOG.info("click on address footer success");
}

public void clickOnMyPersonalInfoFooter(){
        click(myPersonalInfoFooter);
    LOG.info("click on my personal info footer success");
}

}
