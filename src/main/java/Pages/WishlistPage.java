package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class WishlistPage extends PageBase {
    public WishlistPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "add-to-wishlist-button-4")
    public WebElement addWishListBtn;


    @FindBy(xpath = "//div[contains(@class,'bar-notification') and contains(@class,'success')]//p")
    public WebElement addMessage;
    @FindBy(xpath = "//ul[@class='list']//a[text()='Wishlist']")
    public WebElement wishlistBtn;

    @FindBy(xpath = "//button[@id='updatecart']")
    public WebElement updateWishListBtn;

    @FindBy(xpath = "//button[@name='addtocartbutton']")
    public WebElement addToCrttBtn;

    @FindBy(xpath = "//button[@class='button-2 email-a-friend-wishlist-button']")
    public WebElement sendEmailBtn;

    @FindBy(xpath = "//input[@name='addtocart']")
    public WebElement checkBox;

    @FindBy(xpath = "//input[@aria-label='Qty.']")
    public WebElement qtyBox;

    @FindBy(id = "FriendEmail")
    public WebElement friendMail;

    @FindBy(id = "YourEmailAddress")
    public WebElement mailaddress;

    @FindBy(id = "PersonalMessage")
    public WebElement personalMsg;

    @FindBy(css = ".button-1.send-email-a-friend-button")
    public WebElement SendBtn;

    @FindBy(xpath = "//h1[text()='Shopping cart']")
    public WebElement successmessage;

    @FindBy(xpath = "(//button[@class='remove-btn'])[1]")
    public WebElement removeBtn;


    public void addProductToWishList() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(addWishListBtn)).click();
    }
    public void openWishlistPage(){

        wishlistBtn.click();
    }

    public void updateList() {
        checkBox.click();
        qtyBox.clear();
        qtyBox.sendKeys("5");
        updateWishListBtn.click();
    }

    public void addcart() {
        checkBox.click();
        addToCrttBtn.click();
    }

    public void sendMail(String friend, String maddress, String msg) {
        sendEmailBtn.click();
        friendMail.clear();
        friendMail.sendKeys(friend);
        mailaddress.clear();
        mailaddress.sendKeys(maddress);
        personalMsg.clear();
        personalMsg.sendKeys(msg);
        SendBtn.click();
    }

    public void removeProduct() {
        removeBtn.click();
    }
}
