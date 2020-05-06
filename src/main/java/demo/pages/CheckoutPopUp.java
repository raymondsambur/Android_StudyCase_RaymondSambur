package demo.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;

import static demo.webdriver.AndroidDriverInstance.androidDriver;

public class CheckoutPopUp {

    public void inputCash(String cash){
        AndroidElement inputUsername = androidDriver.findElement(MobileBy.id("cash_edit_text"));
        inputUsername.sendKeys(cash);
    }

    public void clickCharge(){
        AndroidElement buttonSignIn = androidDriver.findElement(MobileBy.id("tablet_ok_button"));
        buttonSignIn.click();
    }

    public void clickLowestCashSuggestion(){
        AndroidElement buttonLowest = androidDriver.findElement(MobileBy.id("cash_suggest_lowest"));
        buttonLowest.click();
    }

    public void clickMiddleCashSuggestion(){
        AndroidElement buttonMiddle = androidDriver.findElement(MobileBy.id("cash_suggest_middle"));
        buttonMiddle.click();
    }

}
