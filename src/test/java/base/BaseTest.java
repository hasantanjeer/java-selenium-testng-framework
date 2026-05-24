package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.BrowserFactory;

public class BaseTest { public WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = BrowserFactory.startBrowser();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (driver != null) {
            driver.quit();
        }
    }
}