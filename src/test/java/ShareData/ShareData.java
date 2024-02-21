package ShareData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class ShareData {
    private WebDriver driver;

    public void setUP(){
        driver=new ChromeDriver();
        driver.get("https://demoblaze.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void clear()
    {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
