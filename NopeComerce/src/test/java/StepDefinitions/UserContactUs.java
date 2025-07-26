package StepDefinitions;

import Pages.ContactUsPage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class UserContactUs {

    HomePage homePageObj;
    ContactUsPage contactUsPage;

    @When("user clicks on the Contact button")
    public void userClicksOnTheContactButton() {
        homePageObj = new HomePage(Hooks.driver);
        homePageObj.OpenContactUsPage();
    }

    @And("user can send Message to the admin")
    public void userCanSendMessageToTheAdmin() {
        contactUsPage = new ContactUsPage(Hooks.driver);
        contactUsPage.EnquiryMsg("Raghda", "Raghda@gmail.com", "update my personal info");
    }

    @Then("success message should be displayed")
    public void successMessageShouldBeDisplayed() {


        new WebDriverWait(Hooks.driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.visibilityOf(contactUsPage.sendEnquiryMgs));

        Assert.assertTrue(
                contactUsPage.sendEnquiryMgs.getText().contains("Your enquiry has been successfully sent to the store owner"),
                "Expected success message not displayed."
        );
    }

    @And("user enters {string},{string},{string}")
    public void userEnters(String yourName, String yourEmail, String enquiry) {

        contactUsPage.EnquiryMsg(yourName, yourEmail, enquiry);
    }



    @Then("contact error message {string} should be displayed")
    public void contactErrorMessageShouldBeDisplayed(String unsuccessfullMsg) {


        Assert.assertTrue(
                contactUsPage.errorContactUsMsg(unsuccessfullMsg),
                "Expected error message not found: " + unsuccessfullMsg
        );
    }
}