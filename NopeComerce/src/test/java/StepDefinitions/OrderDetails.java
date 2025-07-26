package StepDefinitions;
import Pages.HomePage;
import Pages.LogInPage;
import Pages.OrderDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;



public class OrderDetails {
    HomePage homePage;
    LogInPage logInPage;
    OrderDetailsPage orderDetailsPage;



    @Given("user is logged in ")  // done
    public void userIsOnTheHomePageToAddProductToCart() {
        homePage = new HomePage(Hooks.driver);
        homePage.OpenLoginPage();
        logInPage = new LogInPage(Hooks.driver);
        logInPage.logIn("raghdahossam@gmail.com", "MySecureTest@987");

    }

    @When("the user clicks on the Orders button  then on the Details button")
    public void theUserClicksOnTheOrdersButtonThenOnTheDetailsButton() {
        orderDetailsPage=new OrderDetailsPage(Hooks.driver);
        orderDetailsPage.clickOnOrdersTab();
        orderDetailsPage.clickOnOrderDetailsButton();


    }



    @And("the user clicks on the Print button and print")
    public void theUserClicksOnThePrintButtonAndPrint() {
        orderDetailsPage.clickonPrintButton();
    }

    @And("the user clicks on the reorder button")
    public void theUserClicksOnTheReorderButton() {
orderDetailsPage.reorder();
    }

    @Then("the user redirects to the shopping cart page")
    public void theUserRedirectsToTheShoppingCartPage() {
        Assert.assertTrue(orderDetailsPage.shoppingpage.isDisplayed());
    }
}
    