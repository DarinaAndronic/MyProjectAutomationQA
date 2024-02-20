package Pages.SignUP;

import Pages.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.time.Duration;

public class SignUpClosePage extends BasePage {
    public SignUpClosePage(WebDriver driver){
        super(driver);
    }

    @FindBy(id="signin2")
    private WebElement SignUp;
    @FindBy(xpath ="//*[@id='signInModal']/div/div/div[3]/button[1]")
    private WebElement CloseButton;

    public WebElement getCloseButton() {
        return CloseButton;
    }

    public void clickSignUp (){
        SignUp.click();
    }
    public void clickCloseSignUpButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(CloseButton));
        CloseButton.click();
    }


}
