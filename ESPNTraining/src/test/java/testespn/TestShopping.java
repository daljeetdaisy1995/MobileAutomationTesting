package testespn;

import base.MobileAPI2;
import espn.Shopping;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestShopping extends MobileAPI2 {
    Shopping shopping;

    @BeforeMethod
    public void initialization(){
        shopping = PageFactory.initElements(appiumDriver, Shopping.class);
    }

    @Test(enabled = false)
    public void testSetShopping(){
        shopping.setShopping("daljeetdaisy@gmail.com", "Seerat@0");
    }

    @Test(enabled = false)
    public  void testSetWeeklyadd(){
        shopping.setWeeklyadd("daljeetdaisy@gmail.com", "Seerat@0");
    }
    @Test(enabled = false)
    public void testSetCartWheel(){
        shopping.setCartWheel("daljeetdaisy@gmail.com", "Seerat@0");
    }


    }


