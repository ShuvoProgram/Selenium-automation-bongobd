package TestCases;

import DriverSetup.ChromeDriverSetup;
import PageObject.BongoMovieTest_03_PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BongoMovieTest_03 extends ChromeDriverSetup {

    public static String baseUrl = "https://bongobd.com";

    @Test(priority = 1)
    public static void moviePlay() throws InterruptedException {
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //website title
        String title = driver.getTitle();
        System.out.println("Website title is: " + title);

        BongoMovieTest_03_PageObject aBongoMovieTest_03_PageObject = new BongoMovieTest_03_PageObject(driver);
        aBongoMovieTest_03_PageObject.movieMenu.click();
        Thread.sleep(5000);

        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1350)", "");
        Thread.sleep(5000);

        aBongoMovieTest_03_PageObject.moviePlay.click();
        Thread.sleep(20000);

        //Movie menu
        String test = aBongoMovieTest_03_PageObject.movieMenu.getText();
        System.out.println("Test is: " + test);

        //Movie Name
//        String movieName = aBongoMovieTest_03_PageObject.movie_Name.getText();
//        System.out.println("Movie name is: "+movieName);

        Assert.assertEquals(title, "BONGO | Watch Live Tv, Bangla Movies, Natoks Anytime Anywhere");
        Assert.assertEquals(test, "MOVIES");
//        Assert.assertEquals(movieName, "Mayer Odhikar");


    }
}
