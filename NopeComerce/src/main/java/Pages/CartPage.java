package Pages;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage extends PageBase{
    public CartPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "(//button[@class='button-2 product-box-add-to-cart-button'])[2]")
    public WebElement addTotheCartFisrtBtn; //  f btn makbook
    @FindBy(xpath = "//button[@id='add-to-cart-button-4']")
    public WebElement addTotheCartSecondBtn;  //s btn mac

    @FindBy(xpath = "//div[@data-close='Close']")
    public WebElement backBtn;
    @FindBy(xpath = "(//button[@class='button-2 product-box-add-to-cart-button'])[3]")
    public WebElement addCartBtnSmartPhoneProd;  // smartphone
    @FindBy(xpath = "//span[@class='cart-label']")
    public WebElement shoppingCart;

    @FindBy(xpath = "//a[text()='shopping cart']")
    public WebElement shoppingCartLink;

    @FindBy(xpath = "//h1[text()='Shopping cart']")
    public WebElement cartMsg;
 @FindBy(xpath = "(//input[@aria-label='Qty.'])[1]")
 public WebElement quantityBox;

 @FindBy(xpath = "(//input[@aria-label='Qty.'])[1]")
 public WebElement maxqtybox;
 @FindBy(xpath = "(//span[@class='product-subtotal'])[1]")
 public  WebElement firstProdPrice;
    @FindBy(xpath = "(//span[@class='product-subtotal'])[2]")
    public  WebElement secondProdPrice;
    @FindBy(xpath = "(//button[@class='remove-btn'])[1]")
 public  WebElement removeBtn;
    @FindBy(xpath = "//input[@name='discountcouponcode']")
public WebElement dicountBox;
    @FindBy(xpath = "//button[@name='applydiscountcouponcode']")
    public WebElement applyBtn;

    @FindBy(xpath ="//div[@class='message-success']" )
    public WebElement happydiscountMsg;
    @FindBy(xpath ="(//div[@class='message-failure'])[2]" )
    public WebElement unhappydiscountMsg;

    @FindBy(xpath = "//button[@name='removediscount-4']")
    public WebElement removeDiscountBTN;

    @FindBy(xpath = "//li[text()='The maximum quantity allowed for purchase is 10000.']")
    public WebElement addMaxQuantityMsg;
    @FindBy(xpath = "//span[@class='sku-number']")
    public WebElement body ;

    public void AddProductTotheCartFisrt()  //done
    {
        addCartBtnSmartPhoneProd.click();
    }
    public void AddProductTotheCartmoreTimes( ) //done
    {
        addCartBtnSmartPhoneProd.click();

    }

public void addDifferentProducts()//done
{
    backBtn.click();
    addTotheCartFisrtBtn.click();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOf(addTotheCartSecondBtn));
    addTotheCartSecondBtn.click();
    shoppingCart.click();
}
    public void waitForCartMessageVisible() //done
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(cartMsg));
    }
public void changeQuantity(String qty ){
    quantityBox.sendKeys(qty);
    shoppingCart.click();
}
    public double updatePrice(){
        String firstText = firstProdPrice.getText();
        String secondText = secondProdPrice.getText();
        double first = Double.parseDouble(firstText.replace("$", "").replace(",", "").trim());
        double second = Double.parseDouble(secondText.replace("$", "").replace(",", "").trim());

        return first +second;
    }
    public void remove(){
        removeBtn.click();
    }

    public void applyDiscount(String validdiscount){
        dicountBox.sendKeys(validdiscount);
        applyBtn.click();

    }
    public void applyinvalidDiscount(String invaliddiscount){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(removeDiscountBTN));
        removeDiscountBTN.click();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait2.until(ExpectedConditions.visibilityOf(dicountBox));
        dicountBox.sendKeys(invaliddiscount);
        applyBtn.click();
    }
    public void addMaxQuantity(String maxQty ){

        shoppingCartLink.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(maxqtybox));

        maxqtybox.sendKeys(maxQty);
        body.click();

    }}

