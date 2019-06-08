package espn;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp extends MobileAPI2 {

    @FindBy(id = "com.target.ui:id/first_run_get_started_button")
    WebElement getStarted;

    @FindBy(id = "com.target.ui:id/gate_create_account_button")
    WebElement createAcc;

    @FindBy(id = "com.android.chrome:id/terms_accept")
    WebElement accept;

    @FindBy(xpath = "//android.view.View[@text='Create account']")
    WebElement text;

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "firstname")
    WebElement firstname;

    @FindBy(id = "lastname")
    WebElement lastname;

    @FindBy(id = "phone")
    WebElement phone;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "createAccount")
    WebElement createAccount;

    public void createAccount() {
        getStarted.click();
    }

    public void accountCreation(String email) {
        System.out.println(createAcc.getText());
        createAcc.click();
        System.out.println(text.getText());
    //System.out.println(appiumDriver.getTitle());
        username.sendKeys(email);
}

    public void accountCreationfirst(String firstName) {
        firstname.sendKeys(firstName);
    }

    public void accountCreationlast(String lastName) {
        lastname.sendKeys(lastName);
    }

    public void accountCreationphone(String phonenum) {
        phone.sendKeys(phonenum);
    }

    public void accountCreationpassword(String pass) {
        password.sendKeys(pass);
        createAccount.click();
    }




}