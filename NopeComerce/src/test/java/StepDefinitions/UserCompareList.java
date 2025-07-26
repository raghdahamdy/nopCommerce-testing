package StepDefinitions;
import Pages.CompareListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserCompareList {

   CompareListPage compareListPage;

    @Given("user in the homepage and clicks on compare  button of any product")
    public void userInTheHomepageAndClicksOnCompareButtonOfAnyProduct() {
        compareListPage= new CompareListPage(Hooks.driver);
        compareListPage.addProduct();

    }

    @When("user clicks on the compare list link")
    public void userClicksOnTheCompareListLink() {
        compareListPage.linkCompreList();
    }

    @Then("the product should add to the list successfully")
    public void theProductShouldAddToTheListSuccessfully() {
        Assert.assertTrue(compareListPage.addProductMsg.isDisplayed());
    }

    @And("use can remove the product from the list")
    public void useCanRemoveTheProductFromTheList() {
        compareListPage.removeProduct();
        Assert.assertTrue(compareListPage.removeMsg.isDisplayed());
    }
}
