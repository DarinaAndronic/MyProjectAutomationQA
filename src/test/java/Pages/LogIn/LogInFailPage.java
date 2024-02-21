package Pages.LogIn;

import ObjectData.LogInFailObject;
import ObjectData.LogInSuccesObject;
import Pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LogInFailPage extends BasePage {
    public LogInFailPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "login2")
    public WebElement login;

    @FindBy(id = "loginusername")
    public WebElement loginUsername;

    @FindBy(id = "loginpassword")
    public WebElement loginPassword;

    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
    public WebElement LogInButton;

    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[1]")
    private WebElement closebutton;

//    public String loginUsernameValue = "meli";
//    public  String loginPasswordValue = "blabla";

    public void clickLogIn() {
        login.click();
    }

//
public void fillLogInPage(LogInFailObject logInFailObject) {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOf(loginPassword));
    loginUsername.sendKeys(logInFailObject.getLoginUsernameValue());
    loginPassword.sendKeys(logInFailObject.getLoginPasswordValue());
}

    public void clickLoginButton() {
        LogInButton.click();
    }

    public void signInFailmessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertmessage = alert.getText();
        Assert.assertEquals(alertmessage, "Wrong password.");
        alert.accept();
    }

    public void clickCloseLogIn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(closebutton));
        closebutton.click();
    }


}
