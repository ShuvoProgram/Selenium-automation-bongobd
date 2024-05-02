package TestCases;

import DriverSetup.ChromeDriverSetup;
import PageObject.BongoMusicTest_02_PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BongoMusicTest_02 extends ChromeDriverSetup {

    public static String baseUrl = "https://bongobd.com/";

    @Test(priority = 1)
    public static void mediaVideoPlay() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //website title
        String websiteActualTitle = driver.getTitle();
        System.out.println("Website Title is: " + websiteActualTitle);

        BongoMusicTest_02_PageObject aBongoMusicTestPageObject = new BongoMusicTest_02_PageObject(driver);
        aBongoMusicTestPageObject.musicMenu.click();
        Thread.sleep(5000);

        // Music page Title
        String musicPageTitle = driver.getTitle();
        System.out.println("Music page's Title is: " + musicPageTitle);

        //Music Menu
        String musicMENU = aBongoMusicTestPageObject.musicMenu.getText();
        System.out.println("Music page's Title is: " + musicMENU);

        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)", "");
        Thread.sleep(5000);

        aBongoMusicTestPageObject.forthMusicPlay.click();
        Thread.sleep(10000);

        //Music Title
//        String musicTitle = driver.getTitle();
//        System.out.println("Music Title page is: "+musicTitle);

        //Music Name
//        String musicName = aBongoMusicTestPageObject.musicName.getText();
//        System.out.println("Music name is: "+musicName);

        Assert.assertEquals(websiteActualTitle, "BONGO | Watch Live Tv, Bangla Movies, Natoks Anytime Anywhere");
        Assert.assertEquals(musicPageTitle, "BONGO | Music");
        Assert.assertEquals(musicMENU, "MUSIC");
//        Assert.assertEquals(musicTitle,"BONGO | Kichu Kichu Kotha (Female Version) - Flat No 609");
//        Assert.assertEquals(musicName, "Kichu Kichu Kotha (Female Version) - Flat No 609");


    }
}
