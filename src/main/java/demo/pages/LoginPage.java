package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.webdriver.AndroidDriverInstance.androidDriver;

public class LoginPage {

    public boolean isOnLoginPage(){
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        WebElement mokaLabel = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id("icon_moka_image_view")));
        return mokaLabel.isDisplayed();
    }

    public void inputEmailOrPhone(String username){
        AndroidElement inputUsername = androidDriver.findElement(MobileBy.id("emailOrPhoneEditText"));
        inputUsername.sendKeys(username);
    }

    public void inputPassword(String password){
        AndroidElement inputUsername = androidDriver.findElement(MobileBy.id("passwordEditText"));
        inputUsername.sendKeys(password);
    }

    public void clickSignIn(){
        AndroidElement buttonSignIn = androidDriver.findElement(MobileBy.id("signInButton"));
        buttonSignIn.click();
    }

    public boolean usernameErrorMessage(){
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        WebElement usernameErrorLabel = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id("textinput_error")));
        return usernameErrorLabel.isDisplayed();
    }

}
