package StepDefinitions;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class UserCart {
    HomePage homePage;
    LogInPage logInPage;
    CartPage cartPage;

    @Given("user is on the home page to add product to cart")
    public void userIsOnTheHomePageToAddProductToCart() {
        homePage = new HomePage(Hooks.driver);
        homePage.OpenLoginPage();
        logInPage = new LogInPage(Hooks.driver);
        logInPage.logIn("raghdahossam@gmail.com", "MySecureTest@987");

    }

    @When("user clicks on a product")
    public void userClicksOnAProduct() {
        cartPage = new CartPage(Hooks.driver);
        cartPage.AddProductTotheCartFisrt();

    }


    @And("use clicks on add to cart button more than one time")
    public void useClicksOnAddToCartButtonMoreThanOneTime() {
                 new WebDriverWait(Hooks.driver, Duration.ofSeconds(20))
                 .until(ExpectedConditions.visibilityOf(cartPage.addCartBtnSmartPhoneProd));
        cartPage.AddProductTotheCartmoreTimes();
        cartPage.AddProductTotheCartmoreTimes();
    }

    @And("selects another product")
    public void selectsAnotherProduct() {
        new WebDriverWait(Hooks.driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(cartPage.addTotheCartFisrtBtn));
        cartPage.addDifferentProducts();

    }
    @Then("the product should add to cart successfully")
    public void theProductShouldAddToCartSuccessfully() {
        cartPage.waitForCartMessageVisible();
        Assert.assertTrue(cartPage.cartMsg.isDisplayed());
    }
    @And("user tries to change quantity of the product")
    public void userTriesToChangeQuantityOfTheProduct() {
    cartPage.changeQuantity("5");
    }

    @And("user checks unit price and total")
    public void userChecksUnitPriceAndTotal() {
        double expectedTotal = cartPage.updatePrice();
        System.out.println("Expected Total Price: $" + expectedTotal);
    }

    @And("user tries to remove product from cart")
    public void userTriesToRemoveProductFromCart() {
      cartPage.remove();
    }

    @And("user tries to apply valid coupon code")
    public void userTriesToApplyValidCouponCode() {
    cartPage.applyDiscount("TEST10");
    Assert.assertTrue(cartPage.happydiscountMsg.isDisplayed());

    }

    @And("user tries to apply invalid coupon code")
    public void userTriesToApplyInvalidCouponCode() {
    cartPage.applyinvalidDiscount("test");
    Assert.assertTrue(cartPage.unhappydiscountMsg.isDisplayed());
    }

    @And("user tries to add maximum  quantity of the product")
    public void userTriesToAddMaximumQuantityOfTheProduct() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(cartPage.shoppingCartLink));

        cartPage.addMaxQuantity("11000");
    }

    @Then("an error message will be display")
    public void anErrorMessageWillBeDisplay() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(cartPage.addMaxQuantityMsg));
        Assert.assertTrue(cartPage.addMaxQuantityMsg.isDisplayed());
    }


}
