package Pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckloutPage extends PageBase{
    public CheckloutPage(WebDriver driver) {
        super(driver);
    }
   @FindBy(xpath = "//input[@id='termsofservice']") public WebElement agreebox;
    @FindBy(xpath = "//button[@title='Close']") public WebElement closeAgreeBox;
    @FindBy(xpath = "//p[text()='Please accept the terms of service before the next step.']") public WebElement withoutAgreeBox;
    @FindBy(xpath = "//button[@class='button-1 checkout-button']") public WebElement checkoutBtn;
    @FindBy(xpath = "//button[@class='button-1 checkout-as-guest-button']") public WebElement checkoutGuestBtn;
    @FindBy(xpath = "//input[@name='BillingNewAddress.FirstName']")public WebElement firstName;
    @FindBy(xpath = "//input[@name='BillingNewAddress.LastName']")public WebElement lasttName;
    @FindBy(xpath = "//input[@name='BillingNewAddress.Email']")public WebElement emaill;
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    public WebElement countryy;
    @FindBy(xpath = "//select[@name='BillingNewAddress_StateProvinceId']")public WebElement statee;
    @FindBy(xpath = "//input[@name='BillingNewAddress.City']")public WebElement cityy;
    @FindBy(xpath = "//input[@name='BillingNewAddress.Address1']")public WebElement address;
    @FindBy(xpath = "//input[@name='BillingNewAddress.ZipPostalCode']")public WebElement postalCode;
    @FindBy(xpath = "//input[@name='BillingNewAddress.PhoneNumber']")public WebElement phonee;
    @FindBy(xpath = "//button[@onclick='Billing.save()']")public WebElement continueBtn;
@FindBy(xpath = "//label[@for='shippingoption_1']")public WebElement groundRadioBtn;
@FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")public WebElement continueShippingBtn;
    @FindBy(xpath = "//input[@value='Payments.CheckMoneyOrder']")public WebElement checkMoneyOrder;
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")public WebElement continuepaymentBtn;

    @FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")public WebElement expectedhappyMsg;
    @FindBy(xpath = "//div[@class='no-data' and contains(text(),'Shopping Cart is empty')]")public WebElement cartyEmptyMgs;
@FindBy(xpath = "//span[@class='cart-label' and text()='Shopping cart']")public WebElement shoppingcartBtn;
@FindBy(xpath = "(//span[@id='BillingNewAddress_Email-error'])[1]") public WebElement invalidemialformatmsg;
// functions
     public void withoutAgreeCheck(){
         checkoutBtn.click();
     }

    public void AgreeCheck(){
        agreebox.click();
        checkoutBtn.click();
    }
public void successfulCheckout(){
    firstName.clear();
         firstName.sendKeys("lucinda");
         lasttName.clear();
    lasttName.sendKeys("hossam");
    emaill.clear();

    emaill.sendKeys("lucinda@gmail.com");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(countryy));
    Select countrySelect = new Select(countryy);
    countrySelect.selectByVisibleText("Afghanistan");

    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("states-loading-progress")));
    cityy.clear();
    cityy.sendKeys("Helwan");
    address.clear();
    address.sendKeys("omar");
    postalCode.clear();
    postalCode.sendKeys("11311");
    phonee.clear();
    phonee.sendKeys("010000000000");
    continueBtn.click();
}
    public void continueShopping(){
        continueBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(groundRadioBtn));
        groundRadioBtn.click();
         continueShippingBtn.click();
    }
public void firstPayment(){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(checkMoneyOrder));
    checkMoneyOrder.click();
    wait.until(ExpectedConditions.elementToBeClickable(continuepaymentBtn));
    continuepaymentBtn.click();
    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout-step-payment-info")));
    WebElement continueBtn = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[contains(@class, 'payment-info-next-step-button')]")
    ));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", continueBtn);
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", continueBtn);
    try {
        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.id("payment-info-please-wait")));
    } catch (Exception ignored) {}
    WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout-step-confirm-order")));
    WebElement confirmBtn = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[contains(@class, 'confirm-order-next-step-button')]")
    ));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", confirmBtn);
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", confirmBtn);
    try {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("confirm-order-please-wait")));
    } catch (Exception ignored) {}

}
public void checkoutGuest(){
    checkoutGuestBtn.click();

}
public void emptycartCheckout(){
    shoppingcartBtn.click();

}
public void invalidEmialField(){
    firstName.clear();
    firstName.sendKeys("lucinda");
    lasttName.clear();
    lasttName.sendKeys("hossam");
    emaill.sendKeys("raghdahossam@gmail.com");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(countryy));
    Select countrySelect = new Select(countryy);
    countrySelect.selectByVisibleText("Afghanistan");

    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("states-loading-progress")));

    continueBtn.click();

}
}
