package test.page.objects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.AnimationPage;

public class AnimationPageTest extends AnimationPage {

    AnimationPage objofAnimationPage = null;

    @BeforeMethod
    public void initializationOfObject(){
        objofAnimationPage = PageFactory.initElements(ad,AnimationPage.class);
    }


    @Test
    public void bouncingBallTest() throws InterruptedException {
        objofAnimationPage.bouncingBall();
        Assert.assertTrue(objofAnimationPage.verifyBouncingBall().isDisplayed());
    }

/*
    @Test
    public void clonningTest() throws InterruptedException {
        objofAnimationPage.clonning();

    }



    @Test
    public void defaultlayoutTest(){
        objofAnimationPage.defaultLayout();
        Assert.assertTrue(objofAnimationPage.verifyBouncingBall().isEnabled());
    }


    @Test
    public void eventsTest(){
        objofAnimationPage.evetns();
        Assert.assertTrue(objofAnimationPage.verifyEvent().isEnabled());
    }



    @Test
    public void reverseTest(){
        objofAnimationPage.reversing();
        Assert.assertTrue(objofAnimationPage.verifyReverse().isDisplayed());


    }


    @Test
    public void seeking(){
        objofAnimationPage.seeking();
    }

*/



}
