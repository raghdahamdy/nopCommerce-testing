package StepDefinitions;

import Pages.CartPage;
import Pages.CheckloutPage;
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

public class UserCheckout {
 HomePage homePage;
    CheckloutPage checkloutPage;
    LogInPage logInPage;
    CartPage cartPage;

    @Given("user is logged in")
    public void userIsLoggedIn() {
        homePage = new HomePage(Hooks.driver);
        homePage.OpenLoginPage();
        logInPage = new LogInPage(Hooks.driver);
        logInPage.logIn("raghdahossam@gmail.com", "MySecureTest@987");}

       @When("clicks on the product to add to cart and open shopping cart page")
       public void clicksOnTheProductToAddToCartAndOpenShoppingCartPage() {

       cartPage=new CartPage(Hooks.driver);
       cartPage.AddProductTotheCartFisrt();
       WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));
           wait.until(ExpectedConditions.visibilityOf(cartPage.shoppingCartLink));
       cartPage.shoppingCartLink.click();
   }

   @When("user not click  checkmark agree with the terms of service and  clicks on checkout button")
    public void userNotClickCheckmarkAgreeWithTheTermsOfServiceAndClicksOnCheckoutButton() {
        checkloutPage=new CheckloutPage(Hooks.driver);
        checkloutPage.withoutAgreeCheck();
        Assert.assertTrue(checkloutPage.withoutAgreeBox.isDisplayed());
        checkloutPage.closeAgreeBox.click();
    }

    @And("user  clicks on checks mark agree with the terms of service and  clicks on checkout button")
    public void userClicksOnChecksMarkAgreeWithTheTermsOfServiceAndClicksOnCheckoutButton() {
        checkloutPage=new CheckloutPage(Hooks.driver);
    checkloutPage.AgreeCheck();
    }
    @And("user  enters billing address {string},{string},{string},{string},{string},{string},{string},{string} and clicks on continue")
    public void userEntersBillingAddressAndClicksOnContinue() {
        checkloutPage.successfulCheckout();
    }

    @And("user selects shipping method Click on  Ground  the continue")
    public void userSelectsShippingMethodClickOnGroundTheContinue() {

       checkloutPage.continueShopping();
    }

    @And("user selects payment method  Click on   Check  Money Order  then  continue and confirm order")
    public void userSelectsPaymentMethodClickOnCheckMoneyOrderThenContinueAndConfirmOrder() {
        checkloutPage.firstPayment();
    }


    @Then("success order message should be display {string}")
    public void successOrderMessageShouldBeDisplay(String  expectedhappyMessage) {
        Assert.assertTrue(checkloutPage.expectedhappyMsg.isDisplayed());
    }


    @And("selects Checkout as Guest")
    public void selectsCheckoutAsGuest() {

  checkloutPage.checkoutGuest();
    }


    @And("enters an empty email in the billing address  and tries to continue")
    public void entersAnEmptyEmailInTheBillingAddressAndTriesToContinue() {

checkloutPage.invalidEmialField();
    }

    @Then("the system should display  an error message {string}")
    public void theSystemShouldDisplayAnErrorMessage() {

checkloutPage.invalidemialformatmsg.isDisplayed();
    }


    @When("clicks on cart link  the cart is empty")
    public void clicksOnCartLinkTheCartIsEmpty() {
        checkloutPage=new CheckloutPage(Hooks.driver);
        checkloutPage.emptycartCheckout();
    }


    @Then("the system should display  error message {string}")
    public void theSystemShouldDisplayErrorMessage() {
        Assert.assertTrue(checkloutPage.cartyEmptyMgs.isDisplayed());
    }



}
