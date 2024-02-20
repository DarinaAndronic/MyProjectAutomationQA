package Pages.LogIn;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogInClosePage extends BasePage {
    public LogInClosePage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "login2")
    private WebElement login;

    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[1]")
    private WebElement closebutton;

    public WebElement getClosebutton(){
        return closebutton;
    }
    public void clickLogIn(){
        login.click();
    }
    public void clickCloseLogIn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(closebutton));
        closebutton.click();
    }
}
