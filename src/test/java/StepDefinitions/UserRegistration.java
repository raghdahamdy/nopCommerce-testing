package StepDefinitions;

import Pages.HomePage;
import Pages.RegistrationPage;
import Tests.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserRegistration {
    HomePage homePageObj;
    RegistrationPage registrationPageObj;

    @Given("user is on the home page")
    public void userIsOnhomePageregister() {
        System.out.println("User navigated to register page.");
    }

    @When("user clicks on the register button")
    public void userClicksRegister() {
        homePageObj= new HomePage(Hooks.driver);
        homePageObj.OpenRegistrationPage();
        System.out.println("User clicked on register.");
    }

    @When("user enters valid credentials")
    public void userEntersValidCredentials() {
        registrationPageObj=new RegistrationPage(Hooks.driver);
        registrationPageObj.registration("raghda","hamdy","raghdaaaaa1345@gamil.com","123456","123456");
        System.out.println("User entered valid registration credentials.");
    }

    @Then("user should be registered successfully")
    public void userRegisteredSuccessfully() {
               Assert.assertTrue(registrationPageObj.registerMSG.getText().contains("Your registration completed"));
        System.out.println("Your registration completed");

    }

    @And("user enters {string},{string},{string},{string},{string}")
    public void userEnters(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {

        registrationPageObj.fName.clear();
        registrationPageObj.lName.clear();
        registrationPageObj.email.clear();
        registrationPageObj.password.clear();
        registrationPageObj.conpassword.clear();
        registrationPageObj.registration(FirstName,LastName,Email,Password,ConfirmPassword);
    }

    @Then("error message {string} should be displayed")
    public void errorMessageShouldBeDisplayed(String expectedError) {

        Assert.assertTrue(registrationPageObj.isErrorMessageDisplayed(expectedError),
                "Expected error message not found: " + expectedError);;

     ;
    }





}

