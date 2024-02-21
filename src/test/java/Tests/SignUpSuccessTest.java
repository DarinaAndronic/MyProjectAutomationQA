package Tests;

import ObjectData.SignUpSuccesObject;
import Pages.SignUP.SignUpSuccessPage;
import ShareData.ShareData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ShareData.Hooks;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignUpSuccessTest extends Hooks {
    @Test
    public void TestMethod(){
        SignUpSuccesObject signUpSuccesObject=new SignUpSuccesObject(testData);
        SignUpSuccessPage signUpPageSuccess=new SignUpSuccessPage(getDriver());
        signUpPageSuccess.clickSignUp();
        signUpPageSuccess.fillSignUpPage(signUpSuccesObject);
        signUpPageSuccess.clickSignUpButton();

        WebDriverWait wait=new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        Alert alert=wait.until(ExpectedConditions.alertIsPresent());
        String alertmessage=alert.getText();
        Assert.assertEquals(alertmessage,"Sign up successful.");
        alert.accept();
    }
}
