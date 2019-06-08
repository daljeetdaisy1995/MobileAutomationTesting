package espn;

import base.MobileAPI2;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import reporting.TestLogger;

import java.security.PublicKey;

public class SignInTarget extends MobileAPI2 {

    @FindBy(id = "com.target.ui:id/first_run_get_started_button")
    WebElement getStarted;

    @FindBy(id = "com.target.ui:id/gate_login_button")
    WebElement signin;

    @FindBy(xpath = "//android.view.View[@text='Sign in']")
    WebElement textsignin;

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//android.view.View[@instance ='11']")
    WebElement checkbox;

    @FindBy(id = "login")
    WebElement clicklogin;

    @FindBy(id = "com.android.packageinstaller:id/permission_deny_button")
    WebElement denylocation;

    @FindBy(id = "com.target.ui:id/menu_account")
    WebElement accountDal;

    @FindBy(id = "More options")
    WebElement dots;

    @FindBy(xpath = "//android.widget.TextView[@text='sign out']")
    WebElement signoutdot;

    @FindBy(id = "com.target.ui:id/shop_expanded_top_toolbar_title")
    WebElement gettitle;

    @FindBy(id = "com.target.ui:id/shop_expanded_top_toolbar_subtitle")
    WebElement subtitletime;

    @FindBy(xpath = "//android.widget.TextView[@text='search']")
    WebElement searchbar;

    @FindBy(id = "com.target.ui:id/searchField")
    WebElement typesearch;

    @FindBy(id = "com.target.ui:id/prd_search_suggestion_title")
    WebElement clickitem;

    @FindBy(id = "com.target.ui:id/plp_v2_list_image_view")
    WebElement itemselected;

    @FindBy(id = "com.target.ui:id/pdp_v2_grid_variation_image_view")
    WebElement choose;

    @FindBy(id = "com.target.ui:id/add_to_cart_button")
    WebElement addtocart;

    @FindBy(id = "com.target.ui:id/sb__text")
    WebElement verifyaddtocart;

    @FindBy(id = "com.target.ui:id/cart_icon")
    WebElement carticon;

    @FindBy(xpath = "//android.widget.TextView[@text ='2']")
    WebElement index2;

    @FindBy(id = "com.target.ui:id/checkout_button_container")
    WebElement checkout;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    WebElement navigateback;

    public void clickSignIn() {
        getStarted.click();
        signin.click();
    }

    public void signinpermanent(String email, String pass) {
        username.sendKeys(email);
        password.sendKeys(pass);
        checkbox.click();
        clicklogin.click();
        denylocation.click();
    }

    public void enteringSignIn(String email, String pass) {
        String result = textsignin.getText();
        if (true) {
            Assert.assertEquals(result, "Sign in");
            System.out.println("Assertion passed");
        } else
            System.out.println("Assertion failed");
        username.sendKeys(email);
        password.sendKeys(pass);
        System.out.println(checkbox.isDisplayed());
        System.out.println(checkbox.getText());
        checkbox.click();
        System.out.println(checkbox.isSelected());
        System.out.println(checkbox.getText());
        System.out.println(checkbox.getSize());
        clicklogin.click();
        denylocation.click();
        accountDal.click();
        dots.click();
        signoutdot.click();
    }

    public void searchitems(String search) {
       // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        System.out.println(gettitle.getText());
        String title = subtitletime.getText();
        if (title.equalsIgnoreCase("open until 12 AM")) {
            System.out.println("Hurrah! Title got matched");
        } else
            System.out.println("Oops! Error in matching");
        System.out.println(title);
        searchbar.click();
        typesearch.sendKeys(search);
        //typesearch.sendKeys(Keys.ARROW_DOWN);
        clickitem.click();
        itemselected.click();
        choose.click();
        addtocart.click();
        System.out.println(verifyaddtocart.getText());
        carticon.click();
        appiumDriver.findElement(By.id("com.target.ui:id/cart_product_quantity_spinner")).click();
        appiumDriver.findElement(By.xpath("//android.widget.TextView[@text ='2']")).click();
        System.out.println(checkout.getText());
        checkout.click();
        scrollAndClickByName("place my order");
        navigateback.click();
        navigateback.click();
        accountDal.click();
        dots.click();
        signoutdot.click();
    }


}

