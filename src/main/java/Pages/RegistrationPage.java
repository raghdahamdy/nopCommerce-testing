package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegistrationPage extends PageBase{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "gender-female")
    public WebElement radioBtn;
    @FindBy(id = "FirstName")
    public WebElement fName;
    @FindBy(id = "LastName")
    public WebElement lName;
    @FindBy(id = "Email")
    public WebElement email;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(id = "ConfirmPassword")
    public WebElement conpassword;
    @FindBy(id = "register-button")
    public  WebElement register;
    @FindBy(className =  "result")
    public WebElement registerMSG;


    public void registration(String first,String second,String mail,String pass , String conPass){
        radioBtn.click();
        fName.sendKeys(first);
        lName.sendKeys(second);
        email.sendKeys(mail);
        password.sendKeys(pass);
        conpassword.sendKeys(conPass);
        register.click();
    }
    public boolean isErrorMessageDisplayed(String expectedError) {
        List<WebElement> allErrors = driver.findElements(By.className("field-validation-error"));

        for (WebElement error : allErrors) {
            if (error.isDisplayed() && error.getText().contains(expectedError)) {
                return true;
            }
        }
        return false;
    }

}
