import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {
    @Test(enabled = false)
    public void loginEmptyEmailPassword() {

//      Added ChromeOptions argument below to fix websocket error
        launchBrowser();
        navigateToUrl();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.koel.app/#!/home");
        driver.quit();
    }
}