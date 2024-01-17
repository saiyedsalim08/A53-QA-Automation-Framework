import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


@Test

public class Homework21 extends BaseTest {
    String newPlaylistName = "Old";

    public void renamePlaylist() {

        String playlistEditedMessage = "Updated playlist \"Old.\"";
        enterEmail("salim.saiyed@testpro.io");
        enterPassword("SXTImuRs");
        clickSubmit();
        clickOnPlaylist();
        enterNewPlaylistName();
        Assert.assertEquals(playlistEditedSuccessMsg(),playlistEditedMessage);

    }


    private void clickOnPlaylist() {

        WebElement playlist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(3)")));
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();
    }

    public void enterNewPlaylistName(){
        WebElement playlist = driver.findElement(By.cssSelector("[name='name']"));
        playlist.sendKeys(Keys.chord(Keys.COMMAND,"A",Keys.DELETE));
        playlist.sendKeys(newPlaylistName);
        playlist.sendKeys(Keys.RETURN);
    }

    public String playlistEditedSuccessMsg() {
        WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
        return notification.getText();
    }
}
