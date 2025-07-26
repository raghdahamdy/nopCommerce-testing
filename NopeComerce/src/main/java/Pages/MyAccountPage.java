package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountPage extends PageBase {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
@FindBy(linkText = "My account") public WebElement myAccountLink;
@FindBy(xpath = "//input[@data-val-required='First name is required.']") public WebElement firstName;
@FindBy(id = "save-info-button") public WebElement saveBtn;
@FindBy(xpath = "//span[@id='FirstName-error']")public WebElement fNameError;
@FindBy(xpath = "//p[@class='content' and text()='The customer info has been updated successfully.']")public WebElement namedAddedMgs;

    @FindBy(linkText = "Change password") public WebElement passwordLink;
    @FindBy(xpath = "//input[@data-val-required='Old password is required.']") public WebElement oldPassword;
    @FindBy(xpath = "//input[@id='NewPassword']") public WebElement newPassword;
    @FindBy(xpath = "//input[@id='ConfirmNewPassword']") public WebElement confirmPassword;
    @FindBy(xpath = "//button[@class='button-1 change-password-button']") public WebElement changePasswordBtn;
    @FindBy(xpath = "//p[@class='content' and text()='Password was changed']")public WebElement changePassMgs;
    @FindBy(linkText = "Addresses") public WebElement addressLink;
    @FindBy(xpath = "//button[@class='button-2 delete-address-button']") public WebElement deleteBtn;
    @FindBy(xpath = "//button[@class='button-1 add-address-button']")public WebElement addNewAddressBtn;
@FindBy(xpath = "//input[@name='Address.FirstName']")public WebElement fName;
    @FindBy(xpath = "//input[@name='Address.LastName']")public WebElement lName;
    @FindBy(xpath = "//input[@name='Address.Email']")public WebElement mail;
    @FindBy(xpath = "//input[@name='Address.City']")public WebElement city;
    @FindBy(xpath = "//input[@name='Address.Address1']")public WebElement address1;
    @FindBy(xpath = "//input[@name='Address.ZipPostalCode']")public WebElement postal;
    @FindBy(xpath = "//input[@name='Address.PhoneNumber']")public WebElement phone;
    @FindBy(xpath = "//select[@name='Address.CountryId']")public WebElement country;
    @FindBy (xpath = "//button[@class='button-1 save-address-button']")public WebElement saveNewAddressBtn;
@FindBy(xpath = "//p[@class='content' and contains(text(), 'has been added successfully')]") public WebElement addAddMsg;
public void openMyAccount(){
    myAccountLink.click();
}
public void updateNameCustomer(){
    firstName.clear();
    firstName.sendKeys("Lucinda");
    saveBtn.click();
}
    public void emptyFirstName(){
        firstName.clear();
        saveBtn.click();
    }
    public void chanePasswordLink(){
        passwordLink.click();
    }
    public void completeChangePassword(){
    oldPassword.sendKeys("Welcome");
    newPassword.sendKeys("Welcome123");
    confirmPassword.sendKeys("Welcome123");
    changePasswordBtn.click();
    }
    public void clickAddressLink(){
        addressLink.click();
    }
    public void clickDeleteAddress(){
        deleteBtn.click();
    }
    public void addNewAddress(){

        addNewAddressBtn.click();
    }
    public void newAddressData(){
        fName.sendKeys("lucinda");
        lName.sendKeys("hossam");
        mail.sendKeys("lucinda@gmail.com");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(country));
        Select countrySelect = new Select(country);
        countrySelect.selectByVisibleText("Afghanistan");

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("states-loading-progress")));
        city.sendKeys("Helwan");
        address1.sendKeys("omar");
        postal.sendKeys("11311");
        phone.sendKeys("010000000000");
        saveNewAddressBtn.click();
    }

}



