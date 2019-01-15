package test.page.objects;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;

public class HomePageTest extends MobileAPI {
    HomePage objHomePage;

    @BeforeMethod
    public void initializationOfObjects() {
        objHomePage = PageFactory.initElements(ad, HomePage.class);
    }

/**
* In the home page test, assert true used for all assertion.
* verifying from the element which appear in next page. using it with isdisplayed method
* */



    @Test
    public void animationTest(){
        objHomePage.animatonTap();
        Assert.assertTrue(objHomePage.VerifyAnimation().isDisplayed());

    }


    @Test
    public void accessibilityTest(){
        objHomePage.accessibilityTap();
        Assert.assertTrue(objHomePage.Verifyaccessibility().isDisplayed());

    }

    @Test
    public void appTest(){
        objHomePage.appTap();
        Assert.assertTrue(objHomePage.VerifyApp().isDisplayed());

    }

    @Test
    public void contentTest(){
        objHomePage.contentTap();
        Assert.assertTrue(objHomePage.VerifyContent().isDisplayed());

    }


    @Test
    public void graphicsTest(){
        objHomePage.graphicsTap();
        Assert.assertTrue(objHomePage.VerifyGraphics().isDisplayed());

    }


    @Test
    public void mediaTap(){
        objHomePage.mediaTap();
        Assert.assertTrue(objHomePage.VerifyMedia().isDisplayed());

    }


    @Test
    public void nfcTest(){
        objHomePage.nfcTap();
        Assert.assertTrue(objHomePage.VerifyNfc().isDisplayed());

    }

    @Test
    public void osTest(){
        objHomePage.osTap();
        Assert.assertTrue(objHomePage.VerifyOS().isDisplayed());

    }

    @Test
    public void preferenceTest(){
        objHomePage.preferenceTap();
        Assert.assertTrue(objHomePage.VerifyPreference().isDisplayed());

    }
    @Test
    public void textTest(){
        objHomePage.textTap();
        Assert.assertTrue(objHomePage.VerifyText().isDisplayed());

    }

    @Test
    public void viewsTest(){
        objHomePage.viewsTap();
        Assert.assertTrue(objHomePage.VerifyViews().isDisplayed());

    }


}
