package test.page.objects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.ViewsPage;

public class ViewPageTest extends ViewsPage {

    HomePage objHomePage = null;
    ViewsPage objOfViewPage = null;
    @BeforeMethod
    public void initializationOfObjects() {
        objHomePage = PageFactory.initElements(ad, HomePage.class);
        objOfViewPage = PageFactory.initElements(ad, ViewsPage.class);
    }
/*
    @Test
    public void viewAnimationTest(){
        objOfViewPage.viewAnimation();
        Assert.assertTrue(objOfViewPage.verification().isDisplayed());
    }

    @Test
    public void viewInterpolatorTest(){
        objOfViewPage.viewInterpolator();
        Assert.assertTrue(objOfViewPage.verification().isDisplayed());
    }

    @Test
    public void viewAutocompleteTest() throws InterruptedException {
        objOfViewPage.viewAutoComplete();
        Assert.assertTrue(objOfViewPage.verificationAutocomplete().isDisplayed());
    }*/



}
