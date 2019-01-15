package test.page.objects;

import base.MobileAPI;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;

public class HomePageTest extends MobileAPI {


    HomePage objOfHomePage= null;

    @BeforeMethod
    public void initializationOfElements(){
        objOfHomePage = PageFactory.initElements(ad,HomePage.class);

    }


    @Test
    public void signInTest()  {
        objOfHomePage.signIn();
        Assert.assertTrue(objOfHomePage.verifyLogo().isDisplayed());
    }


    @Test
    public void burgerbuttonTest(){
        objOfHomePage.burgerButton();
//        ad.navigate().back();
        Assert.assertTrue(objOfHomePage.verifyLogo().isEnabled());


    }

    @Test
    public void cartButtonTest(){
        objOfHomePage.cartButton();
        Assert.assertTrue(objOfHomePage.verifyLogo().isDisplayed());

    }


    @Test
    public void dealsTest(){
        objOfHomePage.deals();
        Assert.assertTrue(objOfHomePage.verifyLogo().isDisplayed());

    }


    @Test
    public void wholeFoodTest(){
        objOfHomePage.wholeFoods();
        Assert.assertTrue(objOfHomePage.verifyLogo().isDisplayed());

    }


    @Test
    public void primeTest(){
        objOfHomePage.prime();
        Assert.assertTrue(objOfHomePage.verifyLogo().isDisplayed());

    }


    @Test
    public void freshTest(){
        objOfHomePage.fresh();
//        Assert.assertTrue(objOfHomePage.verifyLogo().isDisplayed());

    }

    @Test
    public void videoTest(){
        objOfHomePage.video();
        Assert.assertTrue(objOfHomePage.verifyLogo().isDisplayed());

    }

    @Test
    public void musicTest(){
        objOfHomePage.music();
        Assert.assertTrue(objOfHomePage.verifyLogo().isDisplayed());

    }

    @Test
    public void searchBoxTest() throws InterruptedException {
    objOfHomePage.searchTextBox("MacBook");
    //Thread.sleep(3000);
    //objOfHomePage.clickSearchIcon();
        objOfHomePage.searchMagnifyIcon();
    Assert.assertTrue(objOfHomePage.verifyLogo().isDisplayed());

}


    @Test
    public void selectLocationTest(){
        objOfHomePage.selectLocation();
        Assert.assertTrue(objOfHomePage.verifyLogo().isDisplayed());

    }


}
