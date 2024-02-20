package Tests;

import Pages.LogIn.LogInFailPage;
import ShareData.ShareData;
import org.testng.annotations.Test;

public class LogInFailTest extends ShareData {

    @Test
    public void test_method() {

        LogInFailPage logInFailPage = new LogInFailPage(getDriver());
        logInFailPage.clickLogIn();
        logInFailPage.fillLogInUsername();
        logInFailPage.fillLogInPassword();
        logInFailPage.clickLoginButton();
        logInFailPage.signInFailmessage();
    }
}
