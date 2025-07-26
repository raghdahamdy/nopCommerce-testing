import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class FirstClas {
    public FirstClas() {
    }
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/dropdowns/");
       // driver.get("https://www.linkedin.com/feed/");
        //driver.manage().window().fullscreen();
        //driver.navigate().back();
        WebElement dropdown = driver.findElement(By.id("fruits"));
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // WebElement dropdown = wait.until(
        // ExpectedConditions.visibilityOfElementLocated(By.id("fruits")));
        Select select = new Select(dropdown);
        select.selectByValue("0");
        @FindBy ( id = "password")
                WebElement lgn;

}}
