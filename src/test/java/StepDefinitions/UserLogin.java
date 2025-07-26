package StepDefinitions;

import Pages.HomePage;
import Pages.LogInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserLogin  {
    HomePage homePageObj;
    LogInPage logInPageObj;

    @Given("the user is on the home page")
    public void userIsOnhomePagelogin() {
        System.out.println("User navigated to login page.");
    }

    @When("the user clicks on the login button")
    public void userClicksLogin() {
        homePageObj = new HomePage(Hooks.driver);
        homePageObj.OpenLoginPage();
        System.out.println("User clicked on login.");

    }

    @And("the user enters a valid username and password")
    public void userEntersValidCredentials() {

        logInPageObj = new LogInPage(Hooks.driver);
        logInPageObj.logIn("raghdahossam@gmail.com", "MySecureTest@987");
        System.out.println("User entered valid registration credentials.");
    }

    @Then("the user should be logged in successfully")
    public void userRegisteredSuccessfully() {
        Assert.assertTrue(logInPageObj.loginMSG.getText().contains("Welcome to our store"));
        System.out.println("Your login completed");
    }

    @And("the user enters {string},{string}")
    public void theUserEnters(String Email, String Password) {
        logInPageObj.userName.clear();
        logInPageObj.password.clear();
        logInPageObj.logIn(Email,Password);
    }

    @Then("error message{string} should be displayed")
    public void errorMessageShouldBeDisplayed(String errorLogin) {
        Assert.assertTrue(logInPageObj.ErrorMessage(errorLogin),"Expected error message not found: "+errorLogin);
    }


}