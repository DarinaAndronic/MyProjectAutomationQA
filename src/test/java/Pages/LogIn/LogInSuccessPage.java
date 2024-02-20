package Pages.LogIn;

import ObjectData.LogInSuccesObject;
import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LogInSuccessPage extends BasePage {
    public LogInSuccessPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "login2")
    public WebElement login;

    @FindBy(id = "loginusername")
    public  WebElement loginUsername;

    @FindBy(id = "loginpassword")
    public WebElement loginPassword;

    @FindBy(xpath = "//*[@id=\'logInModal\']/div/div/div[3]/button[2]")
    public WebElement LogInButton;

    @FindBy(id = "nameofuser")
    public WebElement nameofUser;

//    public String loginUsernameValue="darina_test";
//    public String loginPasswordValue="123";

    public void clickLogIn(){
        login.click();
    }

    public void fillLogInPage(LogInSuccesObject logInSuccesObject){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginPassword));
        loginUsername.sendKeys(logInSuccesObject.getLoginUsernameValue());
        loginPassword.sendKeys(logInSuccesObject.getLoginPasswordValue());
    }

    public void clickLoginButton(){
        LogInButton.click();
    }

    public void nameOfUserVisible(LogInSuccesObject logInSuccesObject)
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(nameofUser));
        String welcomeMessage= nameofUser.getText();
        //System.out.println(welcomeMessage);
        Assert.assertEquals("Welcome "+logInSuccesObject.getLoginUsernameValue(), welcomeMessage);
    }
}
