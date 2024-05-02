package TestCases;

import DriverSetup.ChromeDriverSetup;
import PageObject.BongoDramaSportsTest_01_PageObject;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BongoDramaSportsTest_01 extends ChromeDriverSetup {

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

        BongoDramaSportsTest_01_PageObject aBongoTestPageObject = new BongoDramaSportsTest_01_PageObject(driver);
        aBongoTestPageObject.dramaMenu.click();
        Thread.sleep(3000);

        // Drama page Title
        String dramaPageTitle = driver.getTitle();
        System.out.println("Drama Page's Title is: " + dramaPageTitle);

        //drama menu
        String dramaMenuTest = aBongoTestPageObject.dramaMenu.getText();
        System.out.println("Drama Menubar Name is: " + dramaMenuTest);

        aBongoTestPageObject.search.sendKeys("420");
        Thread.sleep(5000);

        aBongoTestPageObject.search.sendKeys(Keys.ENTER);
        Thread.sleep(4000);

        //Drama search title
        String dramasearchTitle = driver.getTitle();
        System.out.println("Drama Search Title is: " + dramasearchTitle);

        aBongoTestPageObject.firstNews.click();
        Thread.sleep(40000);

        // Drama's Title
//        String dramaTitle = driver.getTitle();
//        System.out.println("Drama's Title is: " + dramaTitle);

        //Drama Name
//        String dramaName = aBongoTestPageObject.dramaName.getText();
//        System.out.println("Drama's Name is: " + dramaName);


        Assert.assertEquals(websiteActualTitle, "BONGO | Watch Live Tv, Bangla Movies, Natoks Anytime Anywhere");
        Assert.assertEquals(dramaPageTitle, "BONGO | Drama");
        Assert.assertEquals(dramaMenuTest, "DRAMA");
        Assert.assertEquals(dramasearchTitle, "BONGO | Search Result");
//        Assert.assertEquals(dramaTitle, "BONGO | Ganjam 420");
//        Assert.assertEquals(dramaName, "Ganjam 420");

    }

    @Test(priority = 2)
    public static void SportsVideoPlay() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //website title
        String websiteActualTitle = driver.getTitle();
        System.out.println("Website Title is: " + websiteActualTitle);

        BongoDramaSportsTest_01_PageObject aBongoTestPageObject = new BongoDramaSportsTest_01_PageObject(driver);
        aBongoTestPageObject.sportsMenu.click();
        Thread.sleep(5000);

        // Sport page Title
        String sportPageTitle = driver.getTitle();
        System.out.println("Sports page's Title is: " + sportPageTitle);

        //Sports menu
        String sportsMenuTest = aBongoTestPageObject.sportsMenu.getText();
        System.out.println("Sports Menubar Name is: " + sportsMenuTest);

        aBongoTestPageObject.search.sendKeys("messi");
        Thread.sleep(15000);

        aBongoTestPageObject.search.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        //Sports title search
        String sportsSearchTitle = driver.getTitle();
        System.out.println("Sports Search Page Title: " + sportsSearchTitle);
        Thread.sleep(15000);

        aBongoTestPageObject.thirdNews.click();
        Thread.sleep(15000);

        //sports News Title
        String sportsNewsTitle = driver.getTitle();
        System.out.println("Sports News Title is: " + sportsNewsTitle);

        //sports News Name
//        String sportsNewsName = aBongoTestPageObject.thirdNewsName.getText();
//        System.out.println("Sports News Name is: " + sportsNewsName);

        aBongoTestPageObject.playAndPauseButton.click();
        Thread.sleep(5000);
        aBongoTestPageObject.playAndPauseButton.click();
        Thread.sleep(5000);

        Assert.assertEquals(websiteActualTitle, "BONGO | Watch Live Tv, Bangla Movies, Natoks Anytime Anywhere");
        Assert.assertEquals(sportPageTitle, "BONGO | Sports");
        Assert.assertEquals(sportsMenuTest, "SPORTS");
        Assert.assertEquals(sportsSearchTitle, "BONGO | Search Result");
//        Assert.assertEquals(sportsNewsTitle, "BONGO | Lionel Messi's PSG Press Conference");
//        Assert.assertEquals(sportsNewsName, "Lionel Messi's PSG Press Conference");


    }


}
