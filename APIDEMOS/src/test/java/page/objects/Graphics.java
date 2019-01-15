package page.objects;

import application.page.base.ApplicationPageBase;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;

public class Graphics extends ApplicationPageBase {

    TouchAction act = new TouchAction(ad);
//    TouchActions touch = new TouchActions(ad);

    @FindBy(id ="Graphics")
    private WebElement graphics;
//
    @FindBy(id="Vertices")
    private WebElement vertices;
//
    @FindBy(id="Touch Paint")
    private WebElement touchPaint;
//
    @FindBy(id="Patterns")
    private WebElement pattern;
//
    @FindBy(id="Compass")
    private WebElement compass;
//
    @FindBy(xpath="//android.view.View[@index='0']")
    private WebElement verifyComapass;

    @FindBy(id="FingerPaint")
    private WebElement fingerPaint;

    @FindBy(id="OpenGL ES")
    private WebElement openGL;
//
    @FindBy(id="Touch Rotate")
    private WebElement Opentouchrotate;

    @FindBy(id="Translucent GLSurfaceView")
    private WebElement OpenTranslucent;



    public void compass() throws InterruptedException {
        homePageTap(graphics,"Graphics");
        homePageTap(compass,"Compass");
        rotate();
    }

    public WebElement verifyCompass(){
        return verifyComapass;
    }

    public void vertices() throws InterruptedException {

        homePageTap(graphics,"Graphics");
        scroll("Vertices");
        Thread.sleep(2000);
        tap(133,1117);
        tap(710,1138);
        tap(926,752);

    }

    public void touchPaint() throws InterruptedException {
        homePageTap(graphics,"Graphics");
        scroll("Touch Paint");
//        Actions builder = new Actions(ad);
//        builder.moveByOffset(170,449).moveByOffset(180,1200).build().perform();
        Thread.sleep(2000);
            int x = 170;
            int y = 449;
            for(int i = 0; i <150;i++){
                act.tap(x,y).perform();
//                Thread.sleep(20);
                y+=4;
                x+=4;
            }

        act.longPress(170,449).perform();

       act.longPress(180,1200).perform();
//        act.tap(170,449).moveTo(180,1200).perform();
        Thread.sleep(3000);


    }

    public void openGL() throws InterruptedException {

        homePageTap(graphics,"Graphics");
        scroll("OpenGL ES");
    homePageTap(Opentouchrotate,"Touch Rotate");
    Thread.sleep(2000);
    act.press(120,503).moveTo(312,519).release().perform();
    Thread.sleep(3000);
        act.press(120,503).moveTo(312,519).release().perform();

    }

    public void pattern() throws InterruptedException {
        homePageTap(graphics,"Graphics");
        scroll("Patterns");
        Thread.sleep(2000);
        act.press(120,503).moveTo(312,1000).release().perform();


    }


    public void fingerPaint() throws InterruptedException {
        homePageTap(graphics,"Graphics");
        scroll("FingerPaint");
        Thread.sleep(2000);
        int x,y,z,a;
        x=120; y=500;z=300;a=1000;

        for(int i =0; i<=10;i++) {
            act.press(x,y).moveTo(z, a).release().perform();
            x+=300; y+=500;

            act.press(400, 1000).moveTo(120, 503).release().perform();
        }

    }


}
