package demo.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;

import static demo.webdriver.AndroidDriverInstance.androidDriver;

public class ShoppingCart {

    public void clickCharge(){
        AndroidElement buttonSignIn = androidDriver.findElement(MobileBy.id("checkoutButton"));
        buttonSignIn.click();
    }

    public void clickClearSale(){
        AndroidElement buttonClear = androidDriver.findElement(MobileBy.id("view_clear_all"));
        buttonClear.click();
    }

}
