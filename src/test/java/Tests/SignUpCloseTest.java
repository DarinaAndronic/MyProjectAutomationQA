package Tests;

import Pages.SignUP.SignUpClosePage;
import ShareData.ShareData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.time.Duration;

public class SignUpCloseTest extends ShareData {
    @Test
    public void TestMethod(){
        SignUpClosePage signUpClosePage=new SignUpClosePage(getDriver());
        signUpClosePage.clickSignUp();
        signUpClosePage.clickCloseSignUpButton();
    }
}
