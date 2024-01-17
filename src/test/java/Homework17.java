
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Homework17 extends BaseTest{

    @Test
   public void addSongToPlaylist() throws InterruptedException {
        String expectedSongAddedMessage = "Added 1 song into \"Test.\"";

        //navigateToUrl();
        enterEmail("salim.saiyed@testpro.io");
        enterPassword("SXTImuRs");
        clickSubmit();
        Thread.sleep(2000);
        searchField("Dark days");
        clickViewAllBtn();
        selectFirstSongResult();
        clickAddToBtn();
        choosePlaylist();
        Assert.assertEquals(getAddToPlaylistSuccessMsg(),expectedSongAddedMessage);
    }

    public String getAddToPlaylistSuccessMsg(){
        WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
        return notification.getText();
    }
    public void choosePlaylist() {
        WebElement playlist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='songResultsWrapper']//li[contains(text(),'Test')]")));
        playlist.click();

    }


    public void clickAddToBtn() {
        WebElement addToBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-test='add-to-btn']")));
        addToBtn.click();
    }

    public void selectFirstSongResult() {
        WebElement firstSong = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//section[@id='songResultsWrapper']//tr[@class='song-item'][1]")));
        firstSong.click();
    }

    public void searchField(String song) {
        WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("input[type='search']")));
        searchField.clear();
        searchField.sendKeys(song);
    }

    public void clickViewAllBtn() {
        WebElement clickBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-test='view-all-songs-btn']")));
        clickBtn.click();

    }

}
