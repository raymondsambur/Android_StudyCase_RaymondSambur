package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.util.List;

public class Favourites {

    public void getItem(String itemName, int qty){
        List<AndroidElement> items = AndroidDriverInstance.androidDriver.findElements(By.id("grid_favourite_name"));
        for (int i = 0; i < items.size();i++){
            if (itemName.equalsIgnoreCase(items.get(i).getText())){
                for (int j = 0; j < qty; j++){
                    items.get(i).click();
                }
                break;
            }
        }
    }

//    public void getItem(String itemName){
//        Integer item = getItemOrder(itemName);
//        AndroidElement itemClick = AndroidDriverInstance.androidDriver.findElements(By.id("grid_favourite_name")).get(item);
//        itemClick.click();
//    }

}
