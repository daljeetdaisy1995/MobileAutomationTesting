package testespn;

import base.MobileAPI2;
import espn.SignUp;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSignUp extends MobileAPI2 {
    SignUp signUp;

    @BeforeMethod
    public void initialization(){
        signUp = PageFactory.initElements(appiumDriver, SignUp.class);
    }

    @Test(enabled = false)
    public void testCreateAccount(){
        signUp.createAccount();
    }
    @Test(enabled = false)
    public void testAccountCreation(){ //test to run
        signUp.createAccount();
        signUp.accountCreation("daljeetdaisy@gmail.com");
        signUp.accountCreationfirst("Daljeet");
        signUp.accountCreationlast("Alli");
        signUp.accountCreationphone("9293351805)");
        signUp.accountCreationpassword("Seerat@0");
    }
    @Test(enabled = false)
    public void testAccountCreation2(){
        signUp.createAccount();
        signUp.accountCreation("sohan94@gmail.com");
        signUp.accountCreationfirst("Sohan");
        signUp.accountCreationlast("Rifat");
        signUp.accountCreationphone("6462864779)");
        signUp.accountCreationpassword("Sohanrifat@0");
    }
    @Test(enabled = false)
    public void testAccountCreation3(){
        signUp.createAccount();
        signUp.accountCreation("jannatsaikat@gmail.com");
        signUp.accountCreationfirst("Jannat");
        signUp.accountCreationlast("Saikat");
        signUp.accountCreationphone("6462415592)");
        signUp.accountCreationpassword("JannatSaikat@0");
    }

    @Test(enabled = false)
    public void testAccountCreation4(){
        signUp.createAccount();
        signUp.accountCreation("djaf1981@gmail.com");
        signUp.accountCreationfirst("Jeff");
        signUp.accountCreationlast("Cirata");
        signUp.accountCreationphone("3477777034)");
        signUp.accountCreationpassword("Jeffcirata@0");
    }

    @Test(enabled = false)
    public void testAccountCreation5(){
        signUp.createAccount();
        signUp.accountCreation("winsen.sid@gmail.com ");
        signUp.accountCreationfirst("Winsen");
        signUp.accountCreationlast("Sid");
        signUp.accountCreationphone("3478938716)");
        signUp.accountCreationpassword("Winsensid@0");
    }

}
