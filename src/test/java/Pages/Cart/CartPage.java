package Pages.Cart;

import Pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.lang.reflect.Array;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[5]/div/div[1]/div/a[2]")
    private WebElement PhonesCategory;
    @FindBy(xpath = "/html/body/div[5]/div/div[1]/div/a[3]")
    private WebElement LaptopsCategory;

    @FindBy(xpath = "/html/body/div[5]/div/div[1]/div/a[4]")
    private WebElement MonitorsCategory;

    @FindBy(xpath = "//div[@class='col-lg-4 col-md-6 mb-4']")
    private List<WebElement> PhoneItems;

    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div[2]/div/a")
    private WebElement AddButton;

    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));



    public void clickPhonesCategory(){
        PhonesCategory.click();
    }

    public void clickLaptopsCategory(){
        LaptopsCategory.click();
    }

    public void clickMonitorsCategory(){
        MonitorsCategory.click();
    }

    public void selectPhoneItem(Integer[] indexes){
        for(Integer i=0; i<indexes.length; i++){
            Integer index=indexes[i];
            //wait for Phones to be displayed
            wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("/html/body/div[5]/div/div[2]/div/div[7]/div/div/h4/a")));
            //System.out.println(PhoneItems.size());
            PhoneItems.get(index).click();
            //wair for add button to be visible
            wait.until(ExpectedConditions.visibilityOf(AddButton));

            //click on add to cart
            AddButton.click();
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            String alertmessage = alert.getText();
            Assert.assertEquals(alertmessage, "Product added");

            //click ok alert
            alert.accept();
            driver.navigate().to("https://demoblaze.com/index.html#");
        }
    }

}
