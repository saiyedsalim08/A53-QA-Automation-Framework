import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



@Test
@Parameters({"BaseUrl"})
public class Homework19 extends BaseTest{
   public void deletePlaylist() {
      String playlistDeletedMessage = "Deleted playlist \"Test.\"";
      enterEmail("salim.saiyed@testpro.io");
      enterPassword("SXTImuRs");
      clickSubmit();
      selectPlaylist();
      deletebtn();
//      clickOk();
      playlistDeleteSuccessMsg();
      Assert.assertEquals(playlistDeleteSuccessMsg(),playlistDeletedMessage);
   }

   private String playlistDeleteSuccessMsg() {
      WebElement deleteMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
      return deleteMsg.getText();
   }

//   private void clickOk() {
//      WebElement clickOkBtn = driver.findElement(By.xpath("//button[@class='ok']"));
//      clickOkBtn.click();
//
//   }

   private void deletebtn() {
      WebElement deletePlaylistBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-times']")));
      deletePlaylistBtn.click();
   }

   private void selectPlaylist() {
      WebElement playlist = driver.findElement(By.xpath("//section[@id='playlists']//ul//a[contains(text(),'Test')]"));
      playlist.click();
   }


}
