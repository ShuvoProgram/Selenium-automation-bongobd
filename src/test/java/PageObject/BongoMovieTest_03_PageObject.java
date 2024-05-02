package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BongoMovieTest_03_PageObject extends PageObjectMain {

    @FindBy(xpath = "//span[contains(text(),'Movies')]")
    public WebElement movieMenu;

    @FindBy(xpath = "//div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[7]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]")
    public WebElement moviePlay;

//    @FindBy(xpath = "//h5[contains(text(),'Mayer Odhikar')]")
//    public WebElement movie_Name;

    public BongoMovieTest_03_PageObject(WebDriver driver) {
        super(driver);
    }
}
