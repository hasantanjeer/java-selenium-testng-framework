package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProfilePage;

public class LoginTest extends BaseTest {
    @Test
public void verifyLoginTest() {

    LoginPage loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret_sauce");

    ProfilePage profilePage = new ProfilePage(driver);

    String actualUser = profilePage.getUserName();

        Assert.assertEquals(actualUser, "Products");
}

}
