package page.objects;

import ExtentReport.TestLogger;
import application.page.base.ApplicationPageBase;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Footer extends ApplicationPageBase {

    HomePage objOfHomePage = PageFactory.initElements(ad,HomePage.class);

    public void scrollDown() throws InterruptedException {

        TestLogger.log(ad.getContextHandles().toString());

        nativeContext();

        for(int i =0; i<4;i++) {
            Dimension size = ad.manage().window().getSize();

            int x = size.getWidth() / 2;
            int starty = (int) (size.getHeight() * 0.70);
            int endy = (int) (size.getHeight() * 0.10);
            ad.swipe(x, starty, x, endy, 2000);
            Thread.sleep(4000);
        }

//        tap(500,500,"Duffle Bag");
        ad.tap(1,500,500,2);

        chromiumContext();

    }

    public void deviceBehavior(){
        nativeContext();
       ad.rotate(ScreenOrientation.LANDSCAPE);
       ad.lockScreen(2);
       ad.closeApp();
    }


    public void refreshPage() throws InterruptedException {

        nativeContext();
        Dimension size = ad.manage().window().getSize();
        int x = size.getWidth() / 2;
        int endy = (int) (size.getHeight() * 0.70);
        int starty = (int) (size.getHeight() * 0.10);
        ad.swipe(x, starty, x, endy, 2000);
        Thread.sleep(4000);
    }





}
