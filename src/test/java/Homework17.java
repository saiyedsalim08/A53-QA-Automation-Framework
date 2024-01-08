
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Homework17 extends BaseTest{

    @Test
   public void addSongToPlaylist() throws InterruptedException {
        String expectedSongAddedMessage = "Added 1 song into \"Test.\"";

        navigateToUrl();
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
        WebElement notification = driver.findElement(By.cssSelector("div.success.show"));
        return notification.getText();
    }
    public void choosePlaylist() throws InterruptedException {
        WebElement playlist = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//li[contains(text(),'Test')]"));
        playlist.click();
        Thread.sleep(2000);
    }


    public void clickAddToBtn() throws InterruptedException {
        WebElement addToBtn = driver.findElement(By.xpath("//button[@data-test='add-to-btn']"));
        addToBtn.click();
        Thread.sleep(2000);
    }
    public void selectFirstSongResult() throws InterruptedException {
        WebElement firstSong = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//tr[@class='song-item'][1]"));
        firstSong.click();
        Thread.sleep(2000);
    }

    public void searchField(String song) throws InterruptedException{
        WebElement searchField = driver.findElement(By.cssSelector("input[type='search']"));
        searchField.clear();
        searchField.sendKeys(song);
        Thread.sleep(2000);
    }

    public void clickViewAllBtn() throws InterruptedException{
        WebElement clickBtn = driver.findElement(By.xpath("//button[@data-test='view-all-songs-btn']"));
        clickBtn.click();
        Thread.sleep(2000);
    }

}
