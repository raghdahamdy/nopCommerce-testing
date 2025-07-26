package Tests;

import Pages.HomePage;
import Pages.LogInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends TestBase{
    HomePage homePageObj;
    LogInPage logInPageObj;
    @Test
    public void LogInSuccessfully(){
      homePageObj= new HomePage(driver);
        homePageObj.OpenLoginPage();
        logInPageObj=new LogInPage(driver);
        logInPageObj.logIn("raghda@gmail.com","123456");
        Assert.assertTrue(logInPageObj.loginMSG.getText().contains("Welcome to our store"));

    }
}
