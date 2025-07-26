package Tests;

import Pages.HomePage;
import Pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase{
    HomePage homePageObj;
    RegistrationPage registrationPageObj;
    @Test
    public void RegistrationsSuccessfully(){
         homePageObj= new HomePage(driver);
        homePageObj.OpenRegistrationPage();
         registrationPageObj=new RegistrationPage(driver);
        registrationPageObj.registration("raghda","hamdy","raghda@gamil.com","123456","123456");

        //Assert.assertEquals(registrationPageObj.registerMSG.getText(),"Your registration completed");
        Assert.assertTrue(registrationPageObj.registerMSG.getText().contains("Your registration completed"));

    }
}
