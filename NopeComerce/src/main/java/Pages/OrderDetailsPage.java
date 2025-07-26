package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetailsPage extends PageBase{
    public OrderDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Orders")
    public WebElement ordersTab;

    // "Details" button for latest order
    @FindBy(xpath = "(//button[@class='button-2 order-details-button'])[1]")
    public WebElement detailsBtn;


    @FindBy(xpath = "//a[@class='button-2 print-order-button']")
    public WebElement fisrtprintBtn;
 @FindBy(xpath = "//button[@class='button-1 re-order-button']")public WebElement reorderBtn;
 @FindBy(xpath = "//h1[contains(text(), 'Shopping cart')]") public WebElement shoppingpage;



    public void clickOnOrdersTab() {
        ordersTab.click();
    }

    public void clickOnOrderDetailsButton() {
        detailsBtn.click();
    }

    public void clickonPrintButton() {

        fisrtprintBtn.click();
    }

    public void reorder(){
        reorderBtn.click();
    }
}




