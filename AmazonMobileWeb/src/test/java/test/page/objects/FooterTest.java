package test.page.objects;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.Footer;
import page.objects.HomePage;
import page.objects.LogIN;

import java.io.FileNotFoundException;

public class FooterTest extends Footer {


    HomePage objOfHomePage=null;
    Footer objofFooter = null;


    @BeforeMethod
    public void initializationOfElemenets(){
        objofFooter = PageFactory.initElements(ad, Footer.class);
        objOfHomePage =PageFactory.initElements(ad,HomePage.class);

    }

/*
    @Test
    public void scrollTest() throws InterruptedException {
        objofFooter.scrollDown();
        Assert.assertTrue(objOfHomePage.verifyLogo().isDisplayed());

    }

    @Test
    public void deviceBehaviorTest(){
        objofFooter.deviceBehavior();
    }
*/
@Test
    public void refreshPageTest() throws InterruptedException {

    objofFooter.refreshPage();
}


}
