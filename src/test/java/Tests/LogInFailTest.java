package Tests;

import ObjectData.LogInFailObject;
import Pages.LogIn.LogInFailPage;
import ShareData.ShareData;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class LogInFailTest extends Hooks {

    @Test
    public void test_method() {

        LogInFailObject logInFailObject=new LogInFailObject(testData);
        LogInFailPage logInFailPage = new LogInFailPage(getDriver());
        logInFailPage.clickLogIn();
        logInFailPage.fillLogInPage(logInFailObject);
        logInFailPage.clickLoginButton();
        logInFailPage.signInFailmessage();
        logInFailPage.clickCloseLogIn();
    }
}
