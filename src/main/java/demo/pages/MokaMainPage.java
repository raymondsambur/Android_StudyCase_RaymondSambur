package demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.webdriver.AndroidDriverInstance.androidDriver;

public class MokaMainPage {

    public boolean isOnMokaMainPage(){
        WebDriverWait wait = new WebDriverWait(androidDriver, 30);
        WebElement favoriteIcon = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id("tool_bar_favorite_img")));
        return favoriteIcon.isDisplayed();
    }

}
