package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LogInPage extends PageBase{

    public LogInPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="Email")
    public WebElement userName;
    @FindBy(id="Password")
    public WebElement password;

    @FindBy(className="login-button")
    WebElement loginBtn;

    @FindBy(xpath = "//h2[text()='Welcome to our store']")
    public WebElement loginMSG;


    public void logIn(String mail,String pass){
        userName.sendKeys(mail);
        password.sendKeys(pass);
        loginBtn.click();
    }
    public boolean ErrorMessage(String errorLogin){
        List<WebElement> errors= driver.findElements(By.className("message-error validation-summary-errors"));
for (WebElement error :errors){
    if (error.isDisplayed() && error.getText().contains(errorLogin)){
       return true;}
    }
        return false;
}}
