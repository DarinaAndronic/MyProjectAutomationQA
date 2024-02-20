package Pages.SignUP;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpSuccessPage extends BasePage {
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

    public void fillSignUserName(){
        String signUserNameValue="Darina"+System.currentTimeMillis();
        signUserName.sendKeys(signUserNameValue);
    }

    public void fillSignPassword(){
        String signPassValue="123.!";
        signPassword.sendKeys(signPassValue);
    }

    public void clickSignUpButton(){
        SignUpButton.click();
    }
}
