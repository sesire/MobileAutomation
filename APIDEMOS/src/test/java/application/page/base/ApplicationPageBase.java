package application.page.base;

import ExtentReport.TestLogger;
import base.MobileAPI;
import io.appium.java_client.TouchAction;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ApplicationPageBase extends MobileAPI {

    // initializing act variable to perform mobile action in different method

    TouchAction act = new TouchAction(ad);




    /**
     * making a common method for homePage where you click on Webelement and takes you
     * next page. One Webelement parameter need to pass to click and name of element
     * for loggers
     */


    public static void homePageTap(WebElement webElemenet, String webElementName) {
        //TouchAction act = new TouchAction(ad);
        TestLogger.log("Clicking " + webElementName);
        /*act.tap(webElemenet);
        act.perform();*/
        webElemenet.click();
        TestLogger.log("Clicked " + webElementName);

    }

    /**
     * below method using for logging of test passed. call this method in verify
     * method and logged passed
     */

    public WebElement testPassedLog(WebElement verifyWebelement) {
        TestLogger.log("verifying Test passed ");
        WebElement webelement = verifyWebelement;
        TestLogger.log("Verified Test passed");
        return webelement;
    }


    /**
     * instead of using regular click i created this method to use for log purpose
     */
    public static void click(WebElement webElement, String nameOfElement) {

        TestLogger.log("Clicking" + nameOfElement);
        webElement.click();
        TestLogger.log("Clicked" + nameOfElement);
    }


    /*
     * using scroll method for visible text*/

    public static void scroll(String nameOfEleement) {
        TestLogger.log("Scrolling to " + nameOfEleement);
        ad.scrollTo(nameOfEleement).click();
        TestLogger.log("Scrolled and Clicked " + nameOfEleement);
    }

    /*comon method to rotate device
     * */

    public static void rotate() throws InterruptedException {
        TestLogger.log("Rotating device");
        ad.rotate(ScreenOrientation.LANDSCAPE);
        TestLogger.log("Device Rotated");
        TestLogger.log("Waitng 3 sec to observe");
        Thread.sleep(3000);

    }


    /*
     * method to tap taking two parameters*/

    public void tap(int x, int y) throws InterruptedException {

        TestLogger.log("Tapping at " + x + " & " + y);
        act.tap(x, y).perform();
        TestLogger.log("Tapp press");
        Thread.sleep(2000);

    }


    public void sendKeys(String searchWord, WebElement webElement) {
        TestLogger.log("Sending " + searchWord + " to search");
        webElement.clear();
        webElement.sendKeys(searchWord);
        TestLogger.log(searchWord + " reached in search text Box");


    }
}