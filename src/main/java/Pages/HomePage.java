package Pages;

import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver){
        super(driver);}
    @FindBy(linkText = "Register")
    WebElement Register;

    @FindBy(linkText = "Log in")
    WebElement LoginBtn;
    @FindBy(xpath = "//div[@class='footer']//a[@href='/contactus']")
    public WebElement contactusbtn;

    @FindBy(xpath ="(//button[@class='button-2 add-to-wishlist-button'])[2]")
    public WebElement addProduct;


    //functions
    public void OpenRegistrationPage(){
        Register.click();}

        public void OpenLoginPage(){
            LoginBtn.click();
    }
    public void OpenContactUsPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(contactusbtn));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center'});", contactusbtn);
        wait.until(ExpectedConditions.elementToBeClickable(contactusbtn)).click();
    }
    public void addWishlistProduct(){
        addProduct.click();
    }


}



