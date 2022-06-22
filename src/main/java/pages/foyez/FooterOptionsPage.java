package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterOptionsPage extends CommonAPI {



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
    }


    public void clickOnSpecial(){
        click(special);
    }

    public void clickOnNewProducts(){
        click(newProducts);
    }

    public void clickOnBestSeller(){
        click(bestSellers);
    }

    public void clickOnContactUs(){
        click(contactUs);
    }

    public void clickOnTermsCondition(){
        click(termsCondition);
    }

    public void clickOnAboutUs(){
        click(aboutUs);
    }
    public void clickOnSitemap(){
        click(siteMap);
    }


    public void clickOnOrder(){
        click(order);
    }

public void clickOnAddressFooter(){
        click(addressFooter);
}

public void clickOnMyPersonalInfoFooter(){
        click(myPersonalInfoFooter);
}

}
