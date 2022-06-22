package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterPage extends CommonAPI {


@FindBy(css = "#layered_id_attribute_group_3")
public WebElement sizeCheckbox;

@FindBy(css = "#layered_id_feature_5")
public WebElement cottonComposition;
@FindBy(css = "#layered_id_feature_1")
public WebElement polyesterComposition;
@FindBy(css = "#layered_id_feature_11")
public WebElement casualCheckbox;
@FindBy(css = "#layered_id_feature_17")
public WebElement shortSleeveCheckbox;
@FindBy(css = "#layered_manufacturer_1")
public WebElement manufacturerCheckbox;
@FindBy(css = "#layered_condition_new")
public WebElement conditionCheckbox;
@FindBy(css = "#layered_quantity_1")
public WebElement stockCheckbox;



    public FilterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }





    public void sizeCheck(){
          click(sizeCheckbox);
    }

    public void compositionCheck(){
        click(cottonComposition);
        click(polyesterComposition);
    }

    public void casualCheck(){
        click(casualCheckbox);
    }

    public void shortSleeveCheck(){
        click(shortSleeveCheckbox);
    }

    public void manufacturerCheck(){
        click(manufacturerCheckbox);
    }

    public void conditionCheck(){
        click(conditionCheckbox);
    }

    public void stockCheck(){
        click(stockCheckbox);
    }

}
