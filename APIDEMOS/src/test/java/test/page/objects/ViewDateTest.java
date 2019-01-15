package test.page.objects;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.ViewDate;
import page.objects.ViewsPage;

public class ViewDateTest extends ViewDate {


    HomePage objHomePage = null;
    ViewsPage objOfViewPage = null;
    ViewDate objOfViewDate = null;


    @BeforeMethod
    public void initializationOfObjects() {
        objHomePage = PageFactory.initElements(ad, HomePage.class);
        objOfViewPage = PageFactory.initElements(ad, ViewsPage.class);
        objOfViewDate = PageFactory.initElements(ad,ViewDate.class);
    }
/*
    @Test
    public void viewDateLocalTest(){
        objOfViewDate.viewDateLocal();
        Assert.assertTrue(objOfViewDate.verifydateLocal().isDisplayed());
    }*/

    @Test
    public void changeDate(){
        objOfViewDate.viewChangeTime();

    }



}
