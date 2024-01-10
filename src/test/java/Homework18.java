import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest {
    @Test

    public void playSong() {
        navigateToUrl();
        enterEmail("salim.saiyed@testpro.io");
        enterPassword("SXTImuRs");
        clickSubmit();
        playNextBtn();
        isSongPlaying();

    }

    public void playNextBtn() {
        WebElement playNextSong = driver.findElement(By.xpath("//i[@data-testid='play-next-btn']"));
        WebElement playBtn = driver.findElement(By.xpath("//span[@data-testid='play-btn']"));

        playNextSong.click();
        playBtn.click();

    }


    public boolean isSongPlaying() {
        WebElement pauseBtn = driver.findElement(By.xpath("//span[@data-testid='pause-btn']"));
        return pauseBtn.isDisplayed();
    }
}


