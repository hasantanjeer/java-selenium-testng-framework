package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {

    WebDriver driver;

    By title = By.className("title");

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUserName() {
        return driver.findElement(title).getText();
    }
}

