package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SystemHomePage;

public class LoginTests extends BaseTests {
        @Test
    public void testSuccessfullyLogin(){
            homePage.clickLanguageButton();
            homePage.setUsername("FarahTest4");
          homePage.setPassword("FarahTest4@123");
          homePage.clickLoginButton();


    }
}
