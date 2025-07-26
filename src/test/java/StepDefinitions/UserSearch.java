package StepDefinitions;
import Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class UserSearch {

    SearchPage searchPage;

    @When("user Types Full Name Apple MacBook Pro  in search bar")
    public void userTypesAppleMacBookProInchInSearchBar() {
        searchPage= new SearchPage(Hooks.driver);
        searchPage.searchProduct("Apple MacBook Pro");
    }
    @And("user clicks on  Search button")
    public void userClicksOnSearchButton() {
        searchPage.clickSearch();
    }
    @Then("Product appears in search results")
    public void productAppearsInSearchResults() {
       Assert.assertTrue(searchPage.searchRes.isDisplayed()); ;
    }


    @When("user search using partial product name in search bar")
    public void userSearchUsingPartialProductNameInSearchBar() {
        searchPage.searchProduct(" MacBook ");
    }

    @And("user click on  Search button")
    public void userClickOnSearchButton() {
        searchPage.clickSearch();
    }

    @Then("Product  will appear in search results")
    public void productWillAppearInSearchResults() {
      Assert.assertTrue(searchPage.searchResPrtial.isDisplayed()); ;
    }

    @When("user types MakBook instead of MacBook")
    public void userTypesMakBookInsteadOfMacBook() {
        searchPage.searchProduct("Apple MakBook Pro");
    }

    @And(" a user click on  Search button")
    public void userClickOnsearchButton() {

        searchPage.clickSearch();
    }

    @When("user tries to search with special characters")
    public void userTriesToSearchWithSpecialCharacters() {
        searchPage.searchWithSpecialCarachter("@$&ss77#");
        searchPage.clickSearch();
    }
    @And("user tries to search with numbers")
    public void userTriesToSearchWithNumbers() {
        searchPage.searchWithNumbers("12345678");
        searchPage.clickSearch();
    }

    @Then("an error message will display")
    public void anErrorMessageWillDisplay() {
        Assert.assertTrue(searchPage.errorMessage.isDisplayed()); ;
    }


    @When("The user clicks the search button without entering a keyword")
    public void theUserClicksTheSearchButtonWithoutEnteringAKeyword() {
        searchPage.clickSearch();
    }

    @Then("An alert message should be displayed with text {string}")
    public void anAlertMessageShouldBeDisplayedWithText(String expectedMessage) {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = Hooks.driver.switchTo().alert();
        String actualMessage = alert.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
        alert.accept();
    }

}
