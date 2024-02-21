package Tests;

import Pages.LogIn.LogInClosePage;
import ShareData.ShareData;
import ShareData.Hooks;
import org.testng.annotations.Test;

public class LogInCloseTest extends Hooks {

    @Test
    public void test_method(){
        LogInClosePage logInClosePage=new LogInClosePage(getDriver());
        logInClosePage.clickLogIn();
        logInClosePage.clickCloseLogIn();
    }
}
