import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework16 extends BaseTest{

    @Test(enabled = false)
    public void registrationNavigation(){
        //Added ChromeOptions argument below to fix websocket error
        launchBrowser();
        navigateToUrl();

        WebElement registrationUrl = driver.findElement(By.cssSelector("a[href]"));
        registrationUrl.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa.koel.app/registration");
        
    }
}

