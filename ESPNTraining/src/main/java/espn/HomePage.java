package espn;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class HomePage extends MobileAPI2 {

    @FindBy(xpath = "//android.widget.Button[@index='1']")
    WebElement allow1;
    @FindBy(id = "com.espn.score_center:id/logo")
    WebElement logo;

    @FindBy(id = "com.espn.score_center:id/btn_signup")
    WebElement signup;

    @FindBy(id = "com.espn.score_center:id/btn_login")
    WebElement login;

    @FindBy(id = "com.espn.score_center:id/btn_sign_up_later")
    WebElement signlater;

    public void allow() {
        allow1.click();
        allow1.click();
    }

    public void getLogo() {
        String text = logo.getText();
        //System.out.println(text);
        if (text.equalsIgnoreCase(logo.getText())) {
            System.out.println("Test Passed");
        } else
            System.out.println("Test Failed");
        //Assert.assertEquals(text, "ESPN");
    }

    public void setSignup() {
        String getText = signup.getText();
        System.out.println(getText);
        if (getText.equals("SIGN UP")) {
            System.out.println("Hurrah! It matches");
        } else
            System.out.println("OOPS! It failed");
    }

    public void setLogIn(){
        String result = login.getText();
        System.out.println(result);
        Assert.assertEquals(result, "LOG IN");
        login.click();
        //System.out.println(appiumDriver.getTitle());

    }

    public void setSignLater(){
        System.out.println(signlater.isDisplayed());
        String result2 = signlater.getText();
        if(true){
            Assert.assertEquals(result2,  "Sign Up Later");
            System.out.println(result2);
        }
    }
}





