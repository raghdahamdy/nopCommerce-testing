package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage  extends PageBase{

    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@class='search-box-text ui-autocomplete-input']")
    public WebElement searchBox;
    @FindBy(xpath = "//button[@class='button-1 search-box-button']")
    public  WebElement searchBTN;
@FindBy(xpath = "//input[@value='Apple MacBook Pro']")
public WebElement searchRes;
    @FindBy(xpath = "//input[@value='MacBook']")
    public WebElement searchResPrtial;
@FindBy(xpath = "//div[@class='no-result']")
public WebElement errorMessage;


    public void searchProduct(String productName){
        searchBox.sendKeys(productName);
    }
    public void searchWithSpecialCarachter( String specialchar){
        searchBox.sendKeys(specialchar);
    }
    public void searchWithNumbers( String nums){
        searchBox.sendKeys(nums);}

    public void clickSearch(){
       searchBTN.click();
    }

}
