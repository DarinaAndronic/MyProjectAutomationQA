package Tests;

import ObjectData.LogInSuccesObject;
import Pages.LogIn.LogInSuccessPage;
import ShareData.ShareData;
import org.openqa.selenium.Alert;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class LogInSuccesTest extends Hooks {
    @Test
    public void Test_method() {

        LogInSuccesObject logInSuccesObject=new LogInSuccesObject(testData);
        LogInSuccessPage logInSuccessPage = new LogInSuccessPage(getDriver());
        logInSuccessPage.clickLogIn();
        logInSuccessPage.fillLogInPage(logInSuccesObject);
        logInSuccessPage.clickLoginButton();
        logInSuccessPage.nameOfUserVisible(logInSuccesObject);
    }
}

