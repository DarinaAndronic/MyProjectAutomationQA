package Pages.LogIn;

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
    private WebElement login;

    @FindBy(id = "loginusername")
    private WebElement loginUsername;

    @FindBy(id = "loginpassword")
    private WebElement loginPassword;

    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
    private WebElement LogInButton;
    public String loginUsernameValue = "meli";
    public  String loginPasswordValue = "blabla";

    public void clickLogIn() {
        login.click();
    }

    public void fillLogInUsername() {
        loginUsername.sendKeys(loginUsernameValue);
    }

    public void fillLogInPassword() {
        loginPassword.sendKeys(loginPasswordValue);
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


}
