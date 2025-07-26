package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CompareListPage extends PageBase{
    public CompareListPage(WebDriver driver) {
        super(driver);
    }
@FindBy(xpath = "(//button[@title='Add to compare list'])[3]")
    public WebElement addProductToCompre;
@FindBy(linkText = "product comparison")
    public WebElement productComparionLink;
@FindBy(xpath = "//h1[text()='Compare products']")
    public WebElement addProductMsg;
@FindBy(xpath = "//button[@class='button-2 remove-button']")
    public WebElement removveButton;
@FindBy(xpath = "//div[@class='no-data']")
    public WebElement removeMsg;
public void addProduct(){
    addProductToCompre.click();
}
    public void linkCompreList(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(productComparionLink));

    productComparionLink.click();
    }
  public void removeProduct(){
      removveButton.click();

  }
}
