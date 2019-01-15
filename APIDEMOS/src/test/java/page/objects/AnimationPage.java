package page.objects;

import base.MobileAPI;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class AnimationPage extends MobileAPI {

    TouchAction act = new TouchAction(ad);


    @FindBy(xpath = "//android.widget.TextView[@content-desc='Animation']")
    private WebElement animation;

    @FindBy(id="Bouncing Balls")
    private WebElement bouncingBall;

    @FindBy(xpath = "//android.view.ViewGroup[@index='0']")
    private WebElement verifyBouncingBall;

    @FindBy(id = "Cloning")
    private WebElement clonning;

    @FindBy(id="Run")
    private WebElement run;

    @FindBy(id="Default Layout Animations")
    private WebElement defaultLayout;

    @FindBy(id="Add Button")
    private WebElement defaultLayoutButton;

    @FindBy(id="Add Button")
    private WebElement verifydefaultLayoutButton;

    @FindBy(id="Events")
    private WebElement events;

    @FindBy(id="Play")
    private WebElement play;

    @FindBy(id="Cancel")
    private WebElement cancel;

    @FindBy(id="End Immediately")
    private WebElement verifyEvent;

    @FindBy(id="Reversing")
    private WebElement reversing;

    @FindBy(id="Play")
    private WebElement reversePlay;

    @FindBy(id="Reverse")
    private WebElement reverseButton;

    @FindBy(id="Seeking")
    private WebElement seeking;

    @FindBy(id="io.appium.android.apis:id/seekBar")
    private WebElement seekingBar;







    public void bouncingBall() throws InterruptedException {
        animation.click();
        bouncingBall.click();
        Thread.sleep(3000);
        int x =170;
        int y = 486;
        for(int i =0; i <=20; i++){
            act.tap(x,y).perform();
            x+=20;
            y+=30;
        }
        Thread.sleep(3000);
    }

    public WebElement verifyBouncingBall(){
        return verifyBouncingBall;
    }

    public void clonning() throws InterruptedException {
        animation.click();
        clonning.click();
        run.click();
        waitUntilClickable(ad,run);
        run.click();
    }

    public void defaultLayout(){
        animation.click();
        defaultLayout.click();
        for(int i = 0; i<=10;i++){
            defaultLayoutButton.click();
        }
        act.tap(340,396).perform();
        act.tap(496,412).perform();
    }

    public WebElement verifyDefaultLayoutButton(){
        return verifydefaultLayoutButton;
    }

    public void evetns(){
        animation.click();
        events.click();
        play.click();
        //need to work on timming
        cancel.click();
        act.tap(727,272).perform();
    }

    public WebElement verifyEvent(){
        return verifyEvent;
    }

    public void reversing(){
        animation.click();
        reversing.click();
        for(int i =0; i<=5;i++){
        reversePlay.click();
        reverseButton.click();
        }
    }

    public WebElement verifyReverse(){
        return reverseButton;
    }

    public void seeking(){
        animation.click();
        seeking.click();
        Actions actions = new Actions(ad);
        Point from = new Point(272,233);
        Point to = new Point(1030,233);
        //act.tap(272,233).moveTo(1030,233).release().perform();
//        actions.dragAndDrop(from,to).build().perform();



    }


}
