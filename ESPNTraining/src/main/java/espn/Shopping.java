package espn;

import base.MobileAPI2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopping extends MobileAPI2 {

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

    @FindBy(id = "com.target.ui:id/skyfeed_cell_title")
    WebElement shopbycategory;

    @FindBy(id = "com.target.ui:id/bubble_category_recycler_view")
    WebElement textfurniture;

    @FindBy(id = "Navigate up")
    WebElement arrowback;

    @FindBy(xpath = "//android.widget.TextView[@text='Living Room Furniture']")
    WebElement livingroom;

    @FindBy(xpath = "//android.widget.TextView[@text='TV Stands & Entertainment Centers']")
    WebElement tvstand;

    @FindBy(id = "com.target.ui:id/menu_account")
    WebElement accountDal;

    @FindBy(id = "More options")
    WebElement dots;

    @FindBy(xpath = "//android.widget.TextView[@text='sign out']")
    WebElement signoutdot;

    @FindBy(xpath = "//android.widget.TextView[@text='Weekly Ad & catalogs']")
    WebElement weeklyaddd;

    @FindBy(xpath = "//android.widget.TextView[@text='Cartwheel offers']")
    WebElement cartwheel;

    @FindBy(id = "Expires today! 25% off Nespresso Coffee & Espresso Makers assorted machines")
    WebElement coffee;

    public void setShopping(String email, String pass) {
        clickByXpath("//android.widget.Button[@text='get started']");
        clickByXpath("//android.widget.Button[@text='Sign in with Target account']");
        /*username.sendKeys(email);
        password.sendKeys(pass);
        clickByXpathWebElement(checkbox);
        clicklogin.click();*/
        denylocation.click();
        clickByXpathWebElement(shopbycategory);
        scrollAndClickByName("Furniture");
        //System.out.println(textfurniture.getText());
        scrollAndClickByName("Desks");
        arrowback.click();
        livingroom.click();
        tvstand.click();
        arrowback.click();
        accountDal.click();
        dots.click();
        signoutdot.click();
    }

    public void setWeeklyadd(String email, String pass){
        clickByXpath("//android.widget.Button[@text='get started']");
        clickByXpath("//android.widget.Button[@text='Sign in with Target account']");
        /*username.sendKeys(email);
        password.sendKeys(pass);
        clickByXpathWebElement(checkbox);
        clicklogin.click();*/
        denylocation.click();
        clickByXpathWebElement(weeklyaddd);
        arrowback.click();
        accountDal.click();
        dots.click();
        signoutdot.click();
    }

    public void setCartWheel(String email, String pass){
        clickByXpath("//android.widget.Button[@text='get started']");
        clickByXpath("//android.widget.Button[@text='Sign in with Target account']");
        username.sendKeys(email);
        password.sendKeys(pass);
        clickByXpathWebElement(checkbox);
        clicklogin.click();
        denylocation.click();
        clickByXpathWebElement(cartwheel);
        scrollAndClickByName("home");
        coffee.click();
        scrollAndClickByName("Save offer");
        scrollAndClickByName("close");
        accountDal.click();
        dots.click();
        signoutdot.click();




    }


}
