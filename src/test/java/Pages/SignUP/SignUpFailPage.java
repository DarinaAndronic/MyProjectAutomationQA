package Pages.SignUP;

import Pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SignUpFailPage extends BasePage {
    public SignUpFailPage(WebDriver driver){
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

    public String signUserNameValue="Darina";
    public String signPassValue="123.!";

    public void clickSignUp (){
        SignUp.click();
    }

    public void fillSignUserName(){
        signUserName.sendKeys(signUserNameValue);
    }

    public void fillSignPassword(){
        signPassword.sendKeys(signPassValue);
    }

    public void clickSignUpButton(){
        SignUpButton.click();
    }

    public void signUpFailmessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertmessage = alert.getText();
        Assert.assertEquals(alertmessage, "This user already exist.");
        alert.accept();
    }
}
