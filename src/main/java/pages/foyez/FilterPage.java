package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FilterPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(FilterPage.class);
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
        LOG.info("click on size check success");
    }

    public void compositionCheck(){
        click(cottonComposition);
        click(polyesterComposition);
        LOG.info("click on composition check success");
    }

    public void casualCheck(){
        click(casualCheckbox);
        LOG.info("click on casual check success");
    }

    public void shortSleeveCheck(){
        click(shortSleeveCheckbox);
        LOG.info("click on short sleeve check success");
    }

    public void manufacturerCheck(){
        click(manufacturerCheckbox);
        LOG.info("click on manufacturer check success");
    }

    public void conditionCheck(){
        click(conditionCheckbox);
        LOG.info("click on condition check success");
    }

    public void stockCheck(){
        click(stockCheckbox);
        LOG.info("click on stock check success");
    }

}
