package application.page.base;

import ExtentReport.TestLogger;
import base.MobileAPI;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApplicationPageBase extends MobileAPI {

    static TouchAction act = new TouchAction(ad);


    /**
    * helper methods*/

    public static void click(WebElement webelement, String nameOfElemenet){
        TestLogger.log("Clicking "+nameOfElemenet);
        WebDriverWait wait = new WebDriverWait(ad,30);
        wait.until(ExpectedConditions.elementToBeClickable(webelement));
        webelement.click();
        TestLogger.log("Clicked "+nameOfElemenet);

    }

    public static void tap(int x, int y,String nameOfEleementToTap){
        TestLogger.log("Tapping "+nameOfEleementToTap);
        act.tap(x,y).perform();
        TestLogger.log("Tapped "+nameOfEleementToTap);
    }


    public static void goback(){
        TestLogger.log("Navigating to back Page");
        ad.navigate().back();
        TestLogger.log("Reach Previous Page");
    }


    public void sendKeys(String searchWord, WebElement webElement){
        TestLogger.log("Sending "+searchWord+" to search");
        webElement.clear();
        webElement.sendKeys(searchWord);
        TestLogger.log(searchWord+" reached in search text Box");
        //webElement.sendKeys(Keys.ENTER);


    }


    public static void nativeContext(){

        TestLogger.log("Switching to Native App context");
        ad.context("NATIVE_APP");
        TestLogger.log("Switched to Native App ");

    }



    public static void chromiumContext(){

        TestLogger.log("Switching to Chromium context");
        ad.context("CHROMIUM");
        TestLogger.log("Switched to Chromium Back ");

    }





}
