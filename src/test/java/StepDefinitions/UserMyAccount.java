package StepDefinitions;
import Pages.HomePage;
import Pages.LogInPage;
import Pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class UserMyAccount {

    HomePage homePage;
    LogInPage logInPage;
MyAccountPage myAccountPage;
    @Given("user  logged in")
    public void userLoggedIn() {
        homePage = new HomePage(Hooks.driver);
        homePage.OpenLoginPage();
        logInPage = new LogInPage(Hooks.driver);
        logInPage.logIn("raghda@gmail.com", "Welcome123");
    }

    @When("clicks on my account then clicks on customer info")
    public void clicksOnMyAccountThenClicksOnCustomerInfo() {
        myAccountPage=new MyAccountPage(Hooks.driver);
        myAccountPage.openMyAccount();
    }

    @And("clicks on my account then clicks on Addresses")
    public void clicksOnMyAccountThenClicksOnAddresses() {
        myAccountPage=new MyAccountPage(Hooks.driver);
        myAccountPage.openMyAccount();
        myAccountPage.clickAddressLink();
    }

    @And("user clicks on delete address then save")
    public void userClicksOnDeleteAddressThenSave() {
        myAccountPage.clickDeleteAddress();
        Alert alert = Hooks.driver.switchTo().alert();
        alert.accept();
    }

    @And("user clicks on add new address and enter the new address")
    public void userClicksOnAddNewAddressAndEnterTheNewAddress() {
        myAccountPage.addNewAddress();
        myAccountPage.newAddressData();
    }

    @Then("successfull message will display")
    public void successfullMessageWillDisplay() {
        Assert.assertTrue(myAccountPage.addAddMsg.isDisplayed());
    }


    @And("user can change his first name  then clicks save")
    public void userCanChangeHisFirstNameThenClicksSave() {
        myAccountPage.updateNameCustomer();
        Assert.assertTrue(myAccountPage.namedAddedMgs.isDisplayed());
    }

    @And("user leave his first name  then clicks save")
    public void userLeaveHisFirstNameThenClicksSave() {
        myAccountPage.emptyFirstName();

    }

    @Then("error message will be displayed")
    public void errorMessageWillBeDisplayed() {
        Assert.assertTrue(myAccountPage.fNameError.isDisplayed());
    }
@When("clicks on my account then clicks on change password")
public void clicksOnMyAccountThenClicksOnChangePassword() {
    myAccountPage=new MyAccountPage(Hooks.driver);
    myAccountPage.chanePasswordLink();
}

    @And("user enters old password, new password and confirm password then click on confirm")
    public void userEntersOldPasswordNewPasswordAndConfirmPasswordThenClickOnConfirm() {
        myAccountPage.completeChangePassword();
    }

    @Then("the system will update the new password")
    public void theSystemWillUpdateTheNewPassword() {

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(myAccountPage.changePassMgs));
        Assert.assertTrue(myAccountPage.changePassMgs.isDisplayed());
    }
    
}
