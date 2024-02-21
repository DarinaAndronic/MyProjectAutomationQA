package Pages.SignUP;

import ObjectData.LogInSuccesObject;
import ObjectData.SignUpSuccesObject;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpSuccessPage extends BasePage {
    // test
    public SignUpSuccessPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id="signin2")
    private WebElement SignUp;

    @FindBy(id="sign-username")
    private WebElement signUserName;

    @FindBy(id="sign-password")
    private WebElement signPassword;

    @FindBy(xpath ="//*[@id='signInModal']/div/div/div[3]/button[2]")
    private WebElement SignUpButton;

    public void clickSignUp (){
        SignUp.click();
    }

//    public void fillSignUserName(){
//        String signUserNameValue=UserNameValue+System.currentTimeMillis();
//        signUserName.sendKeys(signUserNameValue);
//    }
//
//    public void fillSignPassword(){
//        signPassword.sendKeys(signPassValue);
//    }

    public void fillSignUpPage(SignUpSuccesObject signUpSuccesObject){
        signUserName.sendKeys(signUpSuccesObject.getUserNameValue()+System.currentTimeMillis());
        signPassword.sendKeys(signUpSuccesObject.getSignPassValue());
    }

    public void clickSignUpButton(){
        SignUpButton.click();
    }
}
