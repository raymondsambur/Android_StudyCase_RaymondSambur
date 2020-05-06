package demo.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.webdriver.AndroidDriverInstance.androidDriver;

public class ReceiptPage {

    public boolean isOnReceiptPage(){
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        WebElement receiptLabel = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id("change_text_view")));
        return receiptLabel.isDisplayed();
    }

    public void clickNewSale(){
        AndroidElement buttonNewSale = androidDriver.findElement(MobileBy.id("tablet_ok_button"));
        buttonNewSale.click();
    }

}
