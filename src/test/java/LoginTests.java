import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {
    @Test
    @Parameters({"BaseUrl"})
    public void loginEmptyEmailPassword() {

//      Added ChromeOptions argument below to fix websocket error

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.koel.app/");
        driver.quit();
    }
}