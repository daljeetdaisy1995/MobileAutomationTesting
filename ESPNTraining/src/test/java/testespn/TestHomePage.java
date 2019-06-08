package testespn;

import base.MobileAPI2;
import espn.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends MobileAPI2 {
    HomePage homePage;

    @BeforeMethod
    public void initialization(){
        homePage = PageFactory.initElements(appiumDriver,HomePage.class);
    }

    @Test(enabled = false)
    public void testAllow(){
        homePage.allow();
    }
    @Test(enabled = false)
    public void testLogo(){
        homePage.allow();
        homePage.getLogo();
    }
    @Test(enabled = false)
    public void testGetSignUp(){
        homePage.allow();
        homePage.setSignup();
    }
    @Test(enabled = false)
    public void testSetLogIn(){
        homePage.allow();
        homePage.setLogIn();
    }

    @Test(enabled = false)
    public void testSetSignLater(){
        homePage.allow();
        homePage.setSignLater();
    }
}
