package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class  BongoMusicTest_02_PageObject extends PageObjectMain{

    @FindBy(xpath = "//span[contains(text(),'Music')]")
    public WebElement musicMenu;

//    @FindBy(xpath = "//h5[contains(text(),'Kichu Kichu Kotha (Female Version) - Flat No 609')]")
//    public WebElement musicName;

    @FindBy(xpath = "//div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/a[1]/div[1]/div[1]/div[1]")
    public WebElement forthMusicPlay;

    public BongoMusicTest_02_PageObject(WebDriver driver) {
        super(driver);
    }
}
