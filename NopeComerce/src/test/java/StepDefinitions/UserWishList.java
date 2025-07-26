package StepDefinitions;

import Pages.HomePage;
import Pages.WishlistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class UserWishList {

    HomePage homePageObj;
    WishlistPage wishlistPage;

    @When("^user clicks on Add to wishlist on Apple MacBookPro product$")
    public void userClicksOnAddToWishlistOnAppleMacBookProProduct() {
        homePageObj = new HomePage(Hooks.driver);
        homePageObj.addWishlistProduct();

    }

    @And("user clicks on ADD to wishlist")
    public void userClicksOnAddToWishlistButton() {
        wishlistPage = new WishlistPage(Hooks.driver);
        wishlistPage.addProductToWishList();
    }

    @And("a success message should be displayed")
    public void a_success_message_should_be_displayed() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(wishlistPage.addMessage));
        Assert.assertTrue(wishlistPage.addMessage.isDisplayed());
    }
    @And("user clicks on wishlist button")
    public void userClicksOnWishlistButton() {
        wishlistPage.openWishlistPage();
    }
    @And("user clicks on update  the wishlist")
    public void userClicksOnUpdateTheWishlist() {
        wishlistPage.updateList();
    }
    @And("user clicks on send Email from the wishlist")
    public void userClicksOnSendEmailFromTheWishlist() {
        wishlistPage.sendMail("raghdahamdy@gmail.com", "raghdahamdy233@gmail.com", "happy to contact you");
    }
    @And("user clicks on add product to cart")
    public void userClicksOnAddProductToCart() {
        wishlistPage.addcart();
    }
    @And("user clicks on remove product from the wishlist")
    public void userClicksOnRemoveProductFromWishlist() {
        wishlistPage.removeProduct();
    }
    @Then("the system should display a message")
    public void theSystemShouldDisplayAMessage() {
        Assert.assertTrue(wishlistPage.successmessage.isDisplayed());
    }


}
