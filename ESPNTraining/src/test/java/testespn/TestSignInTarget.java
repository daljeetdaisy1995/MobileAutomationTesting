package testespn;

import base.MobileAPI2;
import espn.SignInTarget;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSignInTarget extends MobileAPI2 {
    SignInTarget signInTarget;

    @BeforeMethod
    public void initialization(){
        signInTarget = PageFactory.initElements(appiumDriver, SignInTarget.class);
    }

    @Test(enabled = false)
    public void testClickSignIn(){
        signInTarget.clickSignIn();
    }

    @Test(enabled = false)
    public void testSigninpermanent(){
        signInTarget.clickSignIn();
        signInTarget.signinpermanent("daljeetdaisy@gmail.com", "Seerat@0");
    }

    @Test(enabled = false)
    public void testEnteringSignIn(){
        signInTarget.clickSignIn();
        signInTarget.enteringSignIn("daljeetdaisy@gmail.com", "Seerat@0");
    }
    @Test(enabled = false)
    public void testSigninpermanent1(){
        signInTarget.clickSignIn();
        signInTarget.signinpermanent("sohan94@gmail.com", "Sohanrifat@0");
    }

    @Test(enabled = false)
    public void testEnteringSignIn1(){
        signInTarget.clickSignIn();
        signInTarget.enteringSignIn("sohan94@gmail.com", "Sohanrifat@0");
    }

    @Test(enabled = false)
    public void testSigninpermanent2(){
        signInTarget.clickSignIn();
        signInTarget.signinpermanent("jannatsaikat@gmail.com", "JannatSaikat@0");
    }

    @Test(enabled = false)
    public void testEnteringSignIn2(){
        signInTarget.clickSignIn();
        signInTarget.enteringSignIn("jannatsaikat@gmail.com", "JannatSaikat@0");
    }


    @Test(enabled = false)
    public void testSigninpermanent3(){
        signInTarget.clickSignIn();
        signInTarget.signinpermanent("djaf1981@gmail.com", "Jeffcirata@0");
    }

    @Test(enabled = false)
    public void testEnteringSignIn3(){
        signInTarget.clickSignIn();
        signInTarget.enteringSignIn("djaf1981@gmail.com", "Jeffcirata@0");
    }


    @Test(enabled = false) // testcase to run
    public void testSearchItems(){
        signInTarget.clickSignIn();
        signInTarget.signinpermanent("daljeetdaisy@gmail.com", "Seerat@0");
        signInTarget.searchitems("sony wireless headphones");
    }


    @Test(enabled = false)
    public void testSearchItems1(){
        signInTarget.clickSignIn();
        signInTarget.signinpermanent("daljeetdaisy@gmail.com", "Seerat@0");
        signInTarget.searchitems("sony wireless headphones");
    }

    @Test(enabled = false)
    public void testSearchItems2(){
        signInTarget.clickSignIn();
        signInTarget.signinpermanent("daljeetdaisy@gmail.com", "Seerat@0");
        signInTarget.searchitems("samsung wireless headphones");
    }

    @Test(enabled = false)
    public void testSearchItems3(){
        signInTarget.clickSignIn();
        signInTarget.signinpermanent("daljeetdaisy@gmail.com", "Seerat@0");
        signInTarget.searchitems("apple wireless headphones");
    }

    @Test(enabled = false)
    public void testSearchItems4(){
        signInTarget.clickSignIn();
        signInTarget.signinpermanent("daljeetdaisy@gmail.com", "Seerat@0");
        signInTarget.searchitems("beats wireless headphones");
    }

    @Test(enabled = false)
    public void testSearchItems5(){
        signInTarget.clickSignIn();
        signInTarget.signinpermanent("daljeetdaisy@gmail.com", "Seerat@0");
        signInTarget.searchitems("nexus wireless headphones");
    }
    @Test(enabled = false)
    public void testSearchItems6(){
        signInTarget.clickSignIn();
        signInTarget.signinpermanent("daljeetdaisy@gmail.com", "Seerat@0");
        signInTarget.searchitems("micromax wireless headphones");
    }


}
