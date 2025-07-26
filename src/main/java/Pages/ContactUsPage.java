package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ContactUsPage extends PageBase{

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "FullName")
    WebElement nameField;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(id = "Enquiry")
    WebElement enquiryField;

    @FindBy(name = "send-email")
    WebElement submitBtn;

    @FindBy(css = "div.result")
    public WebElement sendEnquiryMgs;

    @FindBy(className = "field-validation-error")
    List<WebElement> allErrors;

    public void EnquiryMsg(String name, String email, String enquiry) {
        nameField.sendKeys(name);
        emailField.sendKeys(email);
        enquiryField.sendKeys(enquiry);
        submitBtn.click();
    }
    public boolean errorContactUsMsg(String expectedError) {
        for (WebElement error : allErrors) {
            if (error.isDisplayed() && error.getText().contains(expectedError)) {
                return true;
            }
        }
        return false;
    }
}
