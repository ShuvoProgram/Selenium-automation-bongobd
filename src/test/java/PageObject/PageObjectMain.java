package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectMain {
    protected WebDriver driver;

    public PageObjectMain(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
