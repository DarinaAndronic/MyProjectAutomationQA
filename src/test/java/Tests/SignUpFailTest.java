package Tests;

import Pages.SignUP.SignUpFailPage;
import Pages.SignUP.SignUpSuccessPage;
import ShareData.ShareData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignUpFailTest extends ShareData {
    @Test
    public void TestMethod() {
        SignUpFailPage signUpFailPage = new SignUpFailPage(getDriver());
        signUpFailPage.clickSignUp();
        signUpFailPage.fillSignUserName();
        signUpFailPage.fillSignPassword();
        signUpFailPage.clickSignUpButton();
        signUpFailPage.signUpFailmessage();

//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
//
//        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//        String alertmessage = alert.getText();
//        Assert.assertEquals(alertmessage, "This user already exist.");
//        alert.accept();
    }
}